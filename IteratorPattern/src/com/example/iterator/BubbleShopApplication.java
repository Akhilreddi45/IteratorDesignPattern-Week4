package com.example.iterator;

public class BubbleShopApplication {

	public static void main(String[] args) {
		BubbleShop bubbleShop = new BubbleShop(new LargeCircleBubbleCollection(), new SmallCircleBubbleCollection());
		System.out.println("print All Collection");

		bubbleShop.printBubbleCollection();
		System.out.println("");
		System.out.println("Red Collection");
		bubbleShop.printRedBubbleCollection();
		System.out.println("");

		System.out.println("Blue Collection");
		bubbleShop.printBlueBubbleCollection();
	}

}
