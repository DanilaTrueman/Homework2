package Basic.GlassHalfFull;

public class GlassHalfFull {

    public static void main(String[] args) {
        final int glassVolume = 300;
        final double filledPercentage = 50.0;
        double waterVolume = glassVolume * (filledPercentage / 100.0);

        System.out.println("Количество миллилитров воды в стакане: " + waterVolume);

    }
}