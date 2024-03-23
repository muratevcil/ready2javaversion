package ready2.javaversion.infrastructure.TournamentNM.entity.relations;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentUser;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TournamentsUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name="tournament_user_id")
    private TournamentUser tournamentUser;

}
