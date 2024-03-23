package ready2.javaversion.infrastructure.TournamentNM.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentStageCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetTournamentByIdResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentDTO;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentCommand;
import ready2.javaversion.domain.data.Tournament.entities.TournamentStageDTO;
import ready2.javaversion.domain.ports.spi.TournamentSPI.TournamentCRUDService;
import ready2.javaversion.domain.utils.modelmapper.ModelMapperService;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentStage;
import ready2.javaversion.infrastructure.TournamentNM.repository.TournamentRepository;
import ready2.javaversion.domain.data.Tournament.responses.GetAllTournamentsResponse;
import ready2.javaversion.infrastructure.TournamentNM.repository.TournamentStageRepository;
import ready2.javaversion.infrastructure.TournamentNM.rules.TournamentBusinessRules;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TournamentCRUDManager implements TournamentCRUDService {

    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private ModelMapperService modelMapperService;
    @Autowired
    private TournamentBusinessRules tournamentBusinessRules;
    @Autowired
    private TournamentStageRepository tournamentStageRepository;
    @Override
    public TournamentDTO createTournament(CreateTournamentCommand createTournamentCommand) {
        Tournament tournament = this.modelMapperService.forRequest().map(createTournamentCommand,Tournament.class);
        this.tournamentRepository.save(tournament);
        TournamentDTO tournamentDTO = this.modelMapperService.forResponse().map(tournament,TournamentDTO.class);
        return tournamentDTO;
    }

    @Override
    public TournamentStageDTO createTournamentStage(CreateTournamentStageCommand createTournamentStageCommand) {

        this.tournamentBusinessRules.checkIfTournamentExistsById(createTournamentStageCommand.getTournamentId());

        this.tournamentBusinessRules.checkIfTournamentStageCreatable(createTournamentStageCommand.getTournamentId());

        Tournament tournament = this.tournamentRepository.getTournamentByTournamentUUID(createTournamentStageCommand.getTournamentId());

        List<TournamentStage> tournamentStageList = tournament.getTournamentStageList();

        TournamentStage tournamentStage = new TournamentStage(tournament,
                TournamentStageType.valueOf(createTournamentStageCommand.getTournamentStageType()),
                createTournamentStageCommand.getTournamentStageName(),
                createTournamentStageCommand.getTournamentStageDescription());

        tournamentStageList.add(tournamentStage);

        tournament.setTournamentStageList(tournamentStageList);

        this.tournamentRepository.save(tournament);

        this.tournamentStageRepository.save(tournamentStage);

        return this.modelMapperService.forResponse().map(tournamentStage,TournamentStageDTO.class);
    }

    @Override
    public void deleteTournament(String tournamentId) {

    }

    @Override
    public TournamentDTO updateTournament(TournamentDTO tournamentDTO) {
        return null;
    }

    @Override
    public TournamentDTO findTournamentById(String tournamentId) {
        return null;
    }

    @Override
    public List<GetAllTournamentsResponse> getAllTournaments() {

        List<Tournament> tournaments = tournamentRepository.getAllTournaments();
        List<GetAllTournamentsResponse> getAllTournamentsResponses = tournaments.stream().map(tournament->this.modelMapperService.forResponse().map(tournament,GetAllTournamentsResponse.class)).collect(Collectors.toList());
        return getAllTournamentsResponses;

    }

    @Override
    public GetTournamentByIdResponse getTournamentById(String tournamentId) {
        Tournament tournament = tournamentRepository.getTournamentByTournamentUUID(tournamentId);
        GetTournamentByIdResponse getTournamentByIdResponse = this.modelMapperService.forResponse().map(tournament,GetTournamentByIdResponse.class);
        return getTournamentByIdResponse;
    };
}

