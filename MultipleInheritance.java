interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {

    public void displayA() {
        System.out.println("This is interface A");
    }

    public void displayB() {
        System.out.println("This is interface B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        C object = new C();

        object.displayA();
        object.displayB();
    }
}