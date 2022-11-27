package application;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Mainwindow extends JFrame{
	
	public Mainwindow() {
		this.setVisible(true);
		this.setTitle("desktop");
		int ScreenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int ScreenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int winWidth = 800;
		int winHeight = 600;
		int winX =( ScreenWidth - winWidth )/2; 
		int winY =( ScreenHeight- winHeight )/2;
		this.setBounds(winX,winY,winWidth,winHeight);
		getContentPane().setLayout(null);
		JButton  tutorial = new JButton("tutorial");
		tutorial.setBounds(0, 0, 120, 30);
		getContentPane().add(tutorial);
		tutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new SubWindow();
			}
			});
	}
	}
	

