//import javax.swing.*;
//import java.awt.*;
//
//public class TryGUI {
//    //GUI attributes/Elements
//    //Ma'am sabi nyo po sa meeting natin na maganda daw laging may comments-
//    //kaso dumudumi yung workspace tapos something that is evident should not be
//    //always explicity be stated, or much rather stating the obvious
//    //anyways next na exercises I'll reduce the comments, kaya panoodin nyo po vids ko HHAHAHAHAHAH
//    //kasi sa vids may paliwanag and thought process behind the scenes bukod sa pag gogoogle ng syntax
//    int x = 0;
//    private JLabel label;
//    private JFrame frame;
//    private JPanel panel;
//    private JButton buttonWelcome;
//    private JButton buttonEscseq;
//    private JButton buttonTempconvert;
//    public TryGUI() {
////initialize lahat
//        frame = new JFrame();
//        buttonWelcome = new JButton("Welcome.java");
//        buttonEscseq = new JButton("Escseq.java");
//        buttonTempconvert = new JButton("Tempconvert.java");
//        panel = new JPanel();
//    }
//
//}
//
//public class FrontInterface
//{
//    public void FrontInterface()
//    {
//
//        frame.add(panel, BorderLayout.CENTER);
//        //BUTTONS NAMAN
//        //button attributes
//        //isapa ding ano eh yung reusable objects, kaya instead of creating many label, reuse existing label by modifying its value and properties
//        Dimension buttonSize = new Dimension(150, 50); // width=150, height=50
//        buttonWelcome.setPreferredSize(buttonSize);
//        buttonWelcome.setMaximumSize(buttonSize);
//        buttonEscseq.setPreferredSize(buttonSize);
//        buttonEscseq.setMaximumSize(buttonSize);
//        buttonTempconvert.setPreferredSize(buttonSize);
//        buttonTempconvert.setMaximumSize(buttonSize);
//        //event listener equivalent JS for assigning specific functionalities of a button
//        //gumawa ka ng backend Interface class, tapos iinherit mo yung class nato sa JavaClass mo, wherein constuctor din dun para mainitialize yung new frame at panel
//        buttonWelcome.addActionListener(e -> incrementCounter());
//        buttonEscseq.addActionListener(e -> resetCounter());
//        buttonTempconvert.addActionListener(e -> incrementCounter());
//        //frame set
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 500);
//        frame.setTitle("EXERCISE : 01 Soriano, Jr Albert O.");
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        //oh temo nakaksura na puro comments no? HAHAHAHAHAH
//        //pagtyagaan natin
//        //panel(parang pag aadd ng elements sa main window sa tkinter)
//
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
//        panel.setLayout(new GridLayout(0, 1));
//        panel.add(buttonWelcome);
//        panel.add(buttonEscseq);
//        panel.add(buttonTempconvert);
//        frame.pack();
//
//    }
//    private void BackInterface()
//    {
//        label = new JLabel();
//        panel.add(label);
//    }
//
//    private void RunWelcome()
//    {
//        label.setText("New Title or Text");
//        //tapos add form button, mag Jform kana one liner mo
//        //gets?
//        //alamin mo din kung paano mag delete/destroy yung unang panel,
//        //pwedeng new frame approach, or back?
//        //geh new frame nalang muna, yung labe will not be reused, and backinterface will not be needed
//        //the code architecture will be solved, but will make it have more contents
//        //anoterh work arround is to create a backInterface class, which is my go to approach
//        //then extend mo to sa class na to
//        //3 class, backinterface, front interface at  tryGUI constructor
//        //gets? oop na tayo hindi na procedural kaya wag kang tamad
//        //create new objects, then set values to them
//        //simulan monang baguhin utak mo!
//    }
//    private void RunEscseq()
//    {
//
//    }
//    private void RunTempconvert()
//    {
//
//    }
//    //button methods
//    private void incrementCounter() {
//
//}
//
//    private void resetCounter() {
//
//}
//}
//
///*
//
//public BackInterface
//{
//
//
//
//
//}*/
