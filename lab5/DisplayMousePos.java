import java.awt.*;
import java.awt.event.*;

public class DisplayMousePos extends Frame implements MouseListener, ActionListener {

    private Button bt;
    private int x, y;

    public DisplayMousePos() {
        setTitle("Mouse Listener And Action Listener");
        addMouseListener(this);
        setLayout(new FlowLayout());
        bt = new Button("Close");
        add(bt);
        bt.addActionListener(this);
    }

    public static void main(String s[]) {
        Frame mf = new DisplayMousePos();
        mf.setSize(300, 300);
        mf.setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void paint(Graphics g) {
        g.drawString("X = " + x + " AND Y = " + y, x, y);
    }

    public void actionPerformed(ActionEvent e) {
        String st = e.getActionCommand();
        if (e.getSource() instanceof Button) {
            if (st.equals("Close")) {
                System.exit(0);
            }
        }
    }

}
