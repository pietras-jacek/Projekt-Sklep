package Shop.Office.Administration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Shop.Office.Persons.Person;

public class HibernatePersonManager implements ManagerInterface<Person>{

	private Session session;
	
	public HibernatePersonManager( Session session)
	{
		this.session = session;
	}
	
	public Person get(int id) {
		
		List<Person> result = this.session.getNamedQuery("allPersonsById")
				.setInteger("Id",id).list();
		
		return result.get(0);
	}

	
	public List<Person> getAll() {
		
		return (List<Person>)this.session.getNamedQuery("allPersons").list();
	}

	
	public boolean save(Person obj) {
		try{
			this.session.beginTransaction();
			this.session.save(obj);
			
			session.beginTransaction().commit();
			return true;
		}catch(Exception ex)
		{
			return false;
		}
	}

	
	public boolean delete(Person obj) {
		try{
			this.session.beginTransaction();
			this.session.getNamedQuery("deleteFromPerson")
			.setInteger("id", obj.getId())
			.executeUpdate();
			this.session.getTransaction().commit();
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

}
