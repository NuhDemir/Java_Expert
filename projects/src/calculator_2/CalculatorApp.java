package calculator_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {

    private JFrame frame;
    private JTextField textField;
    private Calculator calculator;
    private double currentNumber;
    private boolean isNewInput = true;
    private Calculator.BiOperatorModes currentMode;

    public CalculatorApp() {
        calculator = new Calculator();
        currentNumber = 0.0;
        currentMode = Calculator.BiOperatorModes.normal;

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false); // Çerçeve boyutunun değiştirilememesi
        frame.setBackground(Color.WHITE); // Arka plan rengi beyaz
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 4, 5, 5)); // 7 satır, 4 sütun
        panel.setBackground(Color.WHITE);

        // Temel işlemler butonları
        String[] basicOps = { "C", "sqrt", "x^y", "1/x" };
        for (String text : basicOps) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 16));
            button.setBackground(Color.LIGHT_GRAY);
            button.setForeground(Color.BLACK);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Kenarlık rengi
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        // Sayı ve işlem butonları (ters sıralama)
        String[] buttons = {
                "9", "8", "7", "/",
                "6", "5", "4", "*",
                "3", "2", "1", "-",
                ".", "0", "=", "+",
                "", "", "", "" // Boş hücreler
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.setBackground(Color.GRAY);
            button.setForeground(Color.WHITE);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Kenarlık rengi
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            try {
                switch (command) {
                    case "=":
                        if (currentMode != Calculator.BiOperatorModes.normal) {
                            currentNumber = calculator.calculateBi(currentMode, Double.parseDouble(textField.getText()));
                            textField.setText(String.valueOf(currentNumber));
                            currentMode = Calculator.BiOperatorModes.normal;
                        } else {
                            currentNumber = calculator.calculateEqual(Double.parseDouble(textField.getText()));
                            textField.setText(String.valueOf(currentNumber));
                        }
                        isNewInput = true;
                        break;
                    case "+":
                        processBiOperator(Calculator.BiOperatorModes.add);
                        break;
                    case "-":
                        processBiOperator(Calculator.BiOperatorModes.minus);
                        break;
                    case "*":
                        processBiOperator(Calculator.BiOperatorModes.multiply);
                        break;
                    case "/":
                        processBiOperator(Calculator.BiOperatorModes.divide);
                        break;
                    case "x^y":
                        processBiOperator(Calculator.BiOperatorModes.xpowerofy);
                        break;
                    case "sqrt":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "sin":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.sin, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "cos":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.cos, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "tan":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.tan, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "log":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.log, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "1/x":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "%":
                        currentNumber = calculator.calculateMono(Calculator.MonoOperatorModes.rate, Double.parseDouble(textField.getText()));
                        textField.setText(String.valueOf(currentNumber));
                        isNewInput = true;
                        break;
                    case "C":
                        textField.setText("");
                        currentNumber = 0.0;
                        currentMode = Calculator.BiOperatorModes.normal;
                        isNewInput = true;
                        break;
                    default:
                        if (isNewInput) {
                            textField.setText(command);
                            isNewInput = false;
                        } else {
                            textField.setText(textField.getText() + command);
                        }
                }
            } catch (Exception ex) {
                textField.setText("Error");
                currentNumber = 0.0;
            }
        }

        private void processBiOperator(Calculator.BiOperatorModes mode) {
            currentMode = mode;
            currentNumber = Double.parseDouble(textField.getText());
            isNewInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorApp::new);
    }
}
