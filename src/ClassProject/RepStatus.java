package ClassProject;

public class RepStatus extends Music {
	private String performability;
	private String performed;
	
	RepStatus() {
		
	}
	
	public void setPeformability(String status)
	{
		this.performability = status;
	}
	
	public String getPerformability()
	{
		return this.performability;
	}
	
	public void setPerformed(String status)
	{
		this.performed = status;
	}
	
	public String getPerformed()
	{
		return this.performed;
	}
}
