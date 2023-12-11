package azeem.play.finance;

import azeem.play.utility.Finance;
import azeem.play.world.World;

public class RealEstate extends Asset {

    protected double _annualAppreciationRateInflationExcluded;

    public RealEstate(String name, double value, World world) {
        super(name, value, AssetType.REAL_ESTATE, world);
    }

    /**
     * Annual Appreciation Rate excluding inflation
     * @param rate Annual Apprecation Rate
     */
    public void setAnnualAppreciationRate(double rate){
        _annualAppreciationRateInflationExcluded = rate;
    }

    /**
     * Daily Appreciation Rate  excluding inflation
     * @return Daily Appreciation Rate
     */
    public double dailyAppreciationRate(){
        return Finance.convertAnnualRate(_annualAppreciationRateInflationExcluded).toCompoundingDailyRate();
    }

    private void appreciateRealEstateWithDailyRate(){
        value += value * dailyAppreciationRate();
    }

    @Override
    public void onDayPassed() {
        appreciateRealEstateWithDailyRate();
    }

}
