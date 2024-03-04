package ready2.javaversion.infrastructure.Tournament.entity.abstracts;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public enum TournamentStageNums{
    SINGLE_STAGE(1),
    DOUBLE_STAGE(2),
    THREE_STAGE(3);
    private int value;
    private TournamentStageNums(int value){
        this.value = value;
    }

    private int getValue(){
        return this.value;
    }
}
