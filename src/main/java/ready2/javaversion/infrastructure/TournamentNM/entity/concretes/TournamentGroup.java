package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tournament_groups")
public class TournamentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="tournament_group_id")
    private String tournamentGroup;

    @OneToMany(mappedBy = "tournamentGroup")
    private List<TournamentEncounter> tournamentEncounterList;

    @ManyToOne
    @JoinColumn(name="tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name="tournament_stage_id")
    private TournamentStage tournamentStage;

}
