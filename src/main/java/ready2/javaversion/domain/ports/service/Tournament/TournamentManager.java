package ready2.javaversion.domain.ports.service.Tournament;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentStageCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetTournamentByIdResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentDTO;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetAllTournamentsResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentStageDTO;
import ready2.javaversion.domain.ports.api.WebAPI.TournamentAPIService;
import ready2.javaversion.domain.ports.spi.TournamentSPI.TournamentCRUDService;
import java.util.List;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class TournamentManager implements TournamentAPIService {

    @Autowired
    private TournamentCRUDService tournamentCRUDService;
    @Override
    public boolean checkTournamentCreationValidity(TournamentDTO tournamentDTO) {
        return false;
    }

    @Override
    public TournamentDTO createTournament(CreateTournamentCommand createTournamentCommand) {
        return this.tournamentCRUDService.createTournament(createTournamentCommand);
    }

    @Override
    public TournamentStageDTO createTournamentStage(CreateTournamentStageCommand createTournamentStageCommand) {
        return this.tournamentCRUDService.createTournamentStage(createTournamentStageCommand);
    }

    ;

    @Override
    public void deleteTournament(String tournamentId) {

    }

    @Override
    public TournamentDTO updateTournament(TournamentDTO tournamentDTO) {
        return null;
    }

    @Override
    public List<GetAllTournamentsResponse> getAllTournaments() {
        return this.tournamentCRUDService.getAllTournaments();
    }

    @Override
    public GetTournamentByIdResponse getTournamentById(String tournamentId) {
        return this.tournamentCRUDService.getTournamentById(tournamentId);
    }
}
