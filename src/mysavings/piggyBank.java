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
public class piggyBank {
    private static double penny = 0.01;
    private static double nickel = 0.05;
    private static double dime = 0.10;
    private static double quater = 0.25;
    private static double account = 0;
    private static double Total;
    public static double Take;
    
    
    public double totalSavings(){
       return Total; 
    }
    public piggyBank(){
        
    }
    
/**
 * 
 * @return 
 */
public double addPenny(){
    Total = account + penny;
     
    return Total;
   
}

/**
 * 
 * @return 
 */
public double addNickel(){
    
    Total = account + nickel;
return Total;
}

/**
 * 
 * @return 
 */
public double addDime(){
    
    Total = account + dime;
return Total;
}

/**
 * 
 * @return 
 */
public double addQuater(){
    
    Total = account + quater;
return Total;
}
public double takeMoney(){
    
   
return Total - Take;    
}

}