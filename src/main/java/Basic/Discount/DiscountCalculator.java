package Basic.Discount;

public class DiscountCalculator {

    public static void main(String[] args) {
        final int shirtPrice = 1000;
        final int selectedShirts = 1;
        final int discountThreshold = 3;

        int shirtsToBuy = discountThreshold - selectedShirts;
        final int selectedShirtsPrice = selectedShirts * shirtPrice;
        int additionalShirtsPrice = shirtsToBuy * shirtPrice;

        final double discountPercentage = 0.3;

        double discountedPrice = (selectedShirtsPrice + additionalShirtsPrice) * (1 - discountPercentage);
        double discountedShirtPrice = discountedPrice / (selectedShirts + shirtsToBuy);
        double savedMoney = (selectedShirtsPrice + additionalShirtsPrice) - discountedPrice;
        double freeShirts = selectedShirts + shirtsToBuy - (discountedPrice / shirtPrice);

        System.out.println("Количество рубашек, которые надо докупить для получения скидки: " + shirtsToBuy);
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + selectedShirtsPrice);
        System.out.println("Общая цена рубашек, которые надо докупить для получения скидки: " + additionalShirtsPrice);
        System.out.println("Цена всех рубашек со скидкой: " + discountedPrice);
        System.out.println("Цена одной рубашки со скидкой: " + discountedShirtPrice);
        System.out.println("Количество сэкономленных денег: " + savedMoney);
        System.out.println("Количество рубашек, полученных на халяву: " + freeShirts);

    }
}