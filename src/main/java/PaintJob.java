
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author baileyanderson
 */
public class PaintJob {
    public static void main(String[] args) 
    {
        double gallonOfPaint;    
        double hoursOfLabor;    
        double costOfPaint;     
        double laborCharges;      
        double totalCostofJob;       

        gallonOfPaint = getGallons();
        
        hoursOfLabor = getLabor(gallonOfPaint);

        costOfPaint = getCostOfPaint(gallonOfPaint);

        laborCharges = getLaborCharges(hoursOfLabor);

        totalCostofJob = calculateTotalCost( laborCharges,costOfPaint);
        
        displayResults(laborCharges,costOfPaint,totalCostofJob,
                gallonOfPaint,  hoursOfLabor);
        
        System.exit(0);
    }

    
    public static double getGallons() 
    {
        Scanner keyboard = new Scanner(System.in);
        
        double squFt = 115; 
        double sumWall = 0.0;   
        
        System.out.println("Enter the number of rooms to be painted: ");
        double numOfRooms = keyboard.nextDouble();
        for (int i = 1; i <= numOfRooms; i++) 
        {
        System.out.println("Enter the wall space for room number: " + i);
        double wallSpace = keyboard.nextDouble();

            sumWall += wallSpace;
        }

        double gallonNeeded = (sumWall / squFt);
        return gallonNeeded;
    }


    public static double getLabor(double gallonsNeeded) 
    {
        double laborHours = (gallonsNeeded * 8);
      
        return laborHours;
    }

    public static double getCostOfPaint(double gallonsNeeded) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter price per gallon of paint: ");
        String input = keyboard.nextLine();
        
        double paintPrice = Double.parseDouble(input);
        double spentOnPaint = gallonsNeeded * paintPrice;

        return spentOnPaint;
    }

    public static double getLaborCharges(double laborHours) 
    {
        double money = ( (laborHours * 18) );

        return money;
    }
    
     public static double  calculateTotalCost(double money, double spentOnPaint)
    {
        double totalAmount = (money + spentOnPaint);
       return totalAmount;
    }
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");{ 
    }

    public static void displayResults(double laborCharges,double costOfPaint,
        double totalCostofJob, double  gallonOfPaint ,double   hoursOfLabor)
    {
         System.out.println("Gallons needed: " + df2.format(gallonOfPaint) +  "\n" 
                + "Labor hours needed: " + df2.format(hoursOfLabor) + "\n"
                + "Cost of paint: " + df2.format(costOfPaint) + "\n" 
                + "Cost of labor: " + df2.format(laborCharges) + "\n"  
                + "Total cost of job: " + df2.format(totalCostofJob));

    }
}
