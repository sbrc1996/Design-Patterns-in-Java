package org.example;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
    ArrayList<String> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size())
            return false;
        else
            return true;
    }

    @Override
    public String next() {
        String currentItem = (String) items.get(position);
        position++;
        return currentItem;
    }
}
