package ready2.javaversion.domain.utils.objectmapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ready2.javaversion.domain.data.Tournament.responses.GetAllTournamentsResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentDTO;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentCommand;
import ready2.javaversion.infrastructure.TournamentNM.entity.concretes.Tournament;

import java.util.List;

@Mapper
public interface TournamentMapper {

    TournamentMapper INSTANCE = Mappers.getMapper(TournamentMapper.class);

    TournamentDTO tournamentToTournamentDto(Tournament tournament);

    Tournament tournamentDtoToTournament(TournamentDTO tournamentDto);

    List<TournamentDTO> listOfTournamentToListOfTournamentDto(List<Tournament> tournamentList);

    List<Tournament> listOfTournamentDtoToListOfTournament(List<TournamentDTO> tournamentDTOList);

    Tournament createTournamentCommandToTournament(CreateTournamentCommand createTournamentCommand);

    GetAllTournamentsResponse tournamentTogetAllTournamentsResponse(GetAllTournamentsResponse getAllTournamentsResponse);

}
