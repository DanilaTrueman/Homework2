package Basic.Mortgage;

public class MortgagePayment {

    public static void main(String[] args) {
        final int apartCost = 20000000;
        final double initialPaymentPercentage = 30.0;
        double initialPaymentAmount = apartCost * initialPaymentPercentage / 100;

        System.out.println("Сумма первоначального взноса: " + initialPaymentAmount + " rub");
    }
}