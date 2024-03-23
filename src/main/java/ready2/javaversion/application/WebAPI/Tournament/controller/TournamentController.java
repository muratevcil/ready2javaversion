package ready2.javaversion.application.WebAPI.Tournament.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentCommand;
import ready2.javaversion.domain.data.Tournament.requests.CreateTournamentStageCommand;
import ready2.javaversion.domain.data.Tournament.responses.GetAllTournamentsResponse;
import ready2.javaversion.domain.data.Tournament.responses.GetTournamentByIdResponse;
import ready2.javaversion.domain.data.Tournament.entities.TournamentDTO;
import ready2.javaversion.domain.data.Tournament.entities.TournamentStageDTO;
import ready2.javaversion.domain.ports.api.WebAPI.TournamentAPIService;

import java.util.List;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private TournamentAPIService tournamentAPIService;

    @GetMapping("/getAllTournaments")
    public List<GetAllTournamentsResponse> getAllTournaments(){

        return this.tournamentAPIService.getAllTournaments();

    }

    @GetMapping("/getTournamentById/{tournamentId}")
    public GetTournamentByIdResponse getTournamentById(@PathVariable String tournamentId){

        return this.tournamentAPIService.getTournamentById(tournamentId);

    }

    @PostMapping("/createTournament")
    @ResponseStatus(code = HttpStatus.CREATED)
    public TournamentDTO createTournament(@RequestBody() CreateTournamentCommand createTournamentCommand,
                                          HttpServletResponse httpServletResponse){
        //  !! It is better to return a data in header,not body !!
        return this.tournamentAPIService.createTournament(createTournamentCommand);

    }

    @PostMapping("/createTournamentStage")
    @ResponseStatus(code = HttpStatus.CREATED)
    public TournamentStageDTO createTournamentStage(@RequestBody() CreateTournamentStageCommand createTournamentStageCommand,
                                                    HttpServletResponse httpServletResponse){

        return this.tournamentAPIService.createTournamentStage(createTournamentStageCommand);

    }

}
// http://localhost:8080/tournament/getAllTournaments