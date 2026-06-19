import javax.swing.*;

class FirstApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First App");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Hello Java Swing");

        JButton button = new JButton("I am a Button");
        button.setBounds(10, 10, 1000, 500);

        frame.add(button);
        frame.setVisible(true);
    }
}