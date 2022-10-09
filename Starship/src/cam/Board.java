package cam;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;
import javax.swing.JPanel;
import sprite.Alien;
import sprite.Player;
import sprite.Shot;

public class Board extends JPanel{
	private Dimension d;
	private List<Alien>aliens;
	private Player player;
	private Shot shot;
	
	private int direction=-1;
	private int death=0;
	
	private boolean inGame=true;
	private String explImg="src/images/explosion.png";
	private String message="Game Over!!";
	
	private Timer timer;
	//constructors
	public Board() {
		initBoard();
		gameInit();
	}
	private void initBoard() {
		setFocusable(true);
		d=new Dimension(Params.BOARD_WIDTH, Params.BOARD_HEIGHT);
		setBackground(Color.blue);
		
		gameInit();
	}
	private void gameInit() {
		aliens = new ArrayList<>();
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++){
				var alien=new Alien(Params.ALIEN_INIT_X+18*j,
						Params.ALIEN_INIT_Y+18*i);
				aliens.add(alien);
			}
		}
		player=new Player();
		shot=new Shot();
	}
	private void drawAliens(Graphics g) {
		for(Alien alien:aliens) {
			if(alien.isVisible()) {
				g.drawImage(alien.getImage(),alien.getX(),alien.getY(),this);
			}
			if(alien.isDying()) {
				alien.die();
			}
		}
	}
	private void drawPlayer(Graphics g) {
		if(player.isVisible()) {
			g.drawImage(player.getImage(),player.getX(),player.getY(),this);
		}
		if(player.isDying()) {
			player.die();
			inGame=false;
		}
	}
	private void drawShot(Graphics g) {
		if(shot.isVisible()) {
			g.drawImage(shot.getImage(),shot.getX(),shot.getY(),this);
		}
	}
	private void drawBombing(Graphics g) {
		for(Alien a:aliens) {
			Alien.Bomb b= a.getBomb();
			if(!b.isDestroyed()) {
				g.drawImage(b.getImage(),b.getX(),b.getY(),this);
			}
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
	private void doDrawing(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0,0,d.width,d.height);
		g.setColor(Color.green);
		
		if(inGame) {
			g.drawLine(0,Params.GROUND,Params.BOARD_WIDTH,Params.GROUND);
			
			drawAliens(g);
			drawPlayer(g);
			drawShot(g);
			drawBombing(g);
		}
		else {
			if(timer.isRunning()) {
				timer.stop();	
			}
		}
		Toolkit.getDefaultToolkit().sync();
		
	}

}
