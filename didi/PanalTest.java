import java.awt.*;
import java.awt.event.*;
import java.util.*;

class PanalTest extends Frame implements ActionListener {

  Label name_error, session_error;
  TextField name_input, session_input, id_input;
  Choice member_input;
  Button submit;

  PanalTest(String title) {
    super(title);
    Panel p = new Panel();
    name_input = new TextField();
    name_error = new Label("");
    session_error = new Label("");
    member_input = new Choice();
    member_input.add("1");
    member_input.add("2");
    member_input.add("3");
    member_input.add("4");
    member_input.add("5");
    session_input = new TextField();
    submit = new Button("submit");

    // adding in to frame
    p.add(new Label("Name : "));
    p.add(name_error);
    p.add(name_input);
    p.add(new Label("Member : "));
    p.add(member_input);
    p.add(new Label("Session : "));
    p.add(session_error);
    p.add(session_input);
    p.add(submit);
    add(p);

    submit.addActionListener(this);

    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      }
    );
  }

  public void actionPerformed(ActionEvent e) {
    // add event;
    int session = Integer.parseInt(session_input.getText().trim());
    int member = Integer.parseInt(
      memberCh.getItem(member_input.getSelectedIndex())
    );
    String name = name_input.getText();

    while (!checkName(name)) {
        name_error.setText("Enter Name ");
        repaint();
    }

    while (!checkSession(session)) {
        session_error.setText("session must be greater or equal to 1");
        repaint();
    }
  }

  boolean checkName(String name) {
        if (name.isBlank()) {
            System.out.println("\t\t ERROR ===> Name can't be empty");
            return false;
        }
        return true;
    }

    boolean checkSession(int session)
    {
        if((session == 0))
        {
            System.out.println("\t\t ERROR ===> session can't be 0");
            return false;
        }
        return true;
    }

  public static void main(String[] arg) {
    Frame f = new PanelTest("test");
    f.setSize(600, 600);
    f.setVisible(true);
  }
}
