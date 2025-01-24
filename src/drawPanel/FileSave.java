package drawPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FileSave implements ActionListener{
	
	//フィールド
	private MyDrawPanel drawPanel;
	private String fileName;
	
	
	//コンストラクタ
	public FileSave(MyDrawPanel drawPanel, String fileName) {
		this.drawPanel = drawPanel;
		this.fileName = fileName;
	}
	
	public FileSave(MyDrawPanel drawPanel) {
		this(drawPanel,"MyDraw.png");
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		//try {
		//	String extension = fileName.substring(fileName.indexOf(".")+1); //拡張子を取得
		
		//	BufferedImage image = this.drawPanel.getCanvas();
			//ImageIO.write(image, extension, new File(fileName));
		//}
		//catch(IOException ex) {
		//	ex.printStackTrace();
		//}
		
		System.out.println("ファイル書き込み完了");
	}
	
	
	
	

}
