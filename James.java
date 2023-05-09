import java.time.Year;

public class James implements FinalProject
{
	
	public James()
	{}

	public void begin() throws NumberFormatException 
	{
		int year;
	      
	    System.out.println("********************************************");
	    System.out.println(" Welcome to the Easter Calculator");
	    System.out.println("********************************************");
	    System.out.println();
	    System.out.println("What year would you like to know when Easter falls? ");
	    System.out.println("Enter a positive integer greater than 33: ");
	      
	    try
	    {
	    	year = Itse2417Main.myScan.nextInt();
	    	
	    	if(year > 33)
	        {
	    		Easter(year);
	        }
	        else
	        {
	            throw new NumberFormatException();
	        }
	    }
	    catch(NumberFormatException e)
	    {
	        System.out.println("I'm sorry, but that year was before the ressurection of Jesus Christ so there was no Easter.");
	        try
	        {
	            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
	        }
	        catch(InterruptedException f)
	        {}
	    }
	}
	
	public void Easter(int year) {
		// Easter day calculation
		int valz = year % 19;
		int valy = year / 100;
		int valx = year % 100;
		int valw = valy / 4;
		int valv = valy % 4;
		int valu = (8 * valy + 13) / 25;
		int valt = (19 * valz + valy - valw - valu + 15) % 30;
		int vals = valx / 4;
		int valr = valx % 4;
		int valq = (valz + 11 * valt) / 319;
		int valp = (2 * valv + 2 * vals - valr - valt + valq + 32) % 7;
		int month = (valt - valq + valp + 90) / 25;
		int day = (valt - valq + valp + month + 19) % 32;
		
		// return the calculated value to the user
		Year tempYear = Year.now();
		int currentYear = tempYear.getValue();
		if (year < currentYear){
		  System.out.println( "In " + year + ", Easter fell on " + month + "/" + day + "/" + year + ".");
		  }
		else{
		  System.out.println( "In " + year + ", Easter will fall on " + month + "/" + day + "/" + year + ".");
		}
	}
}
