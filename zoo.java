*  Java ITC206 Assessment 1 Tickets for Zoo
 *  By Jonathon Crooks
 *  Semester 2
 */


import java.util.Scanner;

public class ticketsZoo {
    // Main method

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data either 1 or 0
        
        System.out.print("Enter a group? (Yes=1/No=0): ");

        int enterGroup = input.nextInt();
        int totalTakings = 0;
        int totalAmount;

        while (enterGroup != 0) {
        
            // Get input for children tickets
            
            System.out.print("Enter the number of children(age 6-15): ");
            int childrenTickets = input.nextInt();

            // Get input for adult tickets
            
            System.out.print("Enter the number of adults(age 15-59): ");
            int adultsTickets = input.nextInt();

            // Get input for seniors tickets
            
            System.out.print("Enter the number of seniors(age 60+): ");
            int seniorsTickets = input.nextInt();

            // Call ticketPriceTotal method to calculate ticket amount
            
            totalAmount = ticketPriceTotal(childrenTickets, adultsTickets, seniorsTickets);
            System.out.println("Total entry charge is $ " + totalAmount);
            
            // Add totalAmount to running total of totalTakings
            
            totalTakings += totalAmount;
            
            // Enter 1 to enter another group
            
            System.out.print("\nEnter a group? (Yes=1/No=0): ");
            enterGroup = input.nextInt();
        }
        System.out.println(" Total takings $" + totalTakings);
    }
    
    // Public method for calculating ticket price
    
    public static int ticketPriceTotal(int childrenTickets, int adultsTickets, int seniorsTickets) {
    
        int soloChildren = 0;

        int totalAdults = adultsTickets + seniorsTickets;

        if ((totalAdults - childrenTickets) <= 0) {
            soloChildren = (childrenTickets - totalAdults);
        }
        
        // Calculating the price below depending on numbers
        
        int soloPrice = soloChildren * 5;
        int childPrice = (childrenTickets - soloChildren) * 2;
        int adultsPrice = adultsTickets * 10;
        int seniorsPrice = seniorsTickets * 8;
        
        // Calculate total amount and return it
        
        return soloPrice + childPrice + adultsPrice + seniorsPrice;


    }

}

