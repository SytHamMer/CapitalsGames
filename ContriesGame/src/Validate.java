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

        int a = f.WhichChoice(f.cap, f.coun, f.list,f.rules, f.warning);
        switch(a){
            case 1:
            //Panel avec les questions qui sont les pays et réponses capitales PRENDRE EN COMPTE LE NOMBRE DE QUESTIONS
            break;
            case 2:
            //Panel avec les questions qui sont les capitales et réponses pays  PRENDRE EN COMPTE LE NOMBRE DE QUESTIONS
            break;
            case 3:
            //Panel qui affiche la liste des pays et leurs capitales sur le côtés.
            break; 
            case 4:
            //Panel avec affichage des règles (accents espaces majuscules etc...)
            //mais aussi quel mode correspond à quoi.

        }

        f.validate();
        f.repaint();

        
    }


    
}
