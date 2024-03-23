package ready2.javaversion.infrastructure.TournamentNM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;

import java.util.Date;
import java.util.List;

public interface TournamentRepository extends JpaRepository<Tournament,String> {


    @Override
    boolean existsById(String tournamentId);

    @Query(value="SELECT * FROM tournaments;"
            ,nativeQuery = true)
    List<Tournament> getAllTournaments();

    @Query(value="SELECT * FROM tournaments AS T where T.tournament_hub_id == :hubId;",
            nativeQuery = true)
    List<Tournament> findTournamentsByHub(
            @Param("hubId") String hubId
    );

    @Query(value="SELECT * FROM tournaments AS T WHERE T.game_id ==" +
            " (SELECT game_id FROM tournament_game AS TG WHERE TG.game_slug == :gameSlug);",
            nativeQuery = true)
    List<Tournament> findTournamentsByGame(
            @Param("gameSlug") String gameSlug
    );

    @Query(value = "SELECT tournament_user_id FROM TournamentsUsers AS TU WHERE TU.tournament_id = :tournament_id;",
            nativeQuery = true)
    List<String> getTournamentsUsersByTournamentId(
            @Param("tournament_id") String tournamentId
    );

    @Query(value = "SELECT * FROM tournaments AS T WHERE T.tournament_uuıd = (" +
            "SELECT tournament_id FROM tournaments_users AS TUS WHERE TUS.tournament_user_id = :user_uuıd);",
            nativeQuery = true)
    List<Tournament> getTournamentsByUserId(
            @Param("user_uuıd") String userUUID);


    @Query(value = "SELECT * FROM tournaments AS T WHERE T.tournament_uuıd = :tournament_id",nativeQuery = true)
    Tournament getTournamentByTournamentUUID(
            @Param("tournament_id") String tournamentUUID);

}
