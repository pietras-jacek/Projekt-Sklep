package Shop.Office.Conditions;

import Shop.Office.Persons.Person;


public class GetByNameCondition extends Condition<Person>{

	private String name;
	
	public GetByNameCondition(String name)
	{
		this.name=name;
	}
	@Override
	public boolean check(Person obj) {
		// TODO Auto-generated method stub
		return obj.getName().equalsIgnoreCase(name);
	}

}
