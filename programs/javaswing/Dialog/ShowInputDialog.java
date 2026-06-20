// showInputDialog
import javax.swing.JOptionPane;

class ShowInputDialog{
    public static void main(String [] args){
        // JOptionPane.showInputDialog(positon, label, title, icon);
        String name = (String) JOptionPane.showInputDialog(null, "Enter Your Name", "Name Input", JOptionPane.QUESTION_MESSAGE,null, null, "Jon Doe");

        System.out.println("Hello "+ name);
        
    }
}