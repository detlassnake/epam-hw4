package ua.epam.hw4Test.receiptTest;

import org.junit.Before;
import org.junit.Test;
import ua.epam.hw4.receipt.AppView;
import ua.epam.hw4.receipt.BusinessLogic;
import ua.epam.hw4.receipt.Receipt;

import static org.junit.Assert.assertEquals;

public class AppViewTest {
    AppView a = new AppView();
    BusinessLogic businessLogic;
    Receipt receipt;
    double input1 = 500.50;
    double input2 = 450.45;

    @Before
    public void setUp() {
        businessLogic = new BusinessLogic();
        receipt = businessLogic.generateReceipt(input1);
    }

    @Test
    public void testAppViewTotalPrice() {
        setUp();
        assertEquals(receipt.getTotalPrice(),input1,0.0);
    }
    @Test
    public void testAppViewDiscountPrice() {
        setUp();
        assertEquals(receipt.getDiscountPrice(),input2,0.0);
    }
}
