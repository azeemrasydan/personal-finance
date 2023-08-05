export interface ICashFlowConstructor {
    amount: number;
    dateOfOccurence: Date;
}

export class CashFlow {
    private _amount: number;
    private _dateOfOccurence: Date;

    public constructor({
        amount,
        dateOfOccurence
    }: ICashFlowConstructor
    ) {
        this._amount = amount;
        this._dateOfOccurence = dateOfOccurence;
    }

    public getAmount(): number {
        return this._amount;
    }

    public getDateOfOccurence(): Date {
        return this._dateOfOccurence;
    }

}