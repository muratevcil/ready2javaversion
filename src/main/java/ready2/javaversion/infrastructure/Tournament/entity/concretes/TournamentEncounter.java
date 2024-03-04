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
@Table(name="encounters")
public class TournamentEncounter {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentEncounterId;

    @OneToMany
    @JoinColumn(name="encounter_player_ids")
    private List<TournamentUser> tournamentEncounterPlayers;

    @OneToMany
    @JoinColumn(name="encounter_team_ids")
    private List<TournamentTeam> tournamentTeams;

    @OneToOne
    @JoinColumn(name="encounter_winner_team_id")
    private TournamentTeam tournamentEncounterWinnerTeam;

    @OneToOne
    @JoinColumn(name="encounter_mvp_id")
    private TournamentUser tournamentEncounterMvp;

}
