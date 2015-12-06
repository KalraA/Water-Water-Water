package water.water;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Platform extends Entity {
	
	public boolean dieOnHit;
	
	public Platform init(float x, float y, float width, float height, boolean dieOnHit, TextureRegion texture, float collideYC, float collideHeightC, float collideWidthC) {
		init(x + width * 0.5f, y + height * 0.5f, width, height, texture);
		this.dieOnHit = dieOnHit;
		seamlessTexture = !dieOnHit;
		
		collideY = collideHeight * collideYC;
		collideHeight *= collideHeightC;
		collideWidth *= collideWidthC;
		
		if(dieOnHit) {
			this.y -= collideY;
		}
		
		return this;
	}
	
	public void draw(float dt) {
		super.draw(dt);
		offscreenRemove();
	}

}
