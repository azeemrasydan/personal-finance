package azeem.play.models;

import java.util.Date;

public class PersonalFinancialSimulation {

    private Date _startDate;
    private Person _person;
    public PersonalFinancialSimulation(final Person person){
        _person = person;
    }

    public void registerStartDate(Date startDate){
        _startDate  = startDate;
    }

    public void simulate(){
        Date startDate = _startDate;

        
    }
}
