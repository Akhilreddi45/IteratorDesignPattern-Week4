package com.example.iterator;

import java.util.*;

public class BubbleIterator implements Iterator<Bubble> {

	Bubble[] bubbles;

	int pos = 0;

	public BubbleIterator(Bubble[] bubbles) {
		this.bubbles = bubbles;
	}

	@Override
	public boolean hasNext() {
		if (pos >= bubbles.length || bubbles[pos] == null)
			return false;
		else
			return true;
	}

	@Override
	public Bubble next() {
		Bubble bubble = bubbles[pos];
		pos += 1;
		return bubble;
	}

}
