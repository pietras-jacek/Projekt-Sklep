package Company.Business;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Shop.Office.Administration.HibernatePersonManager;

import Shop.Office.Persons.Person;

public class HibernatePersonManagerTests {


	private HibernatePersonManager worker;
	private SessionFactory factory;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		factory = 
				new Configuration().configure().buildSessionFactory();
		worker = new HibernatePersonManager(factory.openSession());


	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGet() {
		Shop.Office.Persons.Person result = worker.get(1);
		Shop.Office.Persons.Person result2 = worker.get(1);
		Shop.Office.Persons.Person result3 = worker.get(100);
		assertNotNull("brak wyników",result);
		assertEquals("zle ustawienie Id",result.getId(),1);


		assertEquals("zle ustawienie imion",result.getName(), "Adam");
		assertEquals("zle ustawienie peselu",result.getPesel(), "12324");
		assertNotSame("obiekty nie powinny wskazywac na to samo pole w pamieci",
				result,result2);
		assertNull("nie zwraca null gdy nie ma wyniku w bazie"
				,result3);

	}

	@Test
	public void testGetAll() {
		List<Shop.Office.Persons.Person> results = worker.getAll();

		assertNotNull("Lista jest nullem", results);
		assertTrue("ilosc elementów w liscie sie nie zgadza",
				results.size()==6);
	}

	@Test
	public void testSave() {
		Person p = new Person("Tomasz","2314","Morska");
		
		Shop.Office.Persons.Person result = worker.get(7);
		assertNotNull("nie zapisano do bazy",result);
		assertEquals("zle ustawienie imion",result.getName(), "Tomasz");
		assertEquals("zle ustawienie peselu",result.getPesel(), "2314");

	}

	@Test
	public void testDelete() {
		Shop.Office.Persons.Person p = worker.get(1);
		boolean deleted = worker.delete(p);

		Shop.Office.Persons.Person result = worker.get(1);
		assertTrue("nie skasowano",deleted);
		assertTrue("ilosc danych w bazie nie zmalala",
				worker.getAll().size()==5);

	}

}