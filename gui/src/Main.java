import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("What is your name");
       JOptionPane.showMessageDialog(null, "Hello "+ name);

       int age = Integer.parseInt( JOptionPane.showInputDialog("How old are you? "));
       //JOptionPane.showMessageDialog(null,"You are " +age+ " years old");

        double height = Double.parseDouble( JOptionPane.showInputDialog("Enter your Height "));
        //JOptionPane.showMessageDialog(null,"You are " +height+ " tall");

        JOptionPane.showMessageDialog(null,"You are " +age+ " years old and " +height+ "tall");
    }
}