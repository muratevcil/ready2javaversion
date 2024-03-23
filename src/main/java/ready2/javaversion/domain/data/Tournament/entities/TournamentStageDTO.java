package ready2.javaversion.domain.data.Tournament.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.TournamentStage;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentStageDTO {


    private String tournamentStageUUID;

    private TournamentStageType tournamentStageType;

    private String tournamentStageDescription;

    private String tournamentStageName;

    private List<TournamentGroupDTO> stageGroups;

}
