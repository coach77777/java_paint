import java.util.Scanner;
import static java.lang.Math.ceil;  //import from java API

public class Paint2 {

//Establishing main method
	public static void main(String[] args){
		
//Setting up input
	        Scanner scnr = new Scanner(System.in);
	        
// Initializing all (double) variables to zero   
	        double wallHeight = 0.0;         
	        double wallWidth = 0.0;
	        double wallArea = 0.0;
	        double gallonsPaintNeeded = 0.0;
	        double cansPaintNeeded = 0;
	        double isitaStr = 0.0; 
	        String clearScanner = "";        
// Area covered for one gallon -350 square feet	        
	        final double squareFeetPerGallons = 350.0;
	        
// Implement a do-while loop with try catch
	        
	        do {
	                try {
	                        System.out.println("Enter the wall height in feet: ");//Prompt user for height of wall
	                        wallHeight = scnr.nextDouble();                       //Setting the wall height as type Double 
	                        isitaStr = wallHeight / 2.0;                          // Test input is not a string
	                        if (isitaStr <= 0) {                                  //Test input is not negative or zero
	                                throw new Exception("Height must be numeric and greater than zero!");// Give user error message.
	                        }
	                } 
	                catch (Exception excpt) {                                    //Catch exception
	                        System.out.println("Invalid Height Input!");         // Give user error message.
	                        clearScanner = scnr.nextLine();                      // Clear any remaining input.        
	                }
	           }  while (wallHeight <= 0);                                       // while condition
	        

// Implement a do-while loop with try catch
	        
	        do {
	                try {
	                         System.out.println("Enter wall width in feet: ");//Prompt user for width of wall.
	                     wallWidth = scnr.nextDouble();                       //Setting the wall width as type Double
	                     isitaStr =  wallHeight / 2.0;                        // Test input is not a string
	                     if (isitaStr <= 0) {                                 //Test input is not negative or zero
	                         throw new Exception("Width must be numeric and greater than zero!");// Give user error message.
	                     }
	                     
	                }
	                catch (Exception excpt) {                                 //Catch exception
	                        System.out.println("Invalid Width Input!");       // Give user error message.
	                        clearScanner = scnr.nextLine();                   // Clear any remaining input.
	                }
	        } while (wallWidth <= 0);                                         // while condition
	       

	        
	        wallArea = wallHeight * wallWidth;                                // Calculate and output wall area
	        // System.out.println("Wall area: " +  wallArea + " square feet");

	        
	        gallonsPaintNeeded = wallArea/squareFeetPerGallons;               // Gallons of Paint needed
	        // Calculate and output the amount of paint (in cans) needed to paint the wall
	        cansPaintNeeded = Math.ceil(wallArea/squareFeetPerGallons);// From the Java API, Import Math class .ceil from java.lang
	        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
	        System.out.println("Cans needed: " + cansPaintNeeded + " can(s)"); // Print Paint needed in can(s)

	    }
	}

