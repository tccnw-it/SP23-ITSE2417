
public class SmileyMenu implements FinalProject
{
    public SmileyMenu()
    {
        
    }

    public void begin() throws NumberFormatException
    {
        int vInput;

        System.out.println("********************************************");
        System.out.println(" Welcome to the Fibonacci Printer");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("How many numbers would you like to see? ");
        System.out.println("Enter a positive integer between 3 and 20: ");

        try
        {
            vInput = Itse2417Main.myScan.nextInt();

            if(vInput >= 3 && vInput <= 20)
            {
                Fibonacci(vInput);
            }
            else
            {
                throw new NumberFormatException();
            }
        }
        catch(InterruptedException e)
        {

        }
        catch(NumberFormatException e)
        {
            System.out.println("Not going to see one today!  Number of out of range, so thanks for playing!");
            try
            {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
            }
            catch(InterruptedException f)
            {}
        }
    }

    public void Fibonacci(int numberOfTimes) throws InterruptedException
    {
        int current = 0;
        int next = 1;
        int nextTerm;

        System.out.println();
        System.out.println();

        System.out.println("Fibonacci Sequence (" + numberOfTimes + " iterations): ");

        for (int i = 1; i <= numberOfTimes; i++)
        {

            if (i == 1)                    // Prints the first term
            {
                System.out.print(current);
            }
            else if (i == 2)               // Prints the second term
            {
                System.out.print(next);
            }
            else                          // Prints all subsequent terms
            {
                nextTerm = current + next;
                current = next;
                next = nextTerm;

                System.out.print(nextTerm);
            }

            if ((i + 1) <= numberOfTimes)
            {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
    }
}
