package ready2.javaversion.domain.data.Tournament.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentGroupDTO {

    private String groupUUID;

    private List<TournamentEncounterDTO> groupEncounters;

}
