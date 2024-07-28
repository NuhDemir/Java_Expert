package calculator.main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.function.Consumer;

public class Calculator {
    //Tanımlama:
//region
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BUTTON_HEIGHT = 75;
    private static final int BUTTON_WIDTH = 50;
    private static final int MARGIN_X_POSITION = 20;
    private static final int MARGIN_Y_POSITION = 60;


    private JFrame window;//Main window
    private JComboBox<String> comboCalcType, comboTheme;
    private JTextField inText;//input
    private JButton btnC, btnBack, btnMod, btnDiv, btnMul, btnSub, btnAdd,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPoint,
            btnEqual, btnRoot, btnPower, btnLog;

    private char operator = ' ';//Save the operator
    private boolean go = true;//For calculate with operator !=(=)
    private boolean addWrite = true;//Connect numbers in display
    private double val = 0;//Save the value typed for calculation
//endregion

    public Calculator() {
        window = new JFrame("Calculator");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null); //Move window to center
        comboTheme = initCombo(new String[]{"Simple", "Colored", "DarkTheme"}, 230, 30, "Theme", themeSwitchEventConsumer);
        comboCalcType = initCombo(new String[]{"Standart", "Scientific"}, 20, 30, "Calculator type", calcTypeSwitchEventConsumer);

        int[] x = {MARGIN_X_POSITION, MARGIN_X_POSITION + 90, 200, 290, 380};
        int[] y = {MARGIN_Y_POSITION, MARGIN_Y_POSITION + 100, MARGIN_Y_POSITION + 180, MARGIN_Y_POSITION + 260, MARGIN_Y_POSITION + 340, MARGIN_Y_POSITION + 420};

        inText = new JTextField("0");

        window.setVisible(true);
    }

    public JComboBox<String> initCombo(String[] items, int x, int y, String toolTip, Consumer consumerEvent) {
    }

    private JButton initButton(String label, int x, int y, ActionListener event) {

    }

    public double calc(double x, String input, char operator) {
    }

    private void repaintFont() {
    }

    private Consumer<ItemEvent> calcTypeSwitchEventConsumer = event -> {
    }
    private Consumer<ItemEvent> themeSwitchEventConsumer = event -> {
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
