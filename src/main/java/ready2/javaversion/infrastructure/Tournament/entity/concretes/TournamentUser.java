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
@Table(name="tournament_users")
@Builder
public class TournamentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tournamentUserId;

    private String tournamentUserNickName;

    private String tournamentUserFullName;

    private int tournamentUserAge;

    @ManyToOne
    @JoinColumn(name="player_country")
    private Country tournamentUserCountry;



}
