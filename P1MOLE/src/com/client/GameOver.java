package com.client;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class GameOver extends JDialog{
	JButton btn;
	Image hammerImg;
	ImageIcon gameOverImg;
	int hammerX, hammerY;
	Cursor cursor;
	
	public GameOver(){
		hammerImg=Toolkit.getDefaultToolkit().getImage("image/01.png");
		cursor=Toolkit.getDefaultToolkit().createCustomCursor(hammerImg, new Point(0,0), "null");
		this.setCursor(cursor);
		gameOverImg=new ImageIcon("image/GameOver.png");
		
		JPanel jPanel=new JPanel(){

			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(gameOverImg.getImage(), 0, 0, getWidth(), getHeight(), null);
			}
			
		};
		this.add(jPanel);
		jPanel.setLayout(null);

		btn=new JButton("확인");
		btn.setBounds(100,100,150,60);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
		jPanel.add(btn);
		
		this.setUndecorated(true);		//타이틀바 없애기
		this.setModal(true);
		this.setSize(350,350);
		this.setLocation(60,140);
		this.setResizable(false);
	}
}























