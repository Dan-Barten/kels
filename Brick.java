import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Brick {
	public static final int width = 35;
	public static final int height = 12;
	int x;
	int y;
	private Game game;
	
	public Brick(Game game, int myX, int myY) {
		this.game = game;
		x = myX;
		y = myY;
	}
	public void paint(Graphics2D g) {
		g.fillRect(x, y, width, height);
	}
	
	public boolean collision() {
		return game.ball.getBounds().intersects(getBounds());
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
}
