// package lab4;

import java.awt.*;

abstract class Shapes extends Frame {
    public int x, y;

    public abstract int area();

    public abstract void display();
}

class Rectengal extends Shapes {
    public int l, w;

    public Rectengal(int x, int y, int l, int w) {
        super();
        setSize(300, 400);
        setVisible(true);
        this.x = x;
        this.y = y;
        this.l = l;
        this.w = w;
        // repaint();
    }

    public int area() {
        return l * w;
    }

    public void display() {

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("rect call;");
        System.out.println("" + area());
        g.fillRect(x, y, l, w);
    }

}

class Circle extends Shapes {

    private int d;

    public Circle(int x, int y, int d) {
        super();
        setSize(300, 400);
        setVisible(true);
        this.x = x;
        this.y = y;
        this.d = d;
        // repaint();
    }

    @Override
    public int area() {
        return (int) (3.14 * d * d);
    }

    @Override
    public void display() {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint call circle;");
        System.out.println("" + area());
        g.drawOval(x, y, d, d);
    }

}

public class Shape {
    public static void main(String[] args) {
        new Circle(100, 100, 60);
        new Rectengal(100, 100, 50, 50);
        // c1.display();
        // r1.display();
    }
}
