package com.example.iterator;

class LargeCircleBubbleCollection implements BubbleCollection
{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Bubble[] largeCircleBubbleList;
  
    public LargeCircleBubbleCollection()
    {
        largeCircleBubbleList = new LargeCircleBubble[MAX_ITEMS];
  
        addItem(new LargeCircleBubble("red"));
        addItem(new LargeCircleBubble("blue"));
        addItem(new LargeCircleBubble("red"));
        addItem(new LargeCircleBubble("blue"));
        addItem(new LargeCircleBubble("red"));
    }
  
    public void addItem(LargeCircleBubble lcb)
    {
    	
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            largeCircleBubbleList[numberOfItems] = lcb;
            numberOfItems = numberOfItems + 1;
        }
    }
  
    public BubbleIterator createIterator()
    {
        return new BubbleIterator(largeCircleBubbleList);
    }
}