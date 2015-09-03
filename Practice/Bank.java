//////////////////////////////////////////////////////////
// Trent Gray
// 9/2/15
// CSE2

  public class Bank {
      public static void main(String[] args) {
          
// First, we declair the variables of AccountBalance, InterestRate, and BankAccount.

  float AccountBalance;
  double InterestRate;
  double BankAccount;
  
// Then, we give AcountBalance and Interest Rate set values.

  AccountBalance= 1000;
  InterestRate= .02;
  
// After that, we write an equation for BankAccount using AccountBalance and InterestRate

  BankAccount= AccountBalance + AccountBalance * InterestRate;
  
// Once that is done, we have the program print out the BankAccount amount.

  System.out.println("Bank Account Balance =" + BankAccount);
  
      }
  }