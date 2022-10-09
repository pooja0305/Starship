//contains main logic of aliens and how alien works
//logic on the display,positioning etc
//
package sprite;
import java.awt.Image;
public class Sprite {
	private boolean visible;
	private Image image;
	private boolean dying;
	int x;
	int y;
	int dx;//displacement on x coordinate
	//object is alive so visible set to true
	public Sprite() {
		visible=true;
	}
	//once object is dead the visible is set to false
	public void die() {
		visible=false;
	}
	public boolean isVisible() {
		return visible;//same as visible=true
	}
	protected void setVisible(boolean visible) {
		this.visible=visible;
	}
	public void setImage(Image image) {
		this.image=image;
	}
	public Image getImage() {
		return image;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setDying(boolean dying) {
		this.dying=dying;
	}
	public boolean isDying() {
		return this.dying;
	}
	
}
