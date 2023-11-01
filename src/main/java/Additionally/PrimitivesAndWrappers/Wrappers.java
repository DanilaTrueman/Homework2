package Additionally.PrimitivesAndWrappers;

public class Wrappers {

    public static void main(String[] args) {
        Integer integerWrapper = new Integer(10);
        Long longWrapper = new Long(1000L);
        Float floatWrapper = new Float(3.14f);
        Double doubleWrapper = new Double(3.14159);
        Character characterWrapper = new Character('a');
        Boolean booleanWrapper = new Boolean(true);
        Byte byteWrapper = new Byte((byte) 127);
        Short shortWrapper = new Short((short) 100);

        System.out.println("Integer Wrapper: " + integerWrapper);
        System.out.println("Long Wrapper: " + longWrapper);
        System.out.println("Float Wrapper: " + floatWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Character Wrapper: " + characterWrapper);
        System.out.println("Boolean Wrapper: " + booleanWrapper);
        System.out.println("Byte Wrapper: " + byteWrapper);
        System.out.println("Short Wrapper: " + shortWrapper);

    }
}