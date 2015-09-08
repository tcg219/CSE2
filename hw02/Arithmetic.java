////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// 9/4/15
// CSE2
// hw02 Arithmetic

// First, I made a public class called Arithmetic and set up the public static void using the
// main method.

  public class Arithmetic {
      public static void main(String[] args) {
          
// The purpose of this program is to compute the cost of items I buy at Walmart, including a
// sales tax of 6%.  I start off by stating by naming variables and their values.  These 
// variables are the items I bought at Walmart and the price of each item.

  // Number of pairs of socks
  int nSocks=3;
  //Cost per pair of socks
  //('$' is part of the variable name)
  double sockCost$=2.58;
  
  //Number of drinking glasses
  int nGlasses=6;
  //Cost per glass
  double glassCost$=2.29;
  
  //Number of boxes of envelopes
  int nEnvelopes=1;
  //cost per box of envelopes
  double envelopeCost$=3.25;
  
  // Here is the tax I have to pay which is multiplied by the cost of the total of each type
  // type of item in order to get the full tax amount.
  double taxPercent=0.06;
  
  // Now to do some calculations.  Below are the calculations and variable assignments of
  // each kind of item and sales tax for that total cost, the total cost of the purchases
  // before tax, and the total cost of everything, including sales tax.
  
  double totalSockCost$=nSocks*sockCost$;  //total cost of all the socks
  double totalSockTax$=totalSockCost$*taxPercent;  //sales tax for all of the socks
  
  double totalGlassCost$=nGlasses*glassCost$;  //total cost of all the glasses
  double totalGlassTax$=totalGlassCost$*taxPercent;  //sales tax for all the glasses
  
  double totalEnvelopeCost$=nEnvelopes*envelopeCost$;  //total cost of all the envelopes
  double totalEnvelopeTax$=totalEnvelopeCost$*taxPercent;  //sales tax for the envelopes
  
  double totalItemCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
  //total cost off all of the items before tax
  double totalTax$=totalSockTax$+totalGlassTax$+totalEnvelopeTax$;
  //total of all of the taxes of all the items
  double transactionCost$=totalItemCost$+totalTax$;
  //cost of all of the items plus sales tax
  
  // Here I am going to round off the taxes for each item, the total of all of the taxes,
  // and the total cost of the transaction to two decimal places. The first step is to
  // convert them into integers while multiplying the unrounded value by 100.
  
  int sockTax$= (int) (totalSockTax$*100);  //rounded sock tax times 100
  int glassTax$= (int) (totalGlassTax$*100);  //rounded glass tax times 100
  int envelopeTax$= (int) (totalEnvelopeTax$*100);  //rounded envelope tax time 100
  
  int TotalTax$= (int) (totalTax$*100);  //rounded total of all taxes
  int TransactionCost$= (int) (transactionCost$*100);  //rounded total cost plus tax
  
  // Next, I am going to convert the rounded values from integers to doubles.
  
  double SockTax$= (double) sockTax$;  //rounded sock tax as a double
  double GlassTax$= (double) glassTax$;  //rounded glass tax as a double
  double EnvelopeTax$= (double) envelopeTax$;  //rounded envelope tax as a double
  
  double TotalTAX$= (double) TotalTax$;  //rounded total tax as a double
  double TransactionCOST$= (double) TransactionCost$;  //rounded transaction cost as double
  
  // Next, I am going to devide each of the rounded values by 100 to put them in their
  // proper decimal place.
  
  double roundSockTax$= SockTax$/100;  //rounded sock tax as a decimal
  double roundGlassTax$= GlassTax$/100;  //rounded glass tax as a decimal
  double roundEnvelopeTax$= EnvelopeTax$/100;  //rounded envelope tax as a decimal
  
  double roundTotalTax$= TotalTAX$/100; //rounded total tax as a decimal
  double roundTransCost$= TransactionCOST$/100; //rounded transaction cost as a decimal
  
  // Finally, to have the program display the items being bought, how many of each item is
  // being bought, the cost of each item, the cost of each item and sales tax
  // for that item, the total cost of the purchases without tax, the total sales tax, and
  // the total cost of the purchases including sales tax.
  
  System.out.println("The Items I bought:");
  System.out.println("Socks");
  System.out.println("Glasses");
  System.out.println("Envelopes");
  System.out.println("                   ");
  System.out.println("Number of Each Item Bought:");
  System.out.println("3 Pairs of Socks");
  System.out.println("6 Glasses");
  System.out.println("1 Envelope");
  System.out.println("           ");
  System.out.println("Cost Per Item:");
  System.out.println("$2.58 Per Pair of Socks");
  System.out.println("$2.29 Per Glass");
  System.out.println("$3.25 Per Envelope");
  System.out.println("                       ");
  System.out.println("Cost of Each Item and Item Tax:");
  System.out.println("$" + totalSockCost$ + " for Socks Plus $" + roundSockTax$ + " for Tax");
  System.out.println("$" + totalGlassCost$ + " for Glasses Plus $" + roundGlassTax$ + " for Tax");
  System.out.println("$" + totalEnvelopeCost$ + " for Envelopes Plus $" + roundEnvelopeTax$ + " for Tax");
  System.out.println("                ");
  System.out.println("Final Totals:");
  System.out.println("$" + totalItemCost$ + " for Total Cost of Items");
  System.out.println("$" + roundTotalTax$ + " for the Total Tax of All of the Items");
  System.out.println("$" + roundTransCost$ + " for Total Transaction Cost Including Sales Tax");
  
      }
  }