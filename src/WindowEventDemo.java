import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventDemo {
        public static void main(String[] args) {
                Frame f = new Frame("Window Event Demo");
                f.addWindowListener(new WindowAdapter() {
                        public void windowActivated(WindowEvent e) {
                                System.out.println("Window activated");
                                System.out.println("Window: " + e.getWindow());
                                System.out.println("Type: " + e.getID());
//                                System.out.println("Time: " + e.getWhen());
                        }
                });
                f.setBounds(100, 100, 300, 200);
                f.setVisible(true);
        }
}
