import { Component, ElementRef, ViewChild } from '@angular/core';

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
  public cashFlowType?: string;
  public affordabilityResult: boolean = false;
  public cashFlowTypes?: string[];
  public cashFlowDateFrom?: Date;
  public cashFlowDateTo?: Date;
  public periodType?: string;
  public periodTypes;
  @ViewChild('scrollableContainer', { static: false }) scrollableContainer?: ElementRef<HTMLDivElement>;

  constructor() {
    this.cashFlowTypes = ["Income", "Expenses", "Debt"]
    this.cashFlowType = "Income";
    this.periodType = "Daily";
    this.periodTypes = [
      { type: "One-time", description: "Cash flow that occurs for 1 time only" },
      { type: "Daily", description: "Cash flows measured on a daily basis" },
      { type: "Weekly", description: "Cash flows aggregated and analyzed on a weekly basis" },
      { type: "Monthly", description: "Cash flows summarized and examined on a monthly basis" },
      { type: "Quarterly", description: "Cash flows assessed on a quarterly basis" },
      { type: "Annually", description: "Cash flows evaluated on an annual basis" }
    ];
  }

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

  scrollLeft() {
    console.log("left")
    console.log(this.scrollableContainer);
    this.scrollableContainer?.nativeElement.scrollTo({ left: (this.scrollableContainer?.nativeElement.scrollLeft - 50), behavior: 'smooth' });
  }

  scrollRight() {
    this.scrollableContainer?.nativeElement.scrollTo({ left: (this.scrollableContainer?.nativeElement.scrollLeft + 50), behavior: 'smooth' });
  }
}
