package sprite;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import cam.Params;
public class Player extends Sprite{
	private int width;
	public Player(){
		initPlayer();
	}
	private void initPlayer() {
		var playerImg="src/images/player.png";
		var img=new ImageIcon(playerImg);
		
		width=img.getImage().getWidth(null);
		setImage(img.getImage());
		
		int START_X=270;
		setX(START_X);
		
		int START_Y=280;
		setY(START_Y);
	}
	//ONLY MOVING IN X AXIS AND NOT Y 
	public void act() {
		x+=dx;//used to increemnt /decrement position
		if(x<=2) {
			x=2;//ensuring not moving away from wall
		}
		if(x>=Params.BOARD_WIDTH-2*width) {
			x=Params.BOARD_WIDTH-2*width;
		}
	}
	//when key presse dmovement shud occur
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_LEFT) {
			dx=-2;
		}
		if(key==KeyEvent.VK_RIGHT) {
			dx=2;
		}
	}
	//when key released stop moving
	public void KeyReleased(KeyEvent e) {
		int key =e.getKeyCode();
		if(key==KeyEvent.VK_LEFT||key==KeyEvent.VK_RIGHT) {
			dx=0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
