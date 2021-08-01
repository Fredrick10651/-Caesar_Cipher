import java.util.Scanner;

public class App {
    public static void main(String [] args){
        CaesarCipher myCaesarCipher = new  CaesarCipher();
        Scanner myScanner = new Scanner(System.in);



        System.out.println("input encryption or decryption");
        String userInput = myScanner.nextLine();

        if (userInput.equals("encryption")){
            System.out.println("                          ");
            System.out.println("type phrase for encryption");
            String phraseToEncrypt = myScanner.nextLine();
            System.out.println("                     ");
            System.out.println("enter the number for index to be encrypted");
            int shiftIndexEncrypt = Integer.parseInt(myScanner.nextLine());
            System.out.println("                             ");
            System.out.println(myCaesarCipher.doCaesarCipher(phraseToEncrypt, shiftIndexEncrypt));
        }
        else if (userInput.equals("decryption")){
            System.out.println("                       ");
            System.out.println("enter phrase for decryption");
            String phraseToDecrypt = myScanner.nextLine();
            System.out.println("                           ");
            System.out.println("enter number for index to be decrypted");
            int shiftIndexDecrypt = Integer.parseInt(myScanner.nextLine());
            System.out.println("                                  ");
            System.out.println(myCaesarCipher.unDoCaeserCipher(phraseToDecrypt, shiftIndexDecrypt));

        }
        else {
            System.out.println("                               ");
            System.out.println("Error!");
        }
    }
}
