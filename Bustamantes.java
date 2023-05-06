import java.util.Random;

// Dummy class for FinalProject
// Outputs a simple message when implementing begin()
public class Bustamantes implements FinalProject
{
    

    public Bustamantes()
    {

    }

    public void begin() throws NumberFormatException
    {
        int input;

        System.out.println("Welcome to the lottery number generator");
        System.out.println("Enter how many numbers (int) you want generated");
        System.out.println("*numbers range from 1 to 100*");


        try
        {
            input = Itse2417Main.myScan.nextInt();

            LotterySimulator(input);
        }
        catch(InterruptedException e)
        {

        }
        catch(NumberFormatException e)
        {
            System.out.println("There was something wrong with your input (needs int),goodbye");
            try
            {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
            }
            catch(InterruptedException f)
            {}
        }

    }

    public void LotterySimulator(int input) throws InterruptedException
    {
        Random myRand = new Random();
        
        System.out.println("Your numbers are...\n");


        for (int i = 1; i<=input;i++)
        {
            int num = myRand.nextInt(100) + 1;
            
            System.out.println(num);
        }
        System.out.println();
        System.out.println();
    }

    
}

