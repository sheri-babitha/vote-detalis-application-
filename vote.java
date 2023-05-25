import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class vote extends Frame{
     vote(){ 
setTitle("vote details");

         Label l = new Label("CHOSE YOUR PARTY");
         l.setBounds(20,40,200,30);
         Choice l1 = new Choice();
         l1.add("BJP");
         l1.add("Congress");
         l1.add("TRS");
         l1.setBounds(20,70,200,35);
         Label p = new Label("ENTER YOUR AGE");
         p.setBounds(20,95,200,30);
         TextField P1 = new TextField();
         P1.setBounds(140,95,40,25);

         Label m = new Label("GENDER");
         Checkbox m1 = new Checkbox("Female") ;
         Checkbox m2 = new Checkbox("Male");
         m.setBounds(20,120,100,35);
         m1.setBounds(20,150,80,35);
         m2.setBounds(150,150,100,35);
         Label k= new Label("Name");
         k.setBounds(20,200,50,30);
         TextField k1 = new TextField();
         k1.setBounds(85,200,150,25);
         Label h= new Label("Voter ID ");
         h.setBounds(20,250,50,30);
         TextField h1 = new TextField();
         h1.setBounds(85,250,150,25);
       add(h);
       add(h1);
     add(k);
     add(k1);
        add(m);
        add(m1);
        add(m2);
         add(P1);
         add(p);
         add(l1);
         add(l);
    setSize(300,300);
         setLayout(null);
        setVisible(true);
         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 super.windowClosing(e);

                 Frame frame =(Frame)e.getSource();
                 frame.dispose();
             }
         });
     }


         public static void main(String[] args) {
         vote in = new vote();

    }

}
