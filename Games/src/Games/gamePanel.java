package Games;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class gamePanel extends JPanel implements ActionListener{
	static final int SCREEN_WIDTH=600;
	static final int SCREEN_HEIGHT=600;
	static final int UNIT_SIZE=25;
	static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY=75;
	final int x[]=new int [GAME_UNITS];
	final int y[]=new int [GAME_UNITS];
	int bodyParts=6;
	int applesEaten;
	int appleX;
	int appleY;
	char direciton='R';
	boolean running=false;
	Timer timer;
	Random random;
	
	
	
	gamePanel(){
		random =new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
		
			
			
		}
	
		
		
	
	public void startGame() {
		newApple();
		running =true;
		timer =new Timer(DELAY,this);
	     timer.start();
	     
		
		
		
		}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		
		
		
	}
	public void draw(Graphics g) {
		
		
	}
	public void newApple() {
		
	}
	public void move() {
		
	}
	public void checkApple() {
		
	}
	public void checkCollisions() {
		
	}
	public void gameOver() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
		}
		
	}

}
