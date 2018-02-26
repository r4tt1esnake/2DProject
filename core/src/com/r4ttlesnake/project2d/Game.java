package com.r4ttlesnake.project2d;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.r4ttlesnake.project2d.entities.Player;
import com.r4ttlesnake.project2d.ui.Viewport;

public class Game extends ApplicationAdapter {
	
	// ALL PRAISE THE GREAT DEBUG BOOLEAN!
	public static final boolean DEBUG = false;
	
	// Never ever initialize objects here - please only declare pointers!
	SpriteBatch batch;
	Texture img;
	Viewport mainCam;
	Player hero;
	AssetManager assetManager;
	
	@Override
	public void create () {
		assetManager = new AssetManager();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		hero = new Player("Bobe");
		mainCam = new Viewport(hero);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		EntityManager.update();
		mainCam.update();
		
		batch.setProjectionMatrix(mainCam.playerView.combined);
		batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
		
		batch.begin();
		batch.disableBlending();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
	
	@Override
	public void pause() {
		
	}
	
	@Override
	public void resume() {
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
}
