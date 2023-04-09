import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class Main {
  
  public static void main(String[] args) {
    JTextField cite1 = new JTextField("Citation 1");
    JTextField cite2 = new JTextField("Citation 2");
    JTextField cite3 = new JTextField("Citation 3");
    
    // Defines a JFrame for the Citation 1 Screen, Citation 2 Screen,Citation 3 Screen, and Citation List Screen
    
    JFrame frame1 = new JFrame("Citation 1");
    frame1.setSize(500, 500);
    frame1.setLayout(null);
    
    JFrame frame2 = new JFrame("Citation 2");
    frame2.setSize(500, 500);
    frame2.setLayout(null);

    JFrame frame3 = new JFrame("Citation 3");
    frame3.setSize(500, 500);
    frame3.setLayout(null);

    JFrame frame4 = new JFrame("Citation List");
    frame4.setSize(500, 500);
    frame4.setLayout(null);

    //Makes frame1 visible
    frame1.setVisible(true);
   
    //frame1

    //Creates components of frame1, including labels, buttons, and text inputs
    JLabel title1 = new JLabel("Citation 1");
    JButton a1 = new JButton("Next");
    JButton a2 = new JButton("Back");
    JTextField a3 = new JTextField (200);
    JTextField a4 = new JTextField (200);
    JTextField a5 = new JTextField (200);
    JTextField a6 = new JTextField (200);

    //Set location and size for each component of frame1
    //Set font and color for title1
    a1.setBounds(500,600,200,50);
    a2.setBounds(100,600,200,50);
    a3.setBounds(300,200,200,50);
    a4.setBounds(300,300,200,50);
    a5.setBounds(300,400,200,50);
    a6.setBounds(300,500,200,50);
    title1.setBounds(325,100,200,50);
    title1.setForeground(Color.RED);
    title1.setFont(new Font("Arial", Font.PLAIN, 32));

    //Instructions for each textfield
    JLabel nameInstruct1 = new JLabel("Enter the author's name as 'Last name, First name':");
    JLabel authorInstruct1 = new JLabel("Enter the publisher of the book:");
    JLabel pubInstruct1 = new JLabel("Enter the title of the book:");
    JLabel yearInstruct1 = new JLabel("Enter the year the book was published:");
    nameInstruct1.setBounds(300,150,400,50);
    authorInstruct1.setBounds(300,250,400,50);
    pubInstruct1.setBounds(300,350,400,50);
    yearInstruct1.setBounds(300,450,400,50);
    nameInstruct1.setForeground(Color.RED);
    nameInstruct1.setFont(new Font("Arial", Font.PLAIN, 12));
    authorInstruct1.setForeground(Color.RED);
    authorInstruct1.setFont(new Font("Arial", Font.PLAIN, 12));
    pubInstruct1.setForeground(Color.RED);
    pubInstruct1.setFont(new Font("Arial", Font.PLAIN, 12));
    yearInstruct1.setForeground(Color.RED);
    yearInstruct1.setFont(new Font("Arial", Font.PLAIN, 12));
    
    //Adds components to frame1
    frame1.add(title1);
    frame1.add(a1);
    frame1.add(a2);
    frame1.add(a3);
    frame1.add(a4);
    frame1.add(a5);
    frame1.add(a6);
    frame1.add(nameInstruct1);
    frame1.add(authorInstruct1);
    frame1.add(pubInstruct1);
    frame1.add(yearInstruct1);
    
    //Saves values inputted into text fields and sets frame to frame2
    a1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name1 = a3.getText();
        String book1 = a4.getText();
        String pub1 = a5.getText();
        String year1 = a6.getText();
        cite1.setText(name1 + ". " + book1 + ". " + pub1 + ", " + year1 + ".");
        frame1.setVisible(false);
        frame2.setVisible(true);
      }    });
    //Sets frame to frame4
    a2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame1.setVisible(false);
        frame4.setVisible(true);     
      }    });

    //frame2

    // Creates components of frame2, including labels, buttons, and text inputs
    JLabel title2 = new JLabel("Citation 2");
    JButton b1 = new JButton("Next");
    JButton b2 = new JButton("Back");
    JTextField b3 = new JTextField (200);
    JTextField b4 = new JTextField (200);
    JTextField b5 = new JTextField (200);
    JTextField b6 = new JTextField (200);

    //Set location and size for each component of frame2
    //Set font and color for title2
    b1.setBounds(500,600,200,50);
    b2.setBounds(100,600,200,50);
    b3.setBounds(300,200,200,50);
    b4.setBounds(300,300,200,50);
    b5.setBounds(300,400,200,50);
    b6.setBounds(300,500,200,50);
    title2.setBounds(325,100,200,50);
    title2.setForeground(Color.RED);
    title2.setFont(new Font("Arial", Font.PLAIN, 32));

    //Instructions for each textfield
    JLabel nameInstruct2 = new JLabel("Enter the author's name as 'Last name, First name':");
    JLabel authorInstruct2 = new JLabel("Enter the publisher of the book:");
    JLabel pubInstruct2 = new JLabel("Enter the title of the book:");
    JLabel yearInstruct2 = new JLabel("Enter the year the book was published:");
    nameInstruct2.setBounds(300,150,400,50);
    authorInstruct2.setBounds(300,250,400,50);
    pubInstruct2.setBounds(300,350,400,50);
    yearInstruct2.setBounds(300,450,400,50);
    nameInstruct2.setForeground(Color.RED);
    nameInstruct2.setFont(new Font("Arial", Font.PLAIN, 12));
    authorInstruct2.setForeground(Color.RED);
    authorInstruct2.setFont(new Font("Arial", Font.PLAIN, 12));
    pubInstruct2.setForeground(Color.RED);
    pubInstruct2.setFont(new Font("Arial", Font.PLAIN, 12));
    yearInstruct2.setForeground(Color.RED);
    yearInstruct2.setFont(new Font("Arial", Font.PLAIN, 12));
    
    //Adds components to frame2
    frame2.add(title2);
    frame2.add(b1);
    frame2.add(b2);
    frame2.add(b3);
    frame2.add(b4);
    frame2.add(b5);
    frame2.add(b6);
    frame2.add(nameInstruct2);
    frame2.add(authorInstruct2);
    frame2.add(pubInstruct2);
    frame2.add(yearInstruct2);
  
    //Saves values inputted into text fields and sets frame to frame3
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name2 = b3.getText();
        String book2 = b4.getText();
        String pub2 = b5.getText();
        String year2 = b6.getText();
        frame2.setVisible(false);
        frame3.setVisible(true);
        cite2.setText(name2 + ". " + book2 + ". " + pub2 + ", " + year2 + ".");
      }    });
    //Sets frame to frame1
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame2.setVisible(false);
        frame1.setVisible(true);     
      }    });

    //frame3

    // Creates components of frame3, including labels, buttons, and text inputs
    JLabel title3 = new JLabel("Citation 3");
    JButton c1 = new JButton("Next");
    JButton c2 = new JButton("Back");
    JTextField c3 = new JTextField (200);
    JTextField c4 = new JTextField (200);
    JTextField c5 = new JTextField (200);
    JTextField c6 = new JTextField (200);


    //Set location and size for each component of frame3
    //Set font and color for title3
    c1.setBounds(500,600,200,50);
    c2.setBounds(100,600,200,50);
    c3.setBounds(300,200,200,50);
    c4.setBounds(300,300,200,50);
    c5.setBounds(300,400,200,50);
    c6.setBounds(300,500,200,50);
    title3.setBounds(325,100,200,50);
    title3.setForeground(Color.RED);
    title3.setFont(new Font("Arial", Font.PLAIN, 32));

    //Instructions for each textfield
    JLabel nameInstruct3 = new JLabel("Enter the author's name as 'Last name, First name':");
    JLabel authorInstruct3 = new JLabel("Enter the publisher of the book:");
    JLabel pubInstruct3 = new JLabel("Enter the title of the book:");
    JLabel yearInstruct3 = new JLabel("Enter the year the book was published:");
    nameInstruct3.setBounds(300,150,400,50);
    authorInstruct3.setBounds(300,250,400,50);
    pubInstruct3.setBounds(300,350,400,50);
    yearInstruct3.setBounds(300,450,400,50);
    nameInstruct3.setForeground(Color.RED);
    nameInstruct3.setFont(new Font("Arial", Font.PLAIN, 12));
    authorInstruct3.setForeground(Color.RED);
    authorInstruct3.setFont(new Font("Arial", Font.PLAIN, 12));
    pubInstruct3.setForeground(Color.RED);
    pubInstruct3.setFont(new Font("Arial", Font.PLAIN, 12));
    yearInstruct3.setForeground(Color.RED);
    yearInstruct3.setFont(new Font("Arial", Font.PLAIN, 12));
    
    //Adds components to frame3
    frame3.add(title3);
    frame3.add(c1);
    frame3.add(c2);
    frame3.add(c3);
    frame3.add(c4);
    frame3.add(c5);
    frame3.add(c6);
    frame3.add(nameInstruct3);
    frame3.add(authorInstruct3);
    frame3.add(pubInstruct3);
    frame3.add(yearInstruct3);
  
    //Saves values inputted into text fields and sets frame to frame4
    c1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name3 = c3.getText();
        String book3 = c4.getText();
        String pub3 = c5.getText();
        String year3 = c6.getText();
        frame3.setVisible(false);
        frame4.setVisible(true);
        cite3.setText(name3 + ". " + book3 + ". " + pub3 + ", " + year3 + ".");
      }    });
    //Sets frame to frame2
    c2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame3.setVisible(false);
        frame2.setVisible(true);     
      }    });

    //frame 4

    //Creates components of frame3, including labels and buttons
    // Set location and size for each component of frame0
    //Set font and color for title3
    //Adds each component of frame3
    JLabel title4 = new JLabel("Citation List");
    JButton d1 = new JButton("Next");
    JButton d2 = new JButton("Back");
    cite1.setBounds(250,200,500,50);
    cite1.setForeground(Color.BLACK);
    cite1.setFont(new Font("Arial", Font.PLAIN, 15));
    frame4.add(cite1);
    cite2.setBounds(250,250,500,50);
    cite2.setForeground(Color.BLACK);
    cite2.setFont(new Font("Arial", Font.PLAIN, 15));
    frame4.add(cite2);
    cite3.setBounds(250,300,500,50);
    cite3.setForeground(Color.BLACK);
    cite3.setFont(new Font("Arial", Font.PLAIN, 15));
    frame4.add(cite3);
    d1.setBounds(500,400,200,50);
    d2.setBounds(100,400,200,50);
    title4.setBounds(325,100,200,50);
    title4.setForeground(Color.RED);
    title4.setFont(new Font("Arial", Font.PLAIN, 32));

    //Sets frame to frame1
    d1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame4.setVisible(false);
        frame1.setVisible(true);
      }    });
    //Sets frame to frame3
    d2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame4.setVisible(false);
        frame3.setVisible(true);     
      }    });

    //Adds components to frame3
    frame4.add(title4);
    frame4.add(d1);
    frame4.add(d2);
    frame4.add(cite1);
    frame4.add(cite2);
    frame4.add(cite3);
  }
}