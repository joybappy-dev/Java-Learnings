import javax.swing.JOptionPane;

class ConfirmationDialog{
    public static void main(String[] args){
        int choice = JOptionPane.showConfirmDialog(null, "Sure want to quit?","Title", JOptionPane.YES_NO_OPTION);
        if(choice==1){
            System.out.println("Your clicked NO");
        }
        
        if(choice==0){
            System.out.println("Your clicked YES");
        }
    }
}