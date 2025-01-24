package drawPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel implements MouseMotionListener,MouseListener{
	
	//フィールド
	private Color drawColor = Color.GREEN;
	private int drawSize = 10;
	private BufferedImage canvas;
	private int width = 600;
	private int height = 400;
	
	//コンストラクタ
	public MyDrawPanel() {
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(this.width,this.height) );
		this.canvas = new BufferedImage(this.width,this.height,BufferedImage.TYPE_INT_RGB);
		
		this.initCanvas();
	}
	
	
	//メソッド
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(this.canvas,0,0,this);
	}//paintComponent-end
	
	
	public void initCanvas() {
		Graphics g = this.canvas.getGraphics();
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.width, this.height);
	}//initCanvas-end
	
	
	public void drawCanvas(Point p) {
		Graphics g = this.canvas.getGraphics();
		
		g.setColor(this.drawColor);
		
		g.fillOval(p.x-(this.drawSize/2), p.y-(this.drawSize/2), this.drawSize,this.drawSize);
	}//drawCanvas-end
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		Point p = e.getPoint();
		
		this.drawCanvas(p);
		this.repaint();
		
		System.out.println( "X=" + p.x + ",Y=" + p.y);
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		this.mouseDragged(e);
		
	}
	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}


	public Color getDrawColor() {
		return drawColor;
	}


	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}


	public int getDrawSize() {
		return drawSize;
	}


	public void setDrawSize(int drawSize) {
		this.drawSize = drawSize;
	}


	public BufferedImage getCanvas() {
		return canvas;
	}


	public void setCanvas(BufferedImage canvas) {
		this.canvas = canvas;
	}
	
	
	
	
	
	

}
