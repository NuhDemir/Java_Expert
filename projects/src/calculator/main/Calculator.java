package calculator.main;

import javax.swing.*;

public class Calculator {

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

    private char operator=' ';//Save the operator
    private boolean go=true;//For calculate with operator !=(=)
    private boolean addWrite = true;//Connect numbers in display
    private double val=0;//Save the value typed for calculation


    public Calculator(){
        window= new JFrame("Calculator");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setLocationRelativeTo(null); //Move window to center
    }

}
