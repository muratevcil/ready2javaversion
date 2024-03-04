package ready2.javaversion.infrastructure.Tournament.adapters;

import ready2.javaversion.domain.data.entities.TournamentDTO;
import ready2.javaversion.domain.ports.spi.TournamentSPI.TournamentCRUDService;

import java.util.List;

public class TournamentCRUDAdapter implements TournamentCRUDService {
    @Override
    public Boolean checkTournamentCreationValidity(TournamentDTO tournamentDTO) {
        return null;
    }

    @Override
    public TournamentDTO createTournament(TournamentDTO tournamentDTO) {
        return null;
    }

    @Override
    public void deleteTournament(String tournamentId) {

    }

    @Override
    public TournamentDTO updateTournament(TournamentDTO tournamentDTO) {
        return null;
    }

    @Override
    public List<TournamentDTO> getAllTournaments() {
        return null;
    }
}
