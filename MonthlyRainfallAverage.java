import java.util.Scanner;
import java.text.*;

// Author: Matthew Self
// Oct. 1, 2014
// CIS163AA 27873
// Mid-term project

// This program will calculate the average rainfall over a period of years.


public class MonthlyRainfallAverage {

   public static void main(String[] args) {

	  // This section establishes variables and creates space to hold rainfall data. Note
	  // the use of the constant variable final for 'MONTHS;' This integer defines the
	  // amount of months in a year. This was added at the recommendation of a friend.
	     	
      int years; 
   	   	
      double totalRainfall = 0;

      double monthlyRain;
   	
      int totalMonths = 0;
   	
   	  final int MONTHS = 12;     

   	
      // This section allows for rainfall entries to the one-hundredth of an inch.
	  NumberFormat df = DecimalFormat.getInstance();
      df.setMaximumFractionDigits(2);			
   	
      // He we begin program interaction and user input
      Scanner input = new Scanner(System.in);
   	
      System.out.println("How many years would you like to calculate average monthly rainfall?: ");
      years = input.nextInt();
   	
      System.out.println("Enter the amount of inches per month ");

      // Use of the for-loop here because we have a fixed count of entries once we know
      // how many years the user wishes to measure. Note how the loop establishes the
      // counting for final int 'MONTHS.' It was suggested this could be down without the
      // switch/case, but I couldn't figure that out.
      
      for(int i=0; i < years; i++){				// A little Boolean expression for years boundary.
         for(int j=1; j<MONTHS+1; j++){			// Another one to complete the loop for months boundary.
            switch(j){							// Begin data query loop
               case 1:
                  System.out.print("January: ");
                  break;
               case 2:
                  System.out.print("February: ");
                  break;
               case 3:
                  System.out.print("March: ");
                  break;
               case 4: 
                  System.out.print("April: ");
                  break;
               case 5:
                  System.out.print("May: ");
                  break;
               case 6:
                  System.out.print("June: ");
                  break;
               case 7:
                  System.out.print("July: ");
                  break;
               case 8:
                  System.out.print("August: ");
                  break;
               case 9:
                  System.out.print("September: ");
                  break;
               case 10:
                  System.out.print("October: ");
                  break;
               case 11:
                  System.out.print("November: ");
                  break;
               case 12:
                  System.out.print("December: ");
            }
            monthlyRain = input.nextDouble(); 		// Waiting for the value to be inputted here.
            totalRainfall += monthlyRain;			
         }
         totalMonths += MONTHS;						// Declaring our value here.
      }
   	
      double avgRainfall = totalRainfall/totalMonths;	// Arriving at our average
   	
	  // Presenting our data to the user.
      System.out.println("");
 
       System.out.println("Total months: " + totalMonths + "\nTotal rainfall: " + df.format(totalRainfall) + " inches" +
         	"\nAverage rainfall: " + df.format(avgRainfall) + " inches");
   }
}