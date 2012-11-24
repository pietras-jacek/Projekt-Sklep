package Shop.Office.Persons;

public class Job {

	private String Position;
	private double Salary;
	private String TimeWork;
	
	public Job(String newPosition, double newSalary, String newTimeWork)
    {
      this.Position = newPosition;
      this.Salary   = newSalary;
      this.TimeWork = newTimeWork;
    }

	//setters
    public void setPosition (String newPosition)
    {
            Position = newPosition;
    }

    public void setSalary (double newSalary)
    {
            Salary = newSalary;
    }

    public void setTimeWork (String newTimeWork)
    {
            TimeWork = newTimeWork;
    }

    //getters
    public String getPosition()
    {
    	return Position;
    }

    public double getSalary()
    {
    	return Salary;
    }

    public String getTimeWork()
    {
    	return TimeWork;
    }


}
