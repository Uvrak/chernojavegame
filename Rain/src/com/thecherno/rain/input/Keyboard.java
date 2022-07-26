package com.thecherno.rain.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	private boolean[] keys = new boolean[120];
	public boolean up, down, left, right;
	
	public void update() {
		
		up 		= keys[KeyEvent.VK_UP];
		down 	= keys[KeyEvent.VK_DOWN];
		left 	= keys[KeyEvent.VK_LEFT];
		right 	= keys[KeyEvent.VK_RIGHT];
		
		if(up) System.out.println(up);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Automatisch generierter Methodenstub
		keys[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Automatisch generierter Methodenstub
		keys[e.getKeyCode()] = false;
	}

}
