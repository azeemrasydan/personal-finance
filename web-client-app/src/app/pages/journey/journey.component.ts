import { Component } from '@angular/core';

@Component({
  selector: 'app-journey',
  templateUrl: './journey.component.html',
  styleUrls: ['./journey.component.css']
})
export class JourneyComponent {

  public journeyCreatingShown: boolean = false;

  createAJourneyButtonOnClick() {
    this.journeyCreatingShown = true;
  }

  public annualIncome: number = 0;
  public monthlyDebt: number = 0;
  public interestRate: number = 0;
  public loanTerm: number = 0;
  public showAffordability: boolean = false;
  public affordabilityResult: boolean = false;

  calculateAffordability() {

    const monthlyIncome = this.annualIncome / 12;
    const totalDebt = this.monthlyDebt * 12;
    const monthlyInterestRate = this.interestRate / 100 / 12;
    const loanTermInMonths = this.loanTerm * 12;

    const loanAmount = (monthlyIncome - totalDebt) * (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths)) / monthlyInterestRate;

    this.affordabilityResult = loanAmount > 0;
    this.showAffordability = true;
  }

  parse(value: any): number {
    return parseFloat(value);
  }
}
