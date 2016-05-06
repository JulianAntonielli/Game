package com.Wave.Graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(16, 1, 0, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * SIZE; // Ubica el sprite
		this.y = y * SIZE; // en la spritesheet.
		this.sheet = sheet; 
		load();
	}

	private void load() {
		for (int j = 0; j < SIZE; j++)
			for (int i = 0; i < SIZE; i++) {
				pixels[i + j * SIZE] = sheet.pixels[(i + x) + (j + y) * sheet.SIZE];
			}
	}
}
