package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import jakarta.persistence.*;
import lombok.*;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tournament_stages")
@Getter
@Setter
public class TournamentStage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentStageUUID;

    @ManyToOne
    @JoinColumn(name="tournament_id")
    private Tournament tournament;

    @Column(name="tournament_stage_name")
    private String tournamentStageName;

    @Column(name="tournament_stage_description")
    private String tournamentStageDescription;

    @Column(name="tournament_stage_type")
    private TournamentStageType tournamentStageType;

    @OneToMany(mappedBy = "tournamentStage")
    private List<TournamentGroup> tournamentGroupList;

    @OneToMany(mappedBy = "tournamentStage")
    private List<TournamentEncounter> tournamentEncounterList;


    public TournamentStage(Tournament tournament,
                           TournamentStageType tournamentStageType,
                           String tournamentStageName,
                           String tournamentStageDescription){
        this.tournament = tournament;
        this.tournamentStageType = tournamentStageType;
        this.tournamentStageName = tournamentStageName;
        this.tournamentStageDescription = tournamentStageDescription;
    }

    @Override
    public String toString() {
        return "TournamentStage{" +
                "tournamentStageUUID='" + tournamentStageUUID + '\'' +
                ", tournament=" + tournament +
                ", tournamentStageType=" + tournamentStageType +
                ", tournamentGroupList=" + tournamentGroupList +
                ", tournamentEncounterList=" + tournamentEncounterList +
                '}';
    }
}
