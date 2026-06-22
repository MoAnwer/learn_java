package enums;

 enum Coin {
    PENNY(1), 
    NICKEL(5), 
    DIME(10), 
    QUARTER(25);
    
    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Test {
    public static void main(String[] args) {
        int p = Coin.NICKEL.getValue();
        IO.println(p);
    }
}
