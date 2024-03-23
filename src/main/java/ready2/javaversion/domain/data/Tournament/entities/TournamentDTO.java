package ready2.javaversion.domain.data.Tournament.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentStageType;
import ready2.javaversion.infrastructure.TournamentNM.entity.abstracts.TournamentTeamType;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.*;
import ready2.javaversion.infrastructure.TournamentNM.entity.relations.TournamentsUsers;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentDTO {

    private String tournamentUUID;

    private String tournamentName;

    private String tournamentDescription;

    private int gameId;

    private TournamentDates tournamentDates;

    private TournamentTeamType tournamentTeamType;

    private List<TournamentStage> tournamentStageList;

    private List<TournamentGroup> tournamentGroupList;

    private List<TournamentEncounter> tournamentEncounter;

    private String hubUUID;

    private List<String> tournamentUserIds;

}
