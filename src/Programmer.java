/*
 * File name: Programmer.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */

/**
 * Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public abstract class Programmer implements Payme  {
/**
 * The first name of programmer
 */
private String firstName;
/**
 * The last name of programmer
 */
private String lastName;
/**
 * The social security number of programmer
 */
private String socialSecurityNumber;


/**
 * three-argument constructor
 * @param first The first name of programmer
 * @param last The last name of programmer
 * @param ssn The social security number of programmer
 */
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

/**
 * @return String the first Name
 */
public String getFirstName() {
	return firstName;
}

/** 
 * @return String the last Name
 */
public String getLastName() {
	return lastName;
}

/**
 * @return String the social Security Number
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 

} 


