package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tournament_encounters")
public class TournamentEncounter {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentEncounterUUID;

    @ManyToOne
    @JoinColumn(name="tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name="tournament_stage_id")
    private TournamentStage tournamentStage;

    @ManyToOne
    @JoinColumn(name="tournament_group_id")
    private TournamentGroup tournamentGroup;

}
