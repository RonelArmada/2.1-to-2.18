//Ronel Armada
//BSIT NETSEC 1-2
package usingscanner1;

import java.util.Scanner;
public class UsingScanner1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter your name: ");
        String firstName = input.next();
        System.out.print("Enter your middle name: ");
        String middleName = input.next();
        System.out.print ("Enter your lastname: ");
        String lastName = input.next();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        
        System.out.println("Firts name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Age: " + age);
               
     }
    
}
