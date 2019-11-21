package ua.epam.hw4;

import java.util.Date;

public class Receipt {
    private Date date;
    private String discount;
    private double discountPrice;
    private double totalPrice;

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public String toString() {
        return "Total price: " + this.totalPrice + ", Discount: " + this.discount + ", Discount price: " + this.discountPrice + ", Date: " + this.date;
    }
}

