package Shop.Office.Conditions;

import java.util.ArrayList;
import java.util.List;

import Shop.Office.Cars.Car;
import Shop.Office.Persons.Person;
	public class DatabaseContext {

		private static List<Person> persons=new ArrayList<Person>();
		private static List<Car> cars=new ArrayList<Car>();

		public static List<Person> getPersons() {
			return persons;
		}
		public static List<Car> getCars() {
			return cars;
		}


	}