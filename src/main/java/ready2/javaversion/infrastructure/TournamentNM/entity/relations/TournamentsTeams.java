package ready2.javaversion.infrastructure.TournamentNM.entity.relations;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tournament_teams")
public class TournamentsTeams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tournament_teams_relation_id")
    private int tournamentTeamsRelationId;



}
