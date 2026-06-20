// 5 parameter
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class DialogMessage3{
    public static void main(String[] args){
        ImageIcon messageIcon = new ImageIcon("spiderman.png");
        JOptionPane.showMessageDialog(null, "I am the message", "I title", JOptionPane.PLAIN_MESSAGE, messageIcon);
    }
}