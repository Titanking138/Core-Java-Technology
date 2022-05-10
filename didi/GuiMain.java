
import java.awt.*;
import java.util.*;
import java.awt.event.*;
/**
 * GuiMain
 */
public class GuiMain extends Frame implements ActionListener{

    TextField idTf,nameTf,sessionTf;
    Button submitBt;
    Choice memberCh;
    TextArea detailTa;
    GuiMain(String title){
        nameTf = new TextField();
        sessionTf = new TextField();
        idTf = new TextField();
        // member = new TextField();
        memberCh = new Choice();
        memberCh.add("1");
        memberCh.add("2");
        memberCh.add("3");
        memberCh.add("4");
        memberCh.add("5");
        submitBt = new Button("Submit");
        Panel p = new Panel();
        p.add(new Label("Enter name :"));
        p.add(idTf);
        p.add(new Label("Enter name :"));
        p.add(nameTf);
        p.add(new Label("Enter number of session :"));
        p.add(sessionTf);
        p.add(new Label("Enter total number of people :"));
        p.add(memberCh);
        // p.add(member);
        p.add(submitBt);

        Panel pe = new Panel();
        pe.add(detailTa);

        Panel ps = new Panel();
        submitBt.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        int id = getN(Long.parseLong(idTf.getText().trim()));
        int session = Integer.parseInt(sessionTf.getText().trim());
        int member = Integer.parseInt(memberCh.getItem(memberCh.getSelectedIndex()));
        String name = nameTf.getText();
        
        while (!checkName(name)) {
           
        }
        
        while (!checkSession(session)) {
           
        }
        
    }

    private boolean checkName(String name) {
        if (name.isBlank()) {
            System.out.println("\t\t ERROR ===> Name can't be empty");
            return false;
        }
        return true;
    }
    
    boolean checkSession(int session) {
        if ((session == 0)) {
            System.out.println("\t\t ERROR ===> session can't be 0");
            return false;
        }
        return true;
    }

    int getN(long id)
    {
        int N = 0;
        try {
            while (id != 0) {

                int temp = Math.toIntExact(id % 10);
                N = Math.max(temp, N);
                id = id / 10;
            }
            if (N < 3) {
                N = 3;
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't able to convert long to Int");
        }
        return N;
    }
}

