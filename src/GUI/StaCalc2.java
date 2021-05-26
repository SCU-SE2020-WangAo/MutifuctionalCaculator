package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaCalc2 extends JFrame implements ActionListener {
    String[] KEYS = {"Clean", "/", "*", "Backspace", "7", "8", "9", "-", "4", "5", "6", "+",
            "1", "2", "3", "(", ")", "0", ".", "="};
    JButton keys[] = new JButton[KEYS.length];
    JTextField resultText = new JTextField(null, 20);
    JPanel jp520;
	public static void main(String[] args) {
		new StaCalc2();
}
    public StaCalc2() {
        init();
        this.setBackground(Color.LIGHT_GRAY);
        this.setTitle("标准计算器");
        this.setLocation(500, 300);
        this.setResizable(true);
        this.setVisible(true);
        this.pack();
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JMenu helpMenu = new JMenu("版权");
		JMenuItem about2 = new JMenuItem("版权声明");
		helpMenu.add(about2);
		bar.add(helpMenu);

		about2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
                new AboutInfo2();
			}
		});
    }

    private void init() {
        jp520 = new JPanel();
        JLabel jlb1;
        JComboBox jcb1;
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setEditable(false);
        resultText.setBackground(Color.WHITE);
        jlb1 = new JLabel("选择模式");
        String[] jg = {"标准计算器", "科学计算器", "矩阵计算器", "程序员计算器", "函数计算器"};
        jcb1 = new JComboBox(jg);
        JPanel toppanel = new JPanel();
        toppanel.add(resultText);
        jp520.add(jlb1);
        jp520.add(jcb1);
        jp520.add(toppanel);


        JPanel calckeysPanel = new JPanel();
        calckeysPanel.setLayout(new GridLayout(5, 4));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            calckeysPanel.add(keys[i]);
            if (i == 0) {
                keys[i].setForeground(Color.red);
            } else if (i == 3) {
                keys[i].setForeground(Color.black);
            } else
                keys[i].setForeground(Color.blue);
        }


        for (int i = 0; i < KEYS.length; i++) {
            keys[i].addActionListener(this);
        }

        this.setLayout(new BorderLayout());
        this.add(jp520, BorderLayout.NORTH);
        this.add(calckeysPanel, BorderLayout.CENTER);
    }


    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        if ("0123456789.()+-*/".indexOf(label) >= 0) {

            resultText.setText(resultText.getText() + label);
        } else if (label == "Clean") {
            resultText.setText("");
        } else if (label == "Backspace") {
            resultText.setText(resultText.getText().substring(0, resultText.getText().length() - 1));
        } else {

            try {
                resultText.setText(getResult(resultText.getText()));
            } catch (Exception f) {
                resultText.setText(f.getMessage());
            }
        }

    }


    public static double doubleCal(double a1, double a2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return a1 + a2;
            case '-':
                return a1 - a2;
            case '*':
                return a1 * a2;
            case '/':
                return a1 / a2;
            default:
                break;
        }
        throw new Exception("illegal operator!");
    }


    public static String getResult(String str) throws NumberFormatException, Exception {


        str = str.startsWith("--") ? str.substring(2) : str;
        str = str.replaceAll("--", "+");
        str = str.replaceAll("\\+-", "-");
        if (str.matches("-{0,1}[0-9]+([.][0-9]+){0,1}"))
            return str;


        String newExpr = null;

        if (str.contains("(")) {

            int lIndex = str.lastIndexOf("(");
            int rIndex = str.indexOf(")", lIndex);

            String subExpr = str.substring(lIndex + 1, rIndex);
            newExpr = str.substring(0, lIndex) + getResult(subExpr)
                    + str.substring(rIndex + 1);
            return getResult(newExpr);
        }


        if (str.contains("*") || str.contains("/")) {
            Pattern p = Pattern.compile("[0-9]+([.][0-9]+){0,1}[*/]-{0,1}[0-9]+([.][0-9]+){0,1}");
            Matcher m = p.matcher(str);
            if (m.find()) {

                String temp = m.group();
                String[] a = temp.split("[*/]");
                newExpr = str.substring(0, m.start())
                        + doubleCal(Double.valueOf(a[0]), Double.valueOf(a[1]), temp.charAt(a[0].length()))
                        + str.substring(m.end());
            }
            return getResult(newExpr);
        }

        if (str.contains("+") || str.contains("-")) {

            Pattern p = Pattern.compile("-{0,1}[0-9]+([.][0-9]+){0,1}[+-][0-9]+([.][0-9]+){0,1}");
            Matcher m = p.matcher(str);
            if (m.find()) {

                String temp = m.group();
                String[] a = temp.split("\\b[+-]", 2);
                newExpr = str.substring(0, m.start())
                        + doubleCal(Double.valueOf(a[0]), Double.valueOf(a[1]), temp.charAt(a[0].length()))
                        + str.substring(m.end());
            }
            return getResult(newExpr);
        }

        throw new Exception("Calculation error");
    }

}
