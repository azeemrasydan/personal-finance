package azeem.play.models;

import java.util.Date;

public class Investment {
    private String _name;
    private double _initialValue;
    private double _risk;
    private Double _dividend; 
    private Double _appreciationRate; 
    private Double _valuation; 
    private Date _purchaseDate;

    public Investment() {
    }

    public Investment(String name, double initialValue, double risk, Double dividend,
                      Double appreciationRate, Double valuation, Date purchaseDate) {
        this._name = name;
        this._initialValue = initialValue;
        this._risk = risk;
        this._dividend = dividend;
        this._appreciationRate = appreciationRate;
        this._valuation = valuation;
        this._purchaseDate = purchaseDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double initialValue() {
        return _initialValue;
    }

    public double getRisk() {
        return _risk;
    }

    public void changeRisk(double risk) {
        this._risk = risk;
    }

    public Double dividend() {
        return _dividend;
    }

    public void changeDividend(Double dividend) {
        this._dividend = dividend;
    }

    public Double appreciationRate() {
        return _appreciationRate;
    }

    public void changeAppreciationRate(Double appreciationRate) {
        this._appreciationRate = appreciationRate;
    }

    public Double valuation() {
        return _valuation;
    }

    public Date purchaseDate() {
        return _purchaseDate;
    }

}
