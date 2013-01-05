package Shop.Office.Conditions;

import Shop.Office.Persons.Person;

public class GetByPeselCondition extends Condition<Person>{

	private String pesel;

	public GetByPeselCondition(String pesel)
	{
		this.pesel=pesel;
	}

	
	public boolean check(Person obj) {

		return obj.getPesel().equalsIgnoreCase(pesel);
	}

}