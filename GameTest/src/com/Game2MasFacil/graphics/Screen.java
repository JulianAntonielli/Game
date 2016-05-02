package com.Game2MasFacil.graphics;

public class Screen {

	private int width, height;
	public int[] pixels;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	int time = 0, counter = 0; //remove l8r;

	public void render() {
		counter++;
		if (counter % 20 == 0) {
			time++;
		}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[time+1+time*width] = 0xffffff;
				pixels[time+(1+time)*width] = 0xffffff;
				pixels[time+1+(1+time)*width] = 0xffffff;
				pixels[time+time*width] = 0xffffff;
			}
		}
	}
}
