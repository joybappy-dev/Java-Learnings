// showInputDialog
import javax.swing.JOptionPane;

class ShowInputDialog{
    public static void main(String [] args){
        // JOptionPane.showInputDialog(positon, label, title, icon);
        String name = (String) JOptionPane.showInputDialog(null, "Enter Your Name", "Input Name", JOptionPane.QUESTION_MESSAGE,null, null, "Joy Bappy");

        JOptionPane.showMessageDialog(null, "Hello "+name,"Display Hello", JOptionPane.PLAIN_MESSAGE);
    }
}