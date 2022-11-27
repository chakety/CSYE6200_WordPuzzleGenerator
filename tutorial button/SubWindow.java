package application;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubWindow extends JFrame{
	public SubWindow(){

		this.setResizable ( false );

		this.setTitle("Game Tutorial");

		this.setVisible(true);//从获取屏幕大小

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width ;

		int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;

		int winWidth=400;

		int winHeight=300;

		int winx =( screenWidth - winWidth )/2; 

		int winY =( screenHeight- winHeight )/2;

		this.setBounds( 50 , 50 , screenWidth-100 , screenHeight-100 );

		getContentPane (). setLayout (null);

		JLabel label= new JLabel ("Game Toturial");
		label.setFont ( new Font("微软雅黑", Font.BOLD ,16));
		label.setSize (300,30);
		getContentPane ().add (label);
		int midX=winWidth /2-label.getWidth ()/2;
		int midY= winHeight /2- label.getHeight()/2-30;
		label.setBounds(0 , 0 , label.getWidth (), label.getHeight());//设置子窗口中的标签框位置
		
		JLabel label2= new JLabel ("Please follow the tutorial to play this game: ");
		label2.setFont ( new Font("微软雅黑", Font.BOLD ,16));
		label2.setSize (600,30);
		getContentPane ().add (label2);
		int midX2=winWidth /2-label2.getWidth ()/2;
		int midY2= winHeight /2- label2.getHeight()/2-30;
		label2.setBounds(0 , label.getHeight() , label2.getWidth (), label2.getHeight());//设置子窗口中的标签框位置


		}
}
