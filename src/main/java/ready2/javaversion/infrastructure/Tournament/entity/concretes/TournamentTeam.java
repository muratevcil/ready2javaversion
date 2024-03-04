package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TournamentTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentTeamId;

    private String tournamentTeamName;

    private String tournamentTeamCatchPhrase;

    @OneToMany
    @JoinColumn(name="tournament_team_ids")
    private List<TournamentUser> tournamentTeamUsers;




}
