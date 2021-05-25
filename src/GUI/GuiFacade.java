package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import StatePattern.*;
import BuilderPattern.*;

public class GuiFacade extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	
	private static GuiFacade instance;
	private MainWindow mainWindow;
	
	
	private JMenuBar bar;
	private JMenu chose;
	private JMenu help;
	private JMenu copyright;
	private JMenuItem chose_typical;
	private JMenuItem chose_science;
	private JMenuItem chose_programmer;
	private JMenuItem chose_feature;
	private JMenuItem chose_Matrix;
	private JMenuItem help_look;
	private JMenuItem help_about;
	private JMenuItem copyright_description;
	
	
	private JPanel main_panel=new JPanel(new BorderLayout());
	
	
	private BasePanel typical_panel;
	private BasePanel science_panel;
	private BasePanel programmer_panel;
	private BasePanel feature_panel;
	
	
	private String current_state="Typical";
	
	private ManageState manage_state=new ManageState();
	
	private Image my_image;
	
	private GuiFacade()
	{
		
		my_image=Toolkit.getDefaultToolkit().getImage("src/image/myIcon.png");
		this.setIconImage(my_image);
		
		this.add(main_panel);
		this.setTitle("我的计算器");     
		this.setResizable(false);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		
		this.initBar();
		this.build();
		this.setActionListener();
		this.setVisible(true);	  
	}
	
	public void initBar()
	{
		
		bar=new JMenuBar();
		chose=new JMenu("选择");
		help=new JMenu("帮助");
		copyright=new JMenu("版权");
		chose_typical=new JMenuItem("标准型");
		chose_science=new JMenuItem("科学型");
		chose_programmer=new JMenuItem("程序员");
		chose_feature=new JMenuItem("特色型");
		chose_Matrix=new JMenuItem("矩阵计算");
		help_look=new JMenuItem("查看");
	    help_about=new JMenuItem("关于");
	    copyright_description=new JMenuItem("版权声明");
	
	    chose.add(chose_typical);
		chose.add(chose_science);
		chose.add(chose_programmer);
		chose.add(chose_feature);
		chose.add(chose_Matrix);
		help.add(help_look);
		help.add(help_about);
		copyright.add(copyright_description);
	    
		bar.add(chose);
		bar.add(help);
		bar.add(copyright);
		
		this.setJMenuBar(bar);	
		
	}
	
	public void build()
	{
		
		Director director=new Director();
	
		
		Builder b1=new BuildTypical();
		Builder b2=new BuildScience();
		Builder b3=new BuildProgrammer();
		Builder b4=new BuildFeature();
		
		
		director.Construct(b1);
		typical_panel=b1.getPanle();	
		director.Construct(b2);
		science_panel=b2.getPanle();	
		director.Construct(b3);
		programmer_panel=b3.getPanle();	
		director.Construct(b4);
		feature_panel=b4.getPanle();

		
		
		main_panel.add(science_panel);
		main_panel.add(feature_panel);
		main_panel.add(programmer_panel);
		main_panel.add(typical_panel);

		
		typical_panel.setVisible(true);
		science_panel.setVisible(false);
		programmer_panel.setVisible(false);
		feature_panel.setVisible(false);
	}
	
	public void setActionListener()
	{
			chose_typical.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					current_state = "Typical";

					typical_panel.setVisible(true);
					science_panel.setVisible(false);
					programmer_panel.setVisible(false);
					feature_panel.setVisible(false);

				}
			});

			chose_science.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					current_state = "Science";

					typical_panel.setVisible(false);
					science_panel.setVisible(true);
					programmer_panel.setVisible(false);
					feature_panel.setVisible(false);
				}
			});

			chose_programmer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					current_state = "Programmer";

					typical_panel.setVisible(false);
					science_panel.setVisible(false);
					programmer_panel.setVisible(true);
					feature_panel.setVisible(false);
				}
			});

			chose_feature.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					current_state = "Feature";

					typical_panel.setVisible(false);
					science_panel.setVisible(false);
					programmer_panel.setVisible(false);
					feature_panel.setVisible(true);
				}
			});

			chose_Matrix.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					instance.setVisible(false);
					MainWindow mainWindow = new MainWindow();
				}
			});

			help_look.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, manage_state.Change(current_state), "帮助", 1);

				}
			});

			help_about.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					JOptionPane.showMessageDialog(null, "自己摸索吧", "帮助", 1);
				}
			});

			copyright_description.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new copyrights2();
				}
			});
		}

	public static GuiFacade getInstance()
	{
		if(instance==null)
			instance=new GuiFacade();
		return instance;
	}
	
}
