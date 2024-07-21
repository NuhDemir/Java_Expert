package ch007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame implements ActionListener {
 JLabel resultsLabel;

  public MenuDemo(){
      super("JMenu");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      setSize(400,600);


      resultsLabel = new JLabel("Click a menu item!" );
      add(resultsLabel);

      JMenu fileMenu = new JMenu("File");
      JMenuItem saveItem = new JMenuItem("Save");
      saveItem.addActionListener(this);
      fileMenu.add(saveItem);
      JMenuItem quitItem = new JMenuItem("Quit");
      quitItem.addActionListener(this);
      fileMenu.add(quitItem);

      JMenu editMenu = new JMenu("Edit");
      JMenuItem cutItem = new JMenuItem("Cut");
      cutItem.addActionListener(this);
      editMenu.add(cutItem);
      JMenuItem copyItem = new JMenuItem("Copy");
      copyItem.addActionListener(this);
      editMenu.add(copyItem);
      JMenuItem pasteItem = new JMenuItem("Paste");
      pasteItem.addActionListener(this);
      editMenu.add(pasteItem);


      // And finally build a JMenuBar for the application
      JMenuBar mainBar = new JMenuBar();
      mainBar.add(fileMenu);
      mainBar.add(editMenu);
      setJMenuBar(mainBar);

  }

    @Override
    public void actionPerformed(ActionEvent event) {
        resultsLabel.setText("Menu selected: " + event.getActionCommand());

    }

    public static void main(String[] args) {
        MenuDemo demo = new MenuDemo();
        demo.setVisible(true);
    }
}
