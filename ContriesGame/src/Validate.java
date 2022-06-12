import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Validate  implements ActionListener{
    private Windows f;
    public JPanel secondPage, listPage;
    public JLabel quest,time,score,lcontries,lcapitals;
    public JTextField ans;
    public JButton validate, letsgo; //si on ne peut pas validé avec une touche 


    public Validate(Windows cb){
        this.f =cb;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println( "test" );

        int a = f.WhichChoice(f.cap, f.coun, f.list,f.rules, f.warning);
        switch(a){
            case 1:
            //#############################################Interface questions##################################################################
            f.getContentPane().removeAll();
            secondPage =  new JPanel();
            time = new JLabel("Time: ");
            score = new JLabel("Score :");
            quest = new JLabel("...");
            ans = new JTextField();
            JPanel down = new JPanel();
            down.setLayout(new GridLayout(1,2,200,0));
            down.add(time);
            down.add(score);
            JPanel center = new JPanel();
            center.setLayout(new GridLayout(2,1,0,200));
            center.add(quest);
            center.add(ans);
            secondPage.setLayout(new BorderLayout());
            secondPage.add(center, BorderLayout.CENTER); //Amélioration possible sur la beauté du truc.
            secondPage.add(down, BorderLayout.SOUTH);
            f.add(secondPage);

            //####################################################################################################################################
            
            //Panel avec les questions qui sont les pays et réponses capitales PRENDRE EN COMPTE LE NOMBRE DE QUESTIONS
            break;
            case 2:
            f.getContentPane().removeAll();
            secondPage =  new JPanel();
            time = new JLabel("Time: ");
            score = new JLabel("Score :");
            quest = new JLabel("...");
            ans = new JTextField();
            JPanel down2 = new JPanel();
            down2.setLayout(new GridLayout(1,2,200,0));
            down2.add(time);
            down2.add(score);
            JPanel center2 = new JPanel();
            center2.setLayout(new GridLayout(2,1,0,200));
            center2.add(quest);
            center2.add(ans);
            secondPage.setLayout(new BorderLayout());
            secondPage.add(center2, BorderLayout.CENTER); //Amélioration possible sur la beauté du truc.
            secondPage.add(down2, BorderLayout.SOUTH);
            f.add(secondPage);
            //Panel avec les questions qui sont les capitales et réponses pays  PRENDRE EN COMPTE LE NOMBRE DE QUESTIONS
            break;
            case 3:
            f.getContentPane().removeAll();
            listPage = new JPanel();
            letsgo = new JButton("Let's go !");
            lcontries = new JLabel();//y mettre la liste des pays. 

            
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
