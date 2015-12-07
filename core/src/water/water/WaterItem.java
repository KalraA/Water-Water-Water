package water.water;

import com.badlogic.gdx.Gdx;

public class WaterItem extends Entity {

	public WaterItem() {
		animation = new Animation(Animation.waterItem);
	}
	
	public WaterItem init(float x, float y) {
		final float size = 0.4f * Gdx.graphics.getHeight();
		init(x, y, size, size, animation);
		
		collideWidth *= 0.15f;
		collideHeight *= 0.15f;
		collideY += collideHeight * 0.9f;
		
		return this;
	}
	
	public void draw(float dt) {
		super.draw(dt);
		offscreenRemove();
	}
	
	public boolean playerHit() {
		super.playerHit();
		removed = true;
		
		game.water = game.maxWater;
		
		return true;
	}
}
