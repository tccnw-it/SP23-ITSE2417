import java.util.Random;

public class AbiogMenu implements FinalProject
{
    private final String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 -!?,.\"";
    private int offset;
    private String strOffset;
    private String numOffset;
    public AbiogMenu()
    {
    }

    public void begin() 
    {
        int sel;
        System.out.println("********************************************");
        System.out.println("       Caesar Cipher Program                ");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Please select desired action below: ");
        System.out.println();
        System.out.println("      1. Encrypt plaintext ");
        System.out.println("      2. Decrypt ciphertext ");
        System.out.println("      3. Exit");
        System.out.println();
        System.out.print("      Your selection? ");
        do
        {
           sel = Itse2417Main.myScan.nextInt();              
        }
        while (sel > 3 || sel < 1);
        try
        {
           if (sel == 1)
           {
              doEncrypt();
           }
           else if (sel ==2)
           {   
              doDecrypt();
           }
           else if (sel == 3)
           {
              return;
           }
           System.out.println();
           System.out.println();
           java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
           begin();
       }
       catch(InterruptedException f)
       {
       }
    }

    public void doEncrypt()
    {
       System.out.println("\nAllowed characters: A-Z, 0-9, space, -!?,.\"");
       System.out.println("Limit text input to 100 characters."); 
// generate the offset - numnber of positions a characters will be shifted
       final Random myRand = new Random();
       offset = myRand.nextInt(charset.length() - 1);
       strOffset = Integer.toString(offset);
       if (strOffset.length() == 1)
       {
          strOffset = "0" + strOffset;
       }
       System.out.println();
// accept user input
       Itse2417Main.myScan.nextLine();
       String plainInputStr = Itse2417Main.myScan.nextLine();
       plainInputStr = plainInputStr.toUpperCase();
       String encryptStr = "";
// implement Caesar Cipher (encryption)     
       for (int i = 0; i < plainInputStr.length(); i++)   
       {   
// validate each character of plainInputStr
           if (charset.indexOf(plainInputStr.charAt(i)) < 0)
           {
               System.out.println("Invalid character in plaintext.");
               return;
           }
// get position of each character of plainInputStr in charset
           int pos = charset.indexOf(plainInputStr.charAt(i));   
              
// get encrypted char for each char of plainInputStr   
           int encryptPos = (offset + pos) % 43;   
           char encryptChar = charset.charAt(encryptPos);   
              
            // add encrypted char to encrypted string   
           encryptStr += encryptChar;   
       } 
       encryptStr = encryptStr + strOffset;  
       System.out.println(encryptStr);          
    }

    public void doDecrypt()
    {
        Itse2417Main.myScan.nextLine();        
        String cipherInputStr = Itse2417Main.myScan.nextLine();
        numOffset = cipherInputStr.substring(cipherInputStr.length()-2);
        offset = Integer.parseInt(String.valueOf(numOffset));        
  
        String decryptStr = "";
 // implement Caesar Cipher (decryption)
 
        for (int i = 0; i < cipherInputStr.length(); i++)   
       {   
// validate each character of cipherInputStr
           if (charset.indexOf(cipherInputStr.charAt(i)) < 0)
           {
               System.out.println("Invalid character in ciphertext.");
               return;
           }
// get position of each character of cipherInputStr in charset
           int pos = charset.indexOf(cipherInputStr.charAt(i));   
              
// get decrypted char for each char of cipherInputStr   
           int decryptPos = (pos - offset) % 43;   
// if decryptPos is negative   
            if (decryptPos < 0)
            {   
                decryptPos = charset.length() + decryptPos;   
            }   
            char decryptChar = charset.charAt(decryptPos);   
              
            // add decrypted char to decrypted string   
           decryptStr += decryptChar;   
       } 
       decryptStr = decryptStr.substring(0, decryptStr.length()-2);  
       System.out.println(decryptStr);          
      
    }
}
