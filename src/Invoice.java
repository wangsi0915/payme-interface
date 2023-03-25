/*
 * File name: Invoice.java
 * Author: Si Wang 041084199
 * Course: CST8284 – OOP
 * Assignment: Lab 6
 * Date: Mar 21, 2023
 * Professor: Zeinab Bayati
 * Purpose: The Lab 6 focuses on abstract classes, inheritance, polymorphism and interfaces to implement 
 * polymorphic behavior on an interface..
 */
/**
 * Invoice class implements Payme.
 * @author Si Wang
 * @version JDK 17.0.4.1
 * @since 17.0.4.1
 * @see java.lang.String
 */
public class Invoice implements Payme {
/**
 * part number
 */
private String partNumber; 
/**
 * part description
 */
private String partDescription;
/**
 * the quantity of the item
 */
private int quantity;
/**
 * price per item
 */
private double pricePerItem;

/**
 * four-argument constructor
 * @param part part number
 * @param description part description
 * @param count the quantity of the item
 * @param price price per item
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

/**
 * 
 * @param part part number
 */
public void setPartNumber(String part) {
 partNumber = part; 
}

/**
 * @return String
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * 
 * @param description part description
 */
public void setPartDescription(String description) {
 partDescription = description; 
}

/**
 * @return String
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * 
 * @param count the quantity of the item
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/**
 * @return int 
 */
public int getQuantity() {
 return quantity;
}

/**
 * 
 * @param price price per item
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/**
 * @return double price per item
 */
public double getPricePerItem() {
 return pricePerItem;
}

@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


