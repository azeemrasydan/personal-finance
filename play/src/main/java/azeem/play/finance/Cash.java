package azeem.play.finance;

import azeem.play.world.World;

public class Cash extends Asset {
    private double _annualInflation = 4;

    public Cash(double value, World world) {
        super("Cash", value, AssetType.CASH, world);
    }

    public void add(double cashValue) {
        value += cashValue;
    }

    public void minus(double cashValue) {
        value -= cashValue;
    }

    private void applyInflation() {
        int month = world.currentDateTime().getMonth().getValue();
        int day = world.currentDateTime().getDayOfMonth();

        boolean currentTimeIsFirstJanuary = month == 1 && day == 1;

        if (currentTimeIsFirstJanuary) {
            value -= value * _annualInflation / 100;
        }
    }

    @Override
    public void onDayPassed() {
        applyInflation();
    }
}
