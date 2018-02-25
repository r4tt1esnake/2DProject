package com.r4ttlesnake.project2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

public class Controls extends InputAdapter implements InputProcessor {
	
	// A list of keys.
	public boolean up = false;
	public boolean down = false;
	public boolean left = false;
	public boolean right = false;
	
	public boolean debug = false;

	public Controls() {
		
	}

	@Override
	public boolean keyDown(int keycode) {
		switch(keycode) {
		case Keys.DOWN:
			up = false;
			down = true;
			break;
		case Keys.UP:
			down = false;
			up = true;
			break;
		case Keys.LEFT:
			right = false;
			left = true;
			break;
		case Keys.RIGHT:
			left = false;
			right = true;
			break;
		case Keys.SEMICOLON:
			debug = !debug;
			break;
		case Keys.ESCAPE:
			Gdx.app.exit();
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
		case Keys.DOWN:
			down = false;
			break;
		case Keys.UP:
			up = false;
			break;
		case Keys.LEFT:
			left = false;
			break;
		case Keys.RIGHT:
			right = false;
			break;
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
