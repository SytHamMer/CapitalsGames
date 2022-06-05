import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame {

    public Windows(){
        setTitle("CapitalsGames");
        setSize(600,600);


        JMenuBar mb =  new JMenuBar();
        JMenu games = new JMenu("Games");
        games.add(new JCheckBox("Capital"));
        games.add(new JCheckBox("Country"));
        games.add(new JCheckBox("List"));
        mb.add(games);
        JMenu questions =   new JMenu("Questions");
        questions.add(new JCheckBox("10"));
        questions.add(new JCheckBox("20"));
        questions.add(new JCheckBox("50"));
        questions.add(new JCheckBox("100"));
        questions.add(new JCheckBox("All"));
        mb.add(questions);
        this.setJMenuBar(mb);

        JButton go = new JButton("Let's go !");
        this.getContentPane().setLayout(new BorderLayout());
        this.add(go,BorderLayout.SOUTH);
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Windows f = new Windows();
        f.setVisible(true);



    }

}
