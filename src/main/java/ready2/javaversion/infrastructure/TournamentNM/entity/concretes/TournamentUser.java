package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.TournamentNM.entity.relations.TournamentsUsers;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TournamentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="tournament_user_id")
    private String tournamentUserId;

    @Column
    private String tournamentUserName;

    @OneToMany(mappedBy = "tournamentUser")
    private List<TournamentsUsers> tournamentsUsers;

}
