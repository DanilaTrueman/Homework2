package privat;

public class main {

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        int value = example.getExampleVar();
        System.out.println(value);

        example.setExampleVar(20);

        value = example.getExampleVar();
        System.out.println(value);
    }
}
