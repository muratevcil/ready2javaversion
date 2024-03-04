package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentDates;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentStageNums;
import ready2.javaversion.infrastructure.Tournament.entity.abstracts.TournamentTeamTypes;

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
    private String tournamentId;

    private String tournamentName;

    @Nullable
    private String tournamentDescription;

    @ManyToOne
    @JoinColumn(name="game_id")
    private TournamentGame tournamentGame;

    private TournamentDates tournamentDates;

    private TournamentStageNums tournamentStageType;

    private TournamentTeamTypes tournamentTeamTypes;

    @OneToMany
    @JoinColumn(name="stage_ids")
    private List<TournamentStage> tournamentStageList;

    @ManyToMany
    @JoinColumn(name="user_ids")
    private List<TournamentUser> tournamentUserList;

    @ManyToMany
    @JoinColumn(name="suspended_user_ids")
    private List<TournamentUser> suspendedUsers;

    @ManyToMany
    @JoinColumn(name="suspended_country_ids")
    private List<Country> suspendedCountries;

}
