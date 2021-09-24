package com.example.iterator;

public class BubbleShop {

	LargeCircleBubbleCollection largeCollection;
	SmallCircleBubbleCollection smallCollection;

	public BubbleShop(LargeCircleBubbleCollection largeCollection, SmallCircleBubbleCollection smallCollection) {
		this.largeCollection = largeCollection;
		this.smallCollection = smallCollection;
	}

	public void printBubbleCollection() {
		BubbleIterator largeBubbleIterator = largeCollection.createIterator();
		BubbleIterator smallBubbleIterator = smallCollection.createIterator();

		printBubbleCollection(largeBubbleIterator, null);
		printBubbleCollection(smallBubbleIterator, null);

	}

	private void printBubbleCollection(BubbleIterator bubbleIterator, String color) {

		while (bubbleIterator.hasNext()) {
			Bubble bubble = bubbleIterator.next();
			if (color == null) {
				System.out.print(" Shape : " + bubble.getShape());
				System.out.print(" Color : " + bubble.getColor());
				System.out.print(" Size :" + bubble.getSize());
				System.out.println("");
			} else if (color.equals(bubble.getColor())) {
				System.out.print(" Shape : " + bubble.getShape());
				System.out.print(" Color : " + bubble.getColor());
				System.out.print(" Size :" + bubble.getSize());
				System.out.println("");
			}

		}

	}

	public void printRedBubbleCollection() {
		BubbleIterator largeBubbleIterator = largeCollection.createIterator();
		BubbleIterator smallBubbleIterator = smallCollection.createIterator();

		printBubbleCollection(largeBubbleIterator, "red");
		printBubbleCollection(smallBubbleIterator, "red");

	}

	public void printBlueBubbleCollection() {
		BubbleIterator largeBubbleIterator = largeCollection.createIterator();
		BubbleIterator smallBubbleIterator = smallCollection.createIterator();

		printBubbleCollection(largeBubbleIterator, "blue");
		printBubbleCollection(smallBubbleIterator, "blue");

	}

}
