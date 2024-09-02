import javax.swing.*;

public class GUIpractice {
    private JFrame frame;
    public GUIpractice() {
        frame = new JFrame();
    }
    public void RunGUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("EXERCISE : 01 Soriano, Jr Albert O.");
    }
}
