package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageNum;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentTeamType;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentUserLimit;
import ready2.javaversion.infrastructure.TournamentNM.entity.relations.TournamentsUsers;


import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tournaments")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="tournament_uuıd")
    private String tournamentUUID;

    @Column(name="tournament_name")
    private String tournamentName;

    @Column(name="tournament_description")
    private String tournamentDescription;

    @ManyToOne
    @JoinColumn(name="game_id")
    private TournamentGame game;

    private TournamentDates tournamentDates;

    private TournamentStageNum tournamentStageNum;

    private TournamentUserLimit tournamentUserLimit;

    private Double tournamentPrizePool;

    private TournamentTeamType tournamentTeamType;

    @OneToMany(mappedBy = "tournament")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TournamentStage> tournamentStageList;

    @OneToMany(mappedBy = "tournament")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TournamentGroup> tournamentGroupList;

    @OneToMany(mappedBy = "tournament")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TournamentEncounter> tournamentEncounter;

    @ManyToOne
    @JoinColumn(name="tournament_hub_id")
    private TournamentHub hub;

    @OneToMany(mappedBy = "tournament")
    private List<TournamentsUsers> users;




    public String getTournamentUUID(){
        return this.tournamentUUID;
    }
    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentUUID='" + tournamentUUID + '\'' +
                ", tournamentName='" + tournamentName + '\'' +
                ", tournamentDescription='" + tournamentDescription + '\'' +
                ", game=" + game +
                ", tournamentDates=" + tournamentDates +
                ", tournamentStageNum=" + tournamentStageNum +
                ", tournamentTeamType=" + tournamentTeamType +
                ", tournamentStageList=" + tournamentStageList +
                ", tournamentGroupList=" + tournamentGroupList +
                ", tournamentEncounter=" + tournamentEncounter +
                ", hub=" + hub +
                ", users=" + users +
                '}';
    }
}
