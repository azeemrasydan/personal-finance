package azeem.play.finance;

public class Cash extends Asset {
    public Cash(double value) {
        super("Cash", value, AssetType.CASH);
    }

    public void add(double cashValue) {
        value += cashValue;
    }

    public void minus(double cashValue) {
        value -= cashValue;
    }
}
