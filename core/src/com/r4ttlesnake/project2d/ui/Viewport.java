package com.r4ttlesnake.project2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.r4ttlesnake.project2d.entities.Entity;

public class Viewport {
	
	public OrthographicCamera playerView;
	public Controls UIControl;
	public Entity currEntity;
	
	private int displayW;
	private int displayH;
	
	@SuppressWarnings("unused")
	private int x, y;
	
	public Viewport(Entity currEntity) {
		displayW = Gdx.graphics.getWidth();
		displayH = Gdx.graphics.getHeight();
		
		int h = (int) (displayH/Math.floor(displayH/160));
		int w = (int) (displayW/(displayH/ (displayH/Math.floor(displayH/160))));
		
		playerView = new OrthographicCamera(w, h);
		playerView.zoom = 1f;
		
		UIControl = new Controls(); // This is here for generic menu controls.
		
		this.currEntity = currEntity;
	}
	
	public void update() {	
		playerView.position.x = currEntity.x;
		playerView.position.y = currEntity.y;
		playerView.update();
		
	}

}
