interface IProfileConstructor {
  name?: string;
  dateOfBirth?: Date;
}
export class Profile {
  private _name?: string;

  constructor();
  constructor(profileConstructor?:
    IProfileConstructor

  ) {
    this._name = profileConstructor?.name;
  }

  public getName(): string {
    return this._name ?? "Anonymous";
  }

}
