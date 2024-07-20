package ch005;

import ch001.App;

import javax.swing.*;

public class AppleToss extends JFrame {
Field field = new Field();
Physicist player1 = new Physicist();
    public AppleToss() {
//Create our frame
        super("Apple Toss Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);

        setUpFieldForOnePlayer();
    }

    private void setUpFieldForOnePlayer() {
        // Place our (new) physicist in the lower left corner and connect them to the field
        // Place our (new) physicist in the lower left corner and connect them to the field
        player1.setPosition(100,500);
        field.setPlayer(player1);
        player1.setField(field);
        field.setUpApples();
        field.setUpTree();
        add(field);

    }

    public static void main(String[] args) {
AppleToss game = new AppleToss();
game.setVisible(true);
    }
}
