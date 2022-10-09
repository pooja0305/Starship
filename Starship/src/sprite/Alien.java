//defining behavior of an alien and how it'll be used
//and how it should be displayed on the screen
//
package sprite;
import javax.swing.ImageIcon;
public class Alien extends Sprite{
	private Bomb bomb;
	//constructor with parameters x,y 
	//for posiiton of an alien
	public Alien(int x,int y) {
		initAlien(x,y);// function inside the constructor,actually where the locations of alien will be defined	
	}
	private void initAlien(int x,int y) {
		//refers to the current parameter of the functions x,y
		this.x=x;
		this.y=y;
		bomb=new Bomb(x,y);
		var alienImg="src/images/alien.png";
		var img=new ImageIcon(alienImg);
		setImage(img.getImage());
	}
	//enabling the direction of aliens
	public void act(int direction) {
		this.x+=direction;//changing the x with incrementting with the direction
	}
	public Bomb getBomb() {
		return bomb;
	}
	public class Bomb extends Sprite{
		private boolean destroyed;
		//constructor 
		public Bomb(int x,int y) {
			initBomb(x,y);
		}
		private void initBomb(int x, int y) {
			setDestroyed(true);
			this.x=x;
			this.y=y;
			
			var bombImg="src/images/bomb.png";
			var img=new ImageIcon(bombImg);
			setImage(img.getImage());
		}
		public void setDestroyed(boolean destroyed) {
			this.destroyed=destroyed;
		}
		public boolean isDestroyed(){
			return destroyed;
		}
	}
}
