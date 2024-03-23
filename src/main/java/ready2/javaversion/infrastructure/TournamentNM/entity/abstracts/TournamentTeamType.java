package ready2.javaversion.infrastructure.TournamentNM.entity.abstracts;

public enum TournamentTeamType {

    OneVOne(0),
    TwoVTwo(1),
    ThreeVThree(2),
    FourVFour(3),
    FiveVFive(4);

    private int value;

    private TournamentTeamType(int value){
        this.value = value;
    }

    private int getValue(){
        return this.value;
    }

}
