class Parent {
    final void display() {
        System.out.print("This is a final method");
    }
}

public class FinalKeyWord extends Parent {
    public static void main(String[] args) {
        FinalKeyWord obj = new FinalKeyWord();
        obj.display();
    }
}
