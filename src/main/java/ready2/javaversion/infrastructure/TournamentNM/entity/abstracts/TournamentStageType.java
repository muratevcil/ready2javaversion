package ready2.javaversion.infrastructure.TournamentNM.entity.abstracts;

public enum TournamentStageType {

    SWISS(1),
    DOUBLE_ELIMINATION(2),
    SINGLE_ELIMINATION(3),
    ROUND_ROBIN(4);
    public int value;
    private TournamentStageType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
