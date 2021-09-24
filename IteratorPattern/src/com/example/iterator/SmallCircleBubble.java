package com.example.iterator;

/**
 *
 * Small Cicle Bubble
 *
 */
public class SmallCircleBubble extends Bubble {

	public SmallCircleBubble(String color) {

		this.color = color;
		setSizeAndShapeofBubble();
	}

	@Override
	void setSizeAndShapeofBubble() {
		this.shape = "circle";
		this.size = "small";
	}

}
