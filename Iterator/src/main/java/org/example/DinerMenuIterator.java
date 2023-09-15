package org.example;

public class DinerMenuIterator implements Iterator{
    String[] items;
    int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        String currentMenu = items[position];
        position++;
        return currentMenu;
    }
}
