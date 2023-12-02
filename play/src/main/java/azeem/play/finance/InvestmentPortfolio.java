package azeem.play.finance;

import java.util.ArrayList;
import java.util.List;

public class InvestmentPortfolio {
    private List<Investment> _investments = new ArrayList<>();

    public InvestmentPortfolio() {
    }

    public InvestmentPortfolio(List<Investment> investments) {
        this._investments = investments;
    }

    public List<Investment> investments() {
        return _investments;
    }

    public void addInvestment(Investment investment) {
        _investments.add(investment);
    }

    public void sellInvestment(Investment investment) {
        _investments.remove(investment);
    }
}
