package azeem.play.utility;

public class Finance {

    public static class AnnualRateToMethods {
        private double _rate;

        public AnnualRateToMethods(final double rate){
            _rate = rate;
        }

        public double toCompoundingDailyRate(){
            return Math.pow(1 + (_rate / 100), 1.0 / 365) - 1;
        }
    }

    public static AnnualRateToMethods convertAnnualRate(final double rate){
        return new AnnualRateToMethods(rate);
    }   
}
