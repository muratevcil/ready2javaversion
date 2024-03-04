package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tournament_groups")
public class TournamentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentGroupId;

    @Nullable // for tft and pubg
    @OneToMany
    @JoinColumn(name="group_team_ids")
    private List<TournamentTeam> tournamentTeams;

    @OneToMany
    @JoinColumn(name="group_user_ids")
    private List<TournamentUser> tournamentUsers;


}
