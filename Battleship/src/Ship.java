
public class Ship {

	int[] locations = new int[10];
	
	public void setLocation(int location) 
	{
		locations[location] = 1;
	}
	
	public boolean getLocation(int location)
	{
		boolean checkLocation = false;
		
		if(locations[location]==1)
		{
			checkLocation = true;
		}
		
		return checkLocation; 
	}
	
}
