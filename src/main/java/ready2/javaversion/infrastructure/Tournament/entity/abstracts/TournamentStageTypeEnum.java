package ready2.javaversion.infrastructure.Tournament.entity.abstracts;

public enum TournamentStageTypeEnum {
    SWISS(1),
    DOUBLE_ELIMINATION(2),
    SINGLE_ELIMINATION(3),
    ROUND_ROBIN(4);
    public int value;
    private TournamentStageTypeEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
