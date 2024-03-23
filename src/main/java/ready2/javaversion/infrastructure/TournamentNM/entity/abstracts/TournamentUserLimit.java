package ready2.javaversion.infrastructure.TournamentNM.entity.abstracts;

public enum TournamentUserLimit {
    ONEHUNDREDTWENTYEIGHT(128),
    SIXTYFOUR(64),
    THIRTYTWO(32),
    SIXTEEN(16),
    EIGTH(8),
    FOUR(4),
    TWO(2);

    int value;
    TournamentUserLimit(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

}
