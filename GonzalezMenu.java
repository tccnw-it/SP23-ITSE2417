//import java.util.Scanner;
public class GonzalezMenu extends Itse2417Main implements FinalProject
{
    public GonzalezMenu()
    {
        
    }

    public void begin() 
    {
        //Scanner input = new myScan(System.in);
    
        System.out.print("Enter a year: ");
        int year = myScan.nextInt();
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
        System.out.printf("In " + year +"," + " Easter fell on " + month+"/"+day+"/"+year);
        
    }       
}
