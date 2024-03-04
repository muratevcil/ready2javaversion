package ready2.javaversion.infrastructure.Tournament.entity.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.Tournament.entity.concretes.TournamentGroup;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tournament_stages")
public class TournamentStage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tournamentStageId;

    @OneToMany
    @JoinColumn(name="group_ids")
    private List<TournamentGroup> groupList;

    @ManyToOne
    @JoinColumn(name="stage_type_id")
    private TournamentStageTypes tournamentStageType;

    @OneToMany
    @JoinColumn(name="stage_user_ids")
    private List<TournamentUser> tournamentUserList;
}
