package com.example.iterator;

class SmallCircleBubbleCollection implements BubbleCollection {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Bubble[] smallCircleBubbleList;

	public SmallCircleBubbleCollection() {
		smallCircleBubbleList = new SmallCircleBubble[MAX_ITEMS];

		addItem(new SmallCircleBubble("red"));
		addItem(new SmallCircleBubble("blue"));
		addItem(new SmallCircleBubble("red"));
		addItem(new SmallCircleBubble("blue"));
		addItem(new SmallCircleBubble("red"));
	}

	public void addItem(SmallCircleBubble scb) {

		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Full");
		else {
			smallCircleBubbleList[numberOfItems] = scb;
			numberOfItems = numberOfItems + 1;
		}
	}

	public BubbleIterator createIterator() {
		return new BubbleIterator(smallCircleBubbleList);
	}
}