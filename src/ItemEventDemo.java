import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventDemo {
        public static void main(String[] args) {
                //The ItemStateChanged method interface name is ItemListener.
                Frame f = new Frame("Item Event Demo");
                Checkbox cb = new Checkbox("Checkbox");
                cb.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent e) {
                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                        System.out.println("Checkbox is selected");
                                } else {
                                        System.out.println("Checkbox is not selected");
                                }
                        }
                });
                f.add(cb);
                f.setBounds(100, 100, 300, 200);
                f.setVisible(true);
        }
}
