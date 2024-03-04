package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="game")
public class TournamentGame {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String gameId;

    private String gameName;

}
