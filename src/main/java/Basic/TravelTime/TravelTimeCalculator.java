package Basic.TravelTime;

public class TravelTimeCalculator {

    public static void main(String[] args) {
        final int distance = 20;
        final double taxiSpeed = 80.0;

        double travelTime = distance / taxiSpeed;

        final double slowdownCoefficient = 1.2;

        double returnTime = travelTime * slowdownCoefficient;

        System.out.println("Время пути от дома до офиса: " + travelTime + " ч");
        System.out.println("Время пути на такси с работы домой: " + returnTime + " ч");

    }
}
