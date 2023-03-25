/*
 * File name: CommissionProgrammer.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */

/**
 * CommissionProgrammer class extends Programmer.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class CommissionProgrammer extends Programmer { 
/**
 * gross weekly sales
 */
private double grossSales; 
/**
 * commission percentage
 */
private double commissionRate; 

/**
 * 
 * @param firstName first name
 * @param lastName last name 
 * @param socialSecurityNumber social security number
 * @param grossSales gross weekly sales
 * @param commissionRate commission percentage
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * 
 * @param grossSales gross weekly sales
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}
this.grossSales = grossSales;
} 

/**
 * 
 * @return double gross weekly sales
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * 
 * @param commissionRate commission percentage
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * 
 * @return double commission percentage
 */
public double getCommissionRate() {
return commissionRate;
} 

@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                      

@Override      
public String toString() {
	return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %s", 
			  "commission programmer", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(),"commission rate",getCommissionRate());
			} 


}

