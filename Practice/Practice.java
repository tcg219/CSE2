///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// 9/1/15
// Practice
  public class Practice {
      
    public void computerspeed () {
          
          float processorSpeed;
          byte numberProcessors;
          float computerSpeed;
          
          processorSpeed = 2.3f;
          numberProcessors = 3;
          
          computerSpeed = processorSpeed + numberProcessors;
          
          System.out.println("Computer Speed = " + computerSpeed);
          
 }
          
  public static void addInterest() {
      float balance = 45;
      float interest = 0.05f;
      
      float newbalance = balance + (int)(balance*interestrate);
      System.out.println("new balance = " + newbalance);
      
  }
  
  public static void main(String[] args) {
      
      computeSpeed();
      addInterest(0.05f);
  }
  }
  