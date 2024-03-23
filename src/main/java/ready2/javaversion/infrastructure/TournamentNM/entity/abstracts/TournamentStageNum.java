package ready2.javaversion.infrastructure.TournamentNM.entity.abstracts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum TournamentStageNum {

    OneStage(1),
    TwoStage(2),
    ThreeStage(3);

    int value;
    TournamentStageNum(int value){
        this.value = value;
    }
}
