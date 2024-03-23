package ready2.javaversion.infrastructure.TournamentNM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentStage;

public interface TournamentStageRepository extends JpaRepository<TournamentStage,String> {


    @Query(value="SELECT COUNT(*) FROM tournament_stages AS TS WHERE TS.tournament_id = :tournament_id"
            ,nativeQuery = true)
    int getTournamentStageCount(
            @Param("tournament_id") String tournamentUUID
    );

}
