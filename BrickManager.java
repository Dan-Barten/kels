import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class BrickManager {
	public ArrayList<Brick> bricks = new ArrayList<>();
	private Game game;
	int xPos = 0;
	int yPos = Brick.width;
	int spacing = 2;
	public BrickManager(Game game) {
		this.game = game;
		for (int row = 0; row < 12; row++ ) {
			int y = yPos + (row * (Brick.height + spacing));
			for (int col = 0; col < 8; col++) {
				int x = xPos + (col * (Brick.width + spacing));
			bricks.add(new Brick(game, x, y));
			
				
			}
			
		}
				
			}
		public void update() {
			if (bricks.isEmpty()) {
				game.gameWon();
			}
			try {
			for (Brick b : bricks) {
				if(b.collision() == true) {
				bricks.remove(b);
				game.ball.ya = 1;
				}				}}
			 catch (Exception e) {
			}
			
		
			}
	
	
	
	public void paint(Graphics2D g2d) {
		g2d.setColor(new Color (66,134,244));
		for (Brick b : bricks) {
			b.paint(g2d);
			
		}
	
		
			
		}
	}

