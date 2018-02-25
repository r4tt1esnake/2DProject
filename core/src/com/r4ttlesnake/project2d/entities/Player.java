package com.r4ttlesnake.project2d.entities;

import com.badlogic.gdx.Gdx;
import com.r4ttlesnake.project2d.ui.Controls;

public class Player extends Entity {
	
	public String name;
	public Controls playerInput = new Controls();
	
	public Player(String name) {
		this.name = name;
		Gdx.input.setInputProcessor(playerInput);
		objectType = "player";
	}
	
	@Override
	public void update() {
		if(playerInput.down) {
			y -= 3;
		}
		if(playerInput.up) {
			y += 3;
		}
		if(playerInput.right) {
			x += 3;
		}
		if(playerInput.left) {
			x -= 3;
		}
	}

}
