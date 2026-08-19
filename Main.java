interface Calculator {
    void add();
    void subtract();
    void multiply();
}

class Demo implements Calculator {

    public void add() {
        int a = 10;
        int b = 5;
        System.out.println("Addition = " + (a + b));
    }

    public void subtract() {
        int a = 10;
        int b = 5;
        System.out.println("Subtraction = " + (a - b));
    }

    public void multiply() {
        int a = 10;
        int b = 5;
        System.out.println("Multiplication = " + (a * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.add();
        obj.subtract();
        obj.multiply();
    }
}