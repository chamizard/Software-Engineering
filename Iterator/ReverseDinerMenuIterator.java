public class ReverseDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = -1;

    public ReverseDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        for (MenuItem menuItem:items) {
            if(menuItem != null) {
                position++;
            }
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position - 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}