/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavings;

/**
 *
 * @author sohak9660
 */
import java.util.Scanner;

public class MySavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        piggyBank total = new piggyBank();
        		
Scanner input = new Scanner(System.in);
System.out.println("1. Show total in bank: ");
System.out.println("2. Add a penny: ");
System.out.println("3. Add a nickel: ");
System.out.println("4. Add a dime: ");
System.out.println("5. Add a quater: ");
System.out.println("6. Take money out of bank: ");
System.out.println("Enter 0 to quit: ");
System.out.println("Enter your choice: ");
while(true){double number1 = input.nextDouble(); // read first double

if (number1 == 1){
    System.out.println("You have: " + total.totalSavings());
   
}
else if (number1 == 2){
    System.out.println("You have: " + total.addPenny());
    
}else if (number1 == 3){
    System.out.println("You have: " + total.addNickel());
    
}else if (number1 == 4){
    System.out.println("You have: " + total.addDime());
    
}else if (number1 == 5){
    System.out.println("You have: " + total.addQuater());
    
}else if (number1 == 6){
    System.out.println("How much would you like to take out?");
     
double number2 = input.nextDouble();
   if(number2 > total.takeMoney()){
           System.out.println("Sorry you dont have enough money!");
     }else{
              System.out.println("You have: " + total.takeMoney());
}
}else if (number1 == 0){
    break;
}
}

    }
    
}
