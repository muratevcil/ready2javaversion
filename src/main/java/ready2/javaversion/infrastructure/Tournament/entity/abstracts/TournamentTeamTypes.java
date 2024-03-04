package ready2.javaversion.infrastructure.Tournament.entity.abstracts;

public enum TournamentTeamTypes {
    OneVOne(1),
    TwoVTwo(2),
    ThreeVThree(3),
    FourVFour(4),
    FiveVFive(5);

    private int value;

    private TournamentTeamTypes(int value){
        this.value = value;
    }

    private int getValue(){
        return this.value;
    }
}
