package Basic.Testers;

public class Testers {

    public static void main(String[] args) {
        final int coders = 10;
        final int testersOnCoder = 2;
        final int supportOnCoder = 1;

        int testersNeeded = coders * testersOnCoder;
        int supportNeeded = coders * supportOnCoder;
        int totalTechnicalStaff = coders + supportNeeded + testersNeeded;

        System.out.println("Количество тестировщиков, требуемое на проекте: " + testersNeeded);
        System.out.println("Количество поддержки, требуемое на проекте: " + supportNeeded);
        System.out.println("Общее количество технических специалистов на проекте: " + totalTechnicalStaff);

    }
}