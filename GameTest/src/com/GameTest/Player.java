package com.GameTest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject{


	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		Random r = new Random();
		x += r.nextInt(5)-1;
		y += r.nextInt(5)-1;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 20, 20);
	}

}
