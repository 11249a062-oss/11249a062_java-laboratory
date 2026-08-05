class statickeyword {
    static String college = "ABC College";
    String name;

    statickeyword(String n) {
        name = n;
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }

    public static void main(String[] args) {
        statickeyword s1 = new statickeyword("Rahul");
        statickeyword s2 = new statickeyword("Anjali");

        s1.display();
        s2.display();
    }
}
