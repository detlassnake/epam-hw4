package ua.epam.hw4.receipt;

import java.util.Scanner;

public class AppView {
    private static final String ENTER_AMOUNT_TEXT = "Enter the amount: ";
    private static final String ERROR_TEXT = "error";
    private static Scanner in = new Scanner(System.in);

    public Receipt start() {
        System.out.println(ENTER_AMOUNT_TEXT);
        BusinessLogic businessLogic = new BusinessLogic();
        Receipt receipt = businessLogic.generateAmount(inputAmount(),new Receipt());
        System.out.println(receipt.toString());
        return receipt;
    }

    public double inputAmount() {
        while (!in.hasNextDouble()) {
            System.out.println(ERROR_TEXT);
            in.next();
        }
        return in.nextDouble();
    }
}
