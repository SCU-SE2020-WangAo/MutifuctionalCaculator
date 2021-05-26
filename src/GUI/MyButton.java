package GUI;

import java.awt.*;
import javax.swing.*;

public class MyButton extends JButton
{
	
	private static final long serialVersionUID = 1L;
	
	
	protected Color color1 = new Color(0x8797aa);
	protected Color color2 = new Color(0xffdb00);
	protected Color color3 = new Color(0xc29b29);
	
	
	protected Color textColor1 = new Color(0x62398f);
	protected Color textColor2 = new Color(0x693962);
	protected Color textColor3 = new Color(0x65395b);
	
	
	protected static float[] points = new float[]{0, .49f, .51f, 1};
	

	protected Color[] colors1 = new Color[]{new Color(0xf7fbff), 
			new Color(0xedf3f8), new Color(0xe7edf5), new Color(0xf3fbff)};
	protected Color[] colors2 = new Color[]{new Color(0xfffbf6), 
			new Color(0xfee2c2), new Color(0xffcf6a), new Color(0xfffff0)};
	protected Color[] colors3 = new Color[]{new Color(0xe3c185), 
			new Color(0xf5c779), new Color(0xf5bb57), new Color(0xf2f2bb)};
	protected Color[] colors4 = new Color[]{new Color(0xf6fafe), 
			new Color(0xe2eaf3), new Color(0xd5e0ed), new Color(0xd7e2ef)};
	protected Color[] colors5 = new Color[]{new Color(0xd9e4f1), 
			new Color(0xd9e4f1), new Color(0xd9e4f1), new Color(0xd9e4f1)};
	
	
	protected int type = 0;
	
	
	protected int radius = 5;

	
	MyButton(String text)
	{
		super(text);
	
		setContentAreaFilled(false);
	}
	
	MyButton(String text, int type)
	{
		super(text);
		this.type = type;
		
		setContentAreaFilled(false);
	}
	
	
	@Override
	protected void paintComponent(Graphics gr) {
		Graphics2D g = (Graphics2D)gr;
		
		
		LinearGradientPaint paint;
		
		paint = new LinearGradientPaint(0, 0, 0, getHeight(), points, this.isEnabled()?(
				this.getModel().isArmed()?colors3:this.getModel().isRollover()?colors2:type==1?colors4:colors1):colors5);
		
		g.setPaint(paint);
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
		
		g.setFont(new Font("Arial", Font.PLAIN, 15));
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(this.getModel().isArmed()?textColor3:this.getModel().isRollover()?textColor2:textColor1);
		FontMetrics fm = g.getFontMetrics();
		g.drawString(getText(), getWidth()/2-fm.stringWidth(getText())/2, getHeight()/2+fm.getAscent()/2);
	}
	
	@Override
	protected void paintBorder(Graphics gr) 
	{
		
		Graphics2D g = (Graphics2D)gr;
		g.setColor(this.getModel().isArmed()?color3:this.getModel().isRollover()?color2:color1);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
	}
	
	
}

