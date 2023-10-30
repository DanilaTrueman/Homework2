package Wrappers;

public class Wrappers {

    public static void main(String[] args) {
        Byte byteWrapper = Byte.valueOf((byte) 10);
        Short shortWrapper = Short.valueOf((short) 20);
        Integer intWrapper = Integer.valueOf(30);
        Long longWrapper = Long.valueOf(40L);
        Float floatWrapper = Float.valueOf(50.5f);
        Double doubleWrapper = Double.valueOf(60.6);
        Character charWrapper = Character.valueOf('A');
        Boolean booleanWrapper = Boolean.valueOf(true);

        System.out.println("byteWrapper: " + byteWrapper);
        System.out.println("shortWrapper: " + shortWrapper);
        System.out.println("intWrapper: " + intWrapper);
        System.out.println("longWrapper: " + longWrapper);
        System.out.println("floatWrapper: " + floatWrapper);
        System.out.println("doubleWrapper: " + doubleWrapper);
        System.out.println("charWrapper: " + charWrapper);
        System.out.println("booleanWrapper: " + booleanWrapper);
    }
}