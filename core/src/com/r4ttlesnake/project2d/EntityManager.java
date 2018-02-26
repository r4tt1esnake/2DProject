package com.r4ttlesnake.project2d;

import com.r4ttlesnake.project2d.entities.Entity;

public class EntityManager {
	
	public static void update() {
		for(int i = 0; i < Entity.entityList.size(); i++) {
			if(Entity.entityList.get(i).exists = false) {
				Entity.entityList.remove(i);
				if(Game.DEBUG) {
					System.out.println("Removed " + Entity.entityList.get(i).objectType);
				}
			}
			else {
				Entity.entityList.get(i).update();
				if(Game.DEBUG) {
					System.out.println(Entity.entityList.get(i).objectType + " is at " + Entity.entityList.get(i).x + ", " + 						Entity.entityList.get(i).y);
				}
			}
		}
	}

}