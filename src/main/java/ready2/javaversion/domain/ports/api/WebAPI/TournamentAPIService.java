package ready2.javaversion.domain.ports.api.WebAPI;

import org.springframework.stereotype.Service;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentStageCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetTournamentByIdResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentDTO;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetAllTournamentsResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentStageDTO;

import java.util.List;


@Service
public interface TournamentAPIService {
    boolean checkTournamentCreationValidity(TournamentDTO tournamentDTO);
    TournamentDTO createTournament(CreateTournamentCommand createTournamentCommand);

    TournamentStageDTO createTournamentStage(CreateTournamentStageCommand createTournamentStageCommand);
    void deleteTournament(String tournamentId);
    TournamentDTO updateTournament(TournamentDTO tournamentDTO);
    List<GetAllTournamentsResponse> getAllTournaments();
    GetTournamentByIdResponse getTournamentById(String tournamentId);

}
