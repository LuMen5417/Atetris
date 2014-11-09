package com.example.androidgames.framework;

import com.example.androidgames.framework.Graphics.PixmapFormat;

public interface Pixmap {
	public int getWidth();
	
	public int getHight();
	
	public PixmapFormat getFormat();
	
	public void dispose();
}
