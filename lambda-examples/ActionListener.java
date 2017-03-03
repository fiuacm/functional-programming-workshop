import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JButton button = new JButton("Functional is great");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("(functional) -> \"great\"");
            }
        });

        //comment the previous to addActionListener and unncomment the one below to see that they both work
        //button.addActionListener(e -> System.out.println("Who authorized you to click this button"));

        JFrame frame = new JFrame("Lamdas in GUI programming!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
