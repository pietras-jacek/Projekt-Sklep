package Shop.Office.Conditions;

import Shop.Office.Persons.Person;

public class GetByAddressCondition extends Condition<Person>{

	private String address;

	public GetByAddressCondition(String address)
	{
		this.address=address;
	}
	
	public boolean check(Person obj) {
		// TODO Auto-generated method stub
		return obj.getAddress().equalsIgnoreCase(address);
	}

}
