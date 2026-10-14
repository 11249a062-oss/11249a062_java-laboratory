import java.awt.*;

public class Palette extends Frame {
    Palette() {
        setTitle("Color Palette");
        setLayout(new GridLayout(2, 3));

        Panel p1 = new Panel();
        p1.setBackground(Color.RED);

        Panel p2 = new Panel();
        p2.setBackground(Color.GREEN);

        Panel p3 = new Panel();
        p3.setBackground(Color.BLUE);

        Panel p4 = new Panel();
        p4.setBackground(Color.YELLOW);

        Panel p5 = new Panel();
        p5.setBackground(Color.PINK);

        Panel p6 = new Panel();
        p6.setBackground(Color.CYAN);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Palette();
    }
}