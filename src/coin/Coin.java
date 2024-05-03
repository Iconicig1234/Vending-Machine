package coin;

public enum Coin {
    ONE(1),
    TWO(2),
    THREE(3),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    HUNDRED(100);

    private final int value;
    Coin(int value){
        this.value = value;
    }

    public int get_value(){
        return this.value;
    }
}
