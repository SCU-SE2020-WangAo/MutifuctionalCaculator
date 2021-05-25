package GUI;

import java.awt.*;
import javax.swing.*;
import CommandPattern.*;
import Tool.*;

public class FeatureButtonPanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel label_1=new JLabel("分解质因数");
	private JLabel label_2=new JLabel("最简二次根式");
	private JLabel label_3=new JLabel("解整系数一元二次方程   a*x^2+b*x+c=0");
	private JLabel label_4=new JLabel("求最大公约数和最小公倍数");
	private JLabel label_5=new JLabel("小数化分数,#表示循环节开始,0.0#3=0.0333...");
	
	private JLabel label_3_a=new JLabel("a=");
	private JLabel label_3_b=new JLabel("b=");
	private JLabel label_3_c=new JLabel("c=");
	private JLabel label_4_m=new JLabel("m=");
	private JLabel label_4_n=new JLabel("n=");
	private JLabel label_5_input=new JLabel("小数=");
	
	private JTextField text_1=new JTextField();
	private JTextField text_2=new JTextField();
	private JTextField text_3_a=new JTextField();
	private JTextField text_3_b=new JTextField();
	private JTextField text_3_c=new JTextField();
	private JTextField text_4_m=new JTextField();
	private JTextField text_4_n=new JTextField();
	private JTextField text_5=new JTextField();
	
	private MyButton button_1=new MyButton("Solve1");
	private MyButton button_2=new MyButton("Solve2");
	private MyButton button_3=new MyButton("Solve3");
	private MyButton button_4=new MyButton("Solve4");
	private MyButton button_5=new MyButton("Solve5");
	
	private int span=15;
	private int height=32;
	private int especial_span=0;
	
	
	private Font font=new Font("Dilag",1,15);
	
	
	private Activation[] activations=new Activation[5];
	
	public FeatureButtonPanel()
	{
	
		text_1.setDocument(new NumberDocument(10));
		text_2.setDocument(new NumberDocument(10));
		text_3_a.setDocument(new NumberDocument(8));
		text_3_b.setDocument(new NumberDocument(8));
		text_3_c.setDocument(new NumberDocument(8));
		text_4_m.setDocument(new NumberDocument(13));
		text_4_n.setDocument(new NumberDocument(13));
		text_5.setDocument(new NumberDocument(25));
		
		
		label_1.setFont(font);
		text_1.setFont(font);
		button_1.setFont(font);		
		label_2.setFont(font);
		text_2.setFont(font);
		button_2.setFont(font);		
		label_3.setFont(font);
		label_3_a.setFont(font);
		text_3_a.setFont(font);
		label_3_b.setFont(font);
		text_3_b.setFont(font);
		label_3_c.setFont(font);
		text_3_c.setFont(font);
		button_3.setFont(font);		
		label_4.setFont(font);
		label_4_m.setFont(font);
		text_4_m.setFont(font);
		label_4_n.setFont(font);
		text_4_n.setFont(font);
		button_4.setFont(font);
		label_5.setFont(font);
		label_5_input.setFont(font);
		text_5.setFont(font);
		button_5.setFont(font);
		
		
		setLayout(null);	
		label_1.setBounds(20, span, 200, height);
		text_1.setBounds(220, span, 100, height);		
		button_1.setBounds(330,span, 60,height);
		label_2.setBounds(20, 2*span+height, 200, height);
		text_2.setBounds(220, 2*span+height, 100, height);		
		button_2.setBounds(330,2*span+height, 60,height);
		label_3.setBounds(20,3*span+2*height,400, height);
		label_3_a.setBounds(20, 3*span+3*height+especial_span,20, height);
		text_3_a.setBounds(40,3*span+3*height+especial_span,80,height);
		label_3_b.setBounds(120, 3*span+3*height+especial_span,20, height);
		text_3_b.setBounds(140,3*span+3*height+especial_span,80, height);
		label_3_c.setBounds(220, 3*span+3*height+especial_span,20, height);
		text_3_c.setBounds(240,3*span+3*height+especial_span,80,height);
		button_3.setBounds(330,3*span+3*height+especial_span,60,height);
		label_4.setBounds(20, 4*span+4*height+especial_span, 450, height);
		label_4_m.setBounds(20, 4*span+5*height+2*especial_span, 30, height);
		text_4_m.setBounds(50, 4*span+5*height+2*especial_span, 120, height);
		label_4_n.setBounds(170, 4*span+5*height+2*especial_span, 30, height);
		text_4_n.setBounds(200,4*span+5*height+2*especial_span, 120, height);
		button_4.setBounds(330, 4*span+5*height+2*especial_span, 60, height);
		label_5.setBounds(20, 5*span+6*height+2*especial_span, 450, height);
		label_5_input.setBounds(20, 5*span+7*height+3*especial_span, 50, height);
		text_5.setBounds(80, 5*span+7*height+3*especial_span, 240, height);
		button_5.setBounds(330, 5*span+7*height+3*especial_span, 60, height);
		add(label_1);
		add(text_1);
		add(button_1);
		add(label_2);
		add(text_2);
		add(button_2);
		add(label_3);
		add(label_3_a);
		add(text_3_a);
		add(label_3_b);
		add(text_3_b);
		add(label_3_c);
		add(text_3_c);
		add(button_3);
		add(label_4);
		add(label_4_m);
		add(text_4_m);
		add(label_4_n);
		add(text_4_n);
		add(button_4);
		add(label_5);
		add(label_5_input);
		add(text_5);
		add(button_5);
	}
	
	public void setActivation(Activation[] activations)
	{
		
		this.activations=activations;
	}

	public void addActionLinsener()
	{
		
		button_1.addActionListener(activations[0]);
		button_2.addActionListener(activations[1]);
		button_3.addActionListener(activations[2]);
		button_4.addActionListener(activations[3]);
		button_5.addActionListener(activations[4]);	
	
	}
	
	
	public JTextField getText_1() 
	{
		return text_1;
	}

	public void setText_1(JTextField text_1) {
		this.text_1 = text_1;
	}

	public JTextField getText_2() {
		return text_2;
	}

	public void setText_2(JTextField text_2) {
		this.text_2 = text_2;
	}

	public JTextField getText_3_a() {
		return text_3_a;
	}

	public void setText_3_a(JTextField text_3_a) {
		this.text_3_a = text_3_a;
	}

	public JTextField getText_3_b() {
		return text_3_b;
	}

	public void setText_3_b(JTextField text_3_b) {
		this.text_3_b = text_3_b;
	}

	public JTextField getText_3_c() {
		return text_3_c;
	}

	public void setText_3_c(JTextField text_3_c) {
		this.text_3_c = text_3_c;
	}

	public JTextField getText_4_m() {
		return text_4_m;
	}

	public void setText_4_m(JTextField text_4_m) 
	{
		this.text_4_m = text_4_m;
	}

	public JTextField getText_4_n() 
	{
		return text_4_n;
	}

	public void setText_4_x2(JTextField text_4_n) 
	{
		this.text_4_n = text_4_n;
	}

	public JTextField getText_5() 
	{
		return text_5;
	}

	public void setText_5(JTextField text_5) {
		this.text_5 = text_5;
	}
	
}
