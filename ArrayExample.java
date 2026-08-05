public class ArrayExample {
    public static void main(String[] args) {

        int[] marks = {85, 90, 25, 88, 89};
        int total = 0;
        double average;

        System.out.println("Student marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            total = total + marks[i];
        }

        average = (double) total / marks.length;

        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + average);
    }
}
