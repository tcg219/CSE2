////////////////////////////////////////////////////////////////////////////
// Trent Gray
// 9/3/15
// CSE2
//
// Set up as a public class named Cyclometer and set to public static void.

  public class Cyclometer {
      // main method required for every Java program
      public static void main(String[] args) {

// This program is designed for the purpose of calculating and printing the number
// of minutes for each trip, the number of counts for each trip, the distance of each
// trip, and the distance for the two trips combined for a peorson riding a bike.  
// The information given from the cyclometer itself are the time elapsed in seconds and 
// the number of rotations of the front wheel of the bike durring the time elapsed.

// our input data

  int secsTrip1=480; // This variable tells us the time, in seconds of the first trip.
  int secsTrip2=3220;  // This variable tells us the time elapsed for the second trip
  int countsTrip1=1561;  // This variable tells us the number of wheel rotations for trip 1
  int countsTrip2=9037;  // This variable tells us the number of wheel rotations for trip 2

// our intermediate variables and output data.

  double wheelDiameter=27.0; // Will help us calculate the circumferance of the wheel
  double PI=3.14159; // Will aid in finding the circumferance of the wheel
  double feetPerMile=5280; // Will help us convert feet to miles for trip distance
  double inchesPerFoot=12; // Will help us convert inches to feet for trip distnace
  double secondsPerMinute=60; // Will help us convert seconds to minutes to find speed 
  // durring the trip
  double distanceTrip1, distanceTrip2, totalDistance; // Will allow us to print out the trip
  // distances once they are calculated via the equation we will write
  
// Here are the codes that will allow us to print the number of minutes and counts per trip

  System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) +" minutes and had "+
       countsTrip1+" counts.");
  System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+
       countsTrip2+" counts.");

// Here, the purpose of the codes is to calculate the distance traveled durring each of the 
// two trips in miles
  
  distanceTrip1=countsTrip1*wheelDiameter*PI;
  
  // Above gives distance in inches
  // (for each count, a rotation of the wheel travels the diameter
  // in inches  times PI)
  
  distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
  
// Now, the codes do the same thing, but it is for trip 2

  distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  
// Now, here is the code to find the total distance aka trip 1 plus trip 2

  totalDistance=distanceTrip1+distanceTrip2;
  
  // These next lines of code are to print out the distance of each individual trip
  // as well as the distance of both trips combined.
  
  System.out.println("Trip 1 was "+distanceTrip1+" miles");
  System.out.println("Trip 2 was "+distanceTrip2+" miles");
  System.out.println("The total distance was "+totalDistance+" miles");
  
  // Now to compile and then run the code
      }  // end of main method
  }  // end of class