import java.awt.*;
import java.awt.event.*;

class ArrayText extends Frame implements ActionListener {
    int a[] = new int[100];
    String s = "";
    TextField tf1, tf2;

    public static void main(String args[]) {
        Frame a = new ArrayText();
        a.setTitle("ArrayText Index Program");
        a.setSize(300, 300);
        a.setVisible(true);
    }

    ArrayText() {
        for (int i = 0; i < 100; i++) {
            a[i] = (int) Math.random() + i;
        }
        Panel p1 = new Panel();
        Label l1 = new Label("Enter Index : ");
        Label l2 = new Label("Value : ");
        tf1 = new TextField("", 5);
        tf2 = new TextField("", 15);
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        Button b1 = new Button("Show");
        p1.add(b1);
        b1.addActionListener(this);
        add(p1);
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            try {
                int i = Integer.parseInt(tf1.getText());
                s = "" + a[i];
                tf2.setText(s);
            } catch (Exception ae) {
                s = "ArrayText Out Of Bound";
                tf2.setText(s);
            }
        }
    }
}
