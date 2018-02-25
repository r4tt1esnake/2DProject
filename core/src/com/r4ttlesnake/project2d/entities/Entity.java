package com.r4ttlesnake.project2d.entities;

import java.util.ArrayList;

public class Entity {
	
	public static ArrayList<Entity> entityList = new ArrayList<Entity>();
	
	public int x;
	public int y;
	public boolean exists = true;
	public String objectType = "Generic Object";
	
	public Entity() {
		x = 0;
		y = 0;
		entityList.add(this);
	}
	
	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
		entityList.add(this);
	}

	public void update() {
		
	}

}
