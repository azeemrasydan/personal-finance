package azeem.play.models;

public class Cash extends Asset {
    public Cash(double value) {
        super("Cash", value, new AssetType("Cash"));
    }

    public void add(double cashValue) {
        value += cashValue;
    }

    public void minus(double cashValue) {
        value -= cashValue;
    }
}
