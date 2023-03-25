/*
 * File name: HourlyProgrammer.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */

/**
 * HourlyProgrammer class extends Programmer.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class HourlyProgrammer extends Programmer {
	/**
	 * wage per hour
	 */
     private double wage; 
     /**
      * hours worked for week
      */
     private double hours;
     
     /**
      * 
      * @param firstName first name
      * @param lastName last name
      * @param socialSecurityNumber  social security number
      * @param wage wage per hour
      * @param hours hours worked for week
      */
     public HourlyProgrammer(String firstName, String lastName,String socialSecurityNumber, double wage, double hours) {
     super(firstName, lastName, socialSecurityNumber);

      if (wage < 0.0) { // validate wage
      throw new IllegalArgumentException(
         "Hourly wage must be >= 0.0");
      }

      if ((hours < 0.0) || (hours > 168.0)) { // validate hours
      throw new IllegalArgumentException(
       "Hours worked must be >= 0.0 and <= 168.0");
      }

      this.wage = wage;
      this.hours = hours;
       } 

       /**
        * 
        * @param wage wage per hour
        */
       public void setWage(double wage) {
          if (wage < 0.0) { // validate wage
             throw new IllegalArgumentException(
                "Hourly wage must be >= 0.0");
           }

          this.wage = wage;
           } 

       /**
        * 
        * @return double wage per hour
        */
       public double getWage() {
          return wage;
         } 


       /**
        * 
        * @param hours hours worked
        */
       public void setHours(double hours) {
         if ((hours < 0.0) || (hours > 168.0)) { // validate hours
          throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");
        }

         this.hours = hours;
       } 

      /**
       * 
       * @return double hours worked
       */
       public double getHours() {
          return hours;
       } 

      @Override                                                           
      public double getPaymentAmount() {                                            
          if (getHours() <= 40) { // no overtime                           
              return getWage() * getHours();   
           }else {                                                             
              return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
            }
         }                                         

                  
      @Override 
      public String toString() {
	       return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %s", 
			  "hourly Programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "hourly wage", getWage(),"hours worked",getHours());
			} 
                     
}

