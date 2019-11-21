package ua.epam.hw4Test;

import org.junit.Test;
import ua.epam.hw4.receipt.AppView;
import ua.epam.hw4.receipt.BusinessLogic;
import ua.epam.hw4.receipt.Receipt;

import static org.junit.Assert.assertEquals;

public class AppViewTest {
    AppView a = new AppView();
    BusinessLogic businessLogic = new BusinessLogic();
    double input1 = 500.50;
    double input2 = 450.45;
    Receipt receipt = businessLogic.generateAmount(input1,new Receipt());

    @Test
    public void testAppViewTotalPrice() {
        assertEquals(receipt.getTotalPrice(),input1,0.0);
    }
    @Test
    public void testAppViewDiscountPrice() {
        assertEquals(receipt.getDiscountPrice(),input2,0.0);
    }
}
