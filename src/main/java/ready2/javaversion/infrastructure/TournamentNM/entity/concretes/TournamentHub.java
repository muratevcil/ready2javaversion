package ready2.javaversion.infrastructure.TournamentNM.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tournament_hubs")
public class TournamentHub {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentHubUUID;

    @OneToMany(mappedBy = "hub")
    private List<Tournament> tournamentList;

    private String hubName;

}
