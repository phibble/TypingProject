package com.github.phibble;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private int width;
	private int height;
	String title;
	
	public Frame(int width, int height)
	{
		this.width = width;
		this.height = height;
		title = "My Window";
		
		setFrame();
	}
	
	public Frame(int width, int height, String title)
	{
		this.width = width;
		this.height = height;
		this.title = title;

		setFrame();
	}
	
	private void setFrame()
	{
		JFrame frame = this;
		frame.setPreferredSize(new Dimension(width, height));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAutoRequestFocus(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle(title);
		frame.pack();
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
}
