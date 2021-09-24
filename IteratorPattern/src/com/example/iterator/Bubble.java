package com.example.iterator;

/**
 *
 * Bubble class
 *
 */
public abstract class Bubble {

	String shape;
	String size;
	String color;

	/**
	 * This method is used to set by concrete classes which are extending the
	 * Bubble.
	 */
	abstract void setSizeAndShapeofBubble();

	public void pop() {
		System.out.println(" bubble Pops " + this.size + " : " + this.shape);
	}

	public void blow() {
		setSizeAndShapeofBubble();
		System.out.println(" Blowing :" + this.size + " : " + this.shape);
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
