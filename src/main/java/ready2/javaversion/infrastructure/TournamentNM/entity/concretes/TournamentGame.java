package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameId;

    @Column(name="game_name")
    private String gameName;

    @Column(name="game_slug")
    private String gameSlug;

    @OneToMany(mappedBy = "game")
    private List<Tournament> gamesTournaments;

}
