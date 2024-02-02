package Model;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.util.Iterator;
import java.util.List;


public class GameObjectIterator implements Iterator<GameObject> {

    int index = 0;
    List<GameObject> x;

    public GameObjectIterator(List<GameObject> x) {
        this.x = x;
    }

    @Override
    public boolean hasNext() {
        if (index < x.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public GameObject next() {
        GameObject m = x.get(index);
        index++;
        return m;
    }
}
