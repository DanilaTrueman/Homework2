package Additionally.Privat;

public class Main {

    public static void main(String[] args) {
        GetAndSet example = new GetAndSet();

        int value = example.getExampleVar();
        System.out.println(value);

        example.setExampleVar(20);

        value = example.getExampleVar();
        System.out.println(value);
    }
}
