package ready2.javaversion.domain.ports.spi.TournamentSPI;

import lombok.AllArgsConstructor;
import ready2.javaversion.domain.data.entities.TournamentDTO;

import java.util.List;


public interface TournamentCRUDService {

    Boolean checkTournamentCreationValidity(TournamentDTO tournamentDTO);
    TournamentDTO createTournament(TournamentDTO tournamentDTO);
    void deleteTournament(String tournamentId);
    TournamentDTO updateTournament(TournamentDTO tournamentDTO);
    List<TournamentDTO> getAllTournaments();

}
