package Shop.Office.Administration;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import Shop.Office.Persons.Human;

@ApplicationScoped
public class AdminManager {
	private List<Human> db = new ArrayList<Human>();

	public void addPerson(Human person) {
		Human newHuman = new Human();

		newHuman.setFirstName(person.getFirstName());
		newHuman.setZipCode(person.getZipCode());
		newHuman.setPin(person.getPin());
		newHuman.setDateOfBirth(person.getDateOfBirth());
		newHuman.setMarried(person.isMarried());
		newHuman.setWeight(person.getWeight());
		newHuman.setNumOfChildren(person.getNumOfChildren());

		db.add(newHuman);
	}

	// Removes the person with given PIN
	public void deletePerson(Human person) {
		Human personToRemove = null;
		for (Human p : db) {
			if (person.getPin().equals(p.getPin())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Human> getAllPersons() {
		return db;
	}
}

