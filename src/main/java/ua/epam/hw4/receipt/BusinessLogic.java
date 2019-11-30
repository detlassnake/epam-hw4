package ua.epam.hw4.receipt;

import java.util.Date;

public class BusinessLogic {
    public Receipt generateReceipt(double amount) {
        Receipt receipt = new Receipt();
        receipt.setTotalPrice(amount);
        receipt.setDate(new Date());
        if (amount >= 0 && amount <= 499.9) {
            receipt.setDiscountPrice(amount - (amount / 100) * 5);
            receipt.setDiscount(5);
            return receipt;
        } else if (amount >= 500 && amount <= 999.9) {
            receipt.setDiscountPrice(amount - (amount / 100) * 10);
            receipt.setDiscount(10);
            return receipt;
        } else if (amount >= 1000) {
            receipt.setDiscountPrice(amount - (amount / 100) * 15);
            receipt.setDiscount(15);
            return receipt;
        }
        return receipt;
    }
}