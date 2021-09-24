package com.example.iterator;

/**
 *
 * Large Cicle Bubble
 *
 */
public class LargeCircleBubble extends Bubble {

	public LargeCircleBubble(String color) {

		this.color = color;
		setSizeAndShapeofBubble();
	}

	@Override
	void setSizeAndShapeofBubble() {
		this.shape = "circle";
		this.size = "large";
	}

}
