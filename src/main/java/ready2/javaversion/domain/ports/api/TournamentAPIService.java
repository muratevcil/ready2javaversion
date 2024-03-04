package ready2.javaversion.domain.ports.api;

import ready2.javaversion.domain.data.entities.TournamentDTO;
import ready2.javaversion.domain.data.responses.GetAllTournamentsResponse;

import java.util.List;

public interface TournamentAPIService {
    Boolean checkTournamentCreationValidity(TournamentDTO tournamentDTO);
    TournamentDTO createTournament(TournamentDTO tournamentDTO);
    void deleteTournament(String tournamentId);
    TournamentDTO updateTournament(TournamentDTO tournamentDTO);
    List<GetAllTournamentsResponse> getAllTournaments();

}
