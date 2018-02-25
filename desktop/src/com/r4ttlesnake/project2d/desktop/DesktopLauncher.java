package com.r4ttlesnake.project2d.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.r4ttlesnake.project2d.Game;

public class DesktopLauncher {
	
	public static final double VERSION = 0.1;
	public static final String STAGE = "Alpha";
	
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 800;
		config.height = 576;
		config.title = "2DProject V " + VERSION + " " + STAGE;
		
		new LwjglApplication(new Game(), config);
		
	}
	
}
