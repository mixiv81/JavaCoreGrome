package Lesson10.abstractOrder;

import java.util.Date;

public abstract class Order {
    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed = new Date();
    private Date dateShipped;
    private String shipFromCity;
    private String ShipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = new Date();
        this.shipFromCity = shipFromCity;
        this.ShipToCity = ShipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    abstract void validateOrder();
    abstract void calculatePrice();

    void confirmShipping(){
        if(dateShipped == null)
            dateShipped = new Date();
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipFromSity() {
        return shipFromCity;
    }

    public String getGetShipToCity() {
        return ShipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
