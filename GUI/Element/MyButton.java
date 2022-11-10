package GUI.Element;

import GUI.MainScreen;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton() {
        initGUI();
    }

    public MyButton(Icon icon) {
        super(icon);
        initGUI();
    }

    public MyButton(String text) {
        super(text);
        initGUI();
    }

    public MyButton(Action a) {
        super(a);
        initGUI();
    }

    public MyButton(String text, Icon icon) {
        super(text, icon);
        initGUI();
    }

    private void initGUI(){
        this.setFocusable(false);
        this.setPreferredSize(new Dimension(100,25));
        this.setForeground(MainScreen.BACKGROUND.brighter());
        this.setBackground(MainScreen.BTN_BACKGROUND2.darker());
    }
}
