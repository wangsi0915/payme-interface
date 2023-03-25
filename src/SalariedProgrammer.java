/*
 * File name: SalariedProgrammer.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */

/**
 * SalariedProgrammer concrete class extends abstract class Programmer.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class SalariedProgrammer extends Programmer  {
/**
 * weekly salary
 */
private double weeklySalary;

/**
 * 
 * @param firstName first name
 * @param lastName last name
 * @param socialSecurityNumber social security number
 * @param weeklySalary weekly salary
 */
public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * 
 * @param weeklySalary weekly salary
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * 
 * @return double weekly salary
 */
public double getWeeklySalary() {
return weeklySalary;
} 

 
@Override  
public String toString() {
	return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f", 
			  "salaried Programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "weekly salary", getWeeklySalary());
			} 

@Override
public double getPaymentAmount() {
	return getWeeklySalary();
}
                                            
}

