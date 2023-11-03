package HomeWork4;

import java.util.ArrayList;
import java.util.Iterator;

public class Box <T extends Fruit> implements Iterable<T>{
    private ArrayList<T> BoxList;
    private int weight;

    public Box(){
        weight = 0;
        this.BoxList = new ArrayList<>();
    }
    public void add(T fruit) {
        this.BoxList.add(fruit);
        weight += fruit.getWeight();
    }

    public int getWeight() {
        return weight;
    }

    public void move(Box<? super T> another) {
        for (T item: this.BoxList) {
            another.add(item);
        }

    }
    @Override
    public Iterator<T> iterator() {
        return BoxList.iterator();
    }
}
