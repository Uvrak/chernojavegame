package com.thecherno.rain.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private String path;
	private final int SIZE = 256;
	public int[] pixels;
	
	public SpriteSheet(String path) {
		this.path = path;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	public void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
