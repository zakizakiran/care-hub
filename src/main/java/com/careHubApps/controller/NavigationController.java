package main.java.com.careHubApps.controller;

import javax.swing.JPanel;
import main.java.com.careHubApps.view.MainView;

public class NavigationController {
    
    public void goTo(MainView view ,JPanel panel){
       view.getContentPanel().removeAll();
       view.getContentPanel().add(panel);
       view.getContentPanel().repaint();
       view.getContentPanel().revalidate();
    }
    
}
