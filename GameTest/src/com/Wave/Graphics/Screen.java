package com.Wave.Graphics;

import java.util.Random;

public class Screen {

	private int width, height;
	public int[] pixels;

	private final int MAP_SIZE = 8;
	private final int MAP_SIZE_MASK = MAP_SIZE - 1;

	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];

	private Random random = new Random();

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];

		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			if (i < 8)
				tiles[i] = 0xffffff;
			else if (i < 16)
				tiles[i] = 0x2BA4CC;
			else
				tiles[i] = random.nextInt(0xffffff);
		}
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void render(int xOffSet, int yOffSet) {
		for (int y = 0; y < height; y++) {
			int yPix = y + yOffSet;
			if(yPix < 0 || yPix >= height) continue;
			for (int x = 0; x < width; x++) {
				int xPix = x + xOffSet;
				if(xPix < 0 || xPix >= width) continue;
				pixels[(xPix) + (yPix) * width] = Sprite.grass.pixels[(x & Sprite.grass.SIZE - 1) + (y & Sprite.grass.SIZE - 1) * Sprite.grass.SIZE];
			}
		}
	}
}
