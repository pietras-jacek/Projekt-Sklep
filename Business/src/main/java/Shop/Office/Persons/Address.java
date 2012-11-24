package Shop.Office.Persons;

public class Address {


	  private String City;
	  private String Street;
	  private String PostCode;

	  public Address(String newCity, String newStreet, String newPostCode)
	    {
	      this.City = newCity;
	      this.Street = newStreet;
	      this.PostCode = newPostCode;
	    }
	 
	//setters
      public void setCity (String newCity)
      {
              City = newCity;
      }

      public void setLastName (String newStreet)
      {
              Street = newStreet;
      }

      public void setPostCode (String newPostCode)
      {
              PostCode = newPostCode;
      }

//getters
  public String getCity()
  {
    return City;
  }

  public String getStreet()
  {
    return Street;
  }

  public String getPostCode()
  {
    return PostCode;
  }

}











