////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/10/15

// The purpose of this program is to recieve input by the user to find how much each person should pay
// when splitting the cost of the check amongst a group.  The user will imput the the cost of the 
// check, the the percent tip they wish to pay, and the number of ways the check will be split.
// The program will then process this information and calculate how much each person must pay in order
// to pay the check.

  import java.util.Scanner; //This line imports a scanner into java, allowing a scanner to be
  // used and user imput to be submitted.
  
  public class Check { // The line here creates a public class called check which will contain
  // the code.
        
        public static void main(String[] args) { // Here, the line sets up java to use the main
        // method which is required for every Java program.
        
        Scanner myScanner = new Scanner ( System.in); // This line here decleares an instance of 
        // the scanner object and calls the Scanner constructor.  This will now allow the use
        // within the program.
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); // This will
        // tell the computer to print out the abreviated message at the begining when the program
        // is run and used. It will also prevent the cursor from going to the beginning of the 
        // next line after displaying the prompt "Enter..."
        
        double checkCost = myScanner.nextDouble(); // This command will tell the computer to set
        // the number typed in by the user via the scanner to make it a variable called checkCost
        // and to set it as a double.
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        // This will tell the computer to print out the abreviated message once the cost of the check
        // has been typed in via the user. It will also prevent the cursor from going to the beginning 
        // of the next line after displaying the prompt "Enter..."
        
        double tipPercent = myScanner.nextDouble(); // This command will tell the computer to set
        // the number typed in by the user via the scanner to make it a variable called tipPercent
        // and to set it as a double.
        
        tipPercent /= 100; // This line will convert the percentage into a decimal value.
        
        System.out.print("Enter the number of people who went out to dinner: ");
        // This will tell the computer to print out the abreviated message once the tip percentage
        // has been typed in via the user. It will also prevent the cursor from going to the beginning 
        // of the next line after displaying the prompt "Enter..."
        
        int numPeople = myScanner.nextInt(); // This command will tell the computer to set
        // the number typed in by the user via the scanner to make it a variable called numPeople
        // and to set it as an integer.
        
        double totalCost; // This creates a varialbe called totalCost as a double. It represents
        // the total cost of the meal.
        
        double costPerPerson; // This creates a variable called costPerPerson as a double.  It 
        // represents how much each person in the group must pay in order to pay the check.
        
        int dollars,  // sets up whole dollar amount of cost as an intager.
             dimes, pennies; //for storing digits to the right of the decimal point for the cost$.
             
        totalCost = checkCost * (1 + tipPercent); // This defines totalCost as the product
        // of the cost of the check and the quantity of tip percent plus one to yield the total
        // cost of the meal.
        
        costPerPerson = totalCost / numPeople;  // This defines costPerPerson as the total cost
        // of the meal devided by the number of people in the group to yeild how much each
        // individual person must pay in order to pay off the check.
        
        // The next line is designed to get the whole amount, dropping the decimal fraction.
        dollars = (int)costPerPerson;
        
        // The next line is designed to get the decimal in the tenth place aka number of dimes.
        dimes=(int)(costPerPerson * 10) % 10;
        
        // The next line does the same as the previous one, except it gets the decimal in the
        // hundreds place aka pennies.
        pennies=(int)(costPerPerson * 100) % 10;
        
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        // This line has the computer print out the above message plus the values of dollars,
        // dimes, and pennies with a decimal point in order to show the amount each person in
        // the group must pay to pay off the check.
        
        }
  } 
  
       