import javax.swing.*;
import java.awt.event.*;

public class Validate  implements ActionListener{
    private Windows f;


    public Validate(Windows cb){
        this.f =cb;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println( "test" );

        int a = f.WhichChoice(f.cap, f.coun, f.list, f.warning);
        switch(a){
            case 1:
            //Panel avec les questions qui sont les pays et réponses capitales
            break;
            case 2:
            //Panel avec les questions qui sont les capitales et réponses pays
            break;
            case 3:
            //Panel qui affiche la liste des pays et leurs capitales sur le côtés.
            break; 

        }

        f.validate();
        f.repaint();

        
    }


    
}
