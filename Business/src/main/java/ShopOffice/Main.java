package ShopOffice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Shop.Office.Cars.Car;
import Shop.Office.Cars.PersonCar;
import Shop.Office.Persons.*;
import Shop.Office.Administration.HibernatePersonManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//session.beginTransaction();
//		
//		//
//		Car c = new PersonCar("BMW","GDA12345");
//		Person adam = new Person("Adam","1234");
//		adam.getCars().add(c);
//		c.setOwner(adam);
//		//
//	
//		session.persist(adam);
//		
//		
//		List<Person> persons=session.getNamedQuery("allPersonsByName")
//				.setString("name", "Adam").list();
//		
//		for(Person p : persons)
//			System.out.println(p.getName());
//		session.getTransaction().commit();
//		session.close();
		
		HibernatePersonManager worker = new HibernatePersonManager(session);
		worker.save(new Person("Marek","1234"));
		worker.save(new Person("Darek","1234"));
		worker.save(new Person("Aleksander","1234"));
		Shop.Office.Persons.Person person =new Person("Marek");
		person.setId(10);
		worker.delete(person);
		//session.getTransaction().commit();
		for(Person p: worker.getAll())
		{
			System.out.println(p.getName());
		}
		
		session.close();
		//System.out.println("Osoba o id 4:"+mgr.get(4).getName());
		
	}

}
