import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Windows extends JFrame {




    public JCheckBox cap, coun,list,ten,twenty,fifty,hundred,all,rules;
    public JPanel firstPage;
    public JLabel warning;




    public Windows(){
        setTitle("CapitalsGames");
        setSize(600,600);


        JMenuBar mb =  new JMenuBar();
        JMenu games = new JMenu("Games");
        cap = new JCheckBox("Capital");
        coun = new JCheckBox("Country");
        list = new JCheckBox("List");
        rules = new JCheckBox("Rules");        
        games.add(rules);
        games.add(cap);
        games.add(coun);
        games.add(list);
        mb.add(games);
        JMenu questions =   new JMenu("Questions");
        ten = new JCheckBox("10");
        twenty = new JCheckBox("20");
        fifty = new JCheckBox("50");
        hundred = new JCheckBox("100");
        all = new JCheckBox("All");
        questions.add(ten);
        questions.add(twenty);
        questions.add(fifty);
        questions.add(hundred);
        questions.add(all);
        mb.add(questions);
        this.setJMenuBar(mb);
        firstPage = new JPanel();
        warning = new JLabel();
        JButton go = new JButton("Let's go !");
        go.addActionListener(new Validate(this));

        firstPage.setLayout(new BorderLayout());
        firstPage.add(go, BorderLayout.SOUTH);
        firstPage.add(warning, BorderLayout.CENTER);
        this.add(firstPage);

    }

    public int WhichChoice(JCheckBox cap, JCheckBox coun, JCheckBox list,JCheckBox rules, JLabel warning){
        int ans = 0;
       if (cap.isSelected() && coun.isSelected() == false && list.isSelected() == false && rules.isSelected() == false){
        ans = 1;
        warning.setText("");
       }
       if (coun.isSelected()&& cap.isSelected() == false && list.isSelected() == false && rules.isSelected() == false){
        ans = 2;
        warning.setText("");
       }
       if (list.isSelected()&& coun.isSelected() == false && cap.isSelected() == false && rules.isSelected() == false){
        ans = 3;
        warning.setText("");
       }
       if (rules.isSelected()&& coun.isSelected() == false && cap.isSelected() == false && list.isSelected() == false){
        ans = 4;
        warning.setText("");
       }
       if(ans == 0){
          warning.setText("Veuillez selectionner qu'une seule case.");
       }
       System.out.println( ans );
       return ans;
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Windows f = new Windows();
        f.setVisible(true);
       /* int i = Test.Random();
        Test.RandomChoice(Test.countries,i);
        Test.RandomChoice(Test.capitales,i); 
        Test.series(Test.countries, Test.capitales, 5);*/

    }

}
