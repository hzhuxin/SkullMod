package skullMod.lvlEdit.gui.leftPane;

import javax.swing.*;
import java.awt.*;

public class SelectorPanel extends JPanel {
    public SelectorPanel(){
        this.setLayout(new BorderLayout());

        CenterSelectorPanel centerPanel = new CenterSelectorPanel();

        this.add(new TopSelectorPanel(centerPanel), BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }
}