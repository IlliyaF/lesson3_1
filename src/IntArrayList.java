import java.util.ArrayList;

public class IntArrayList implements IntList {

    private ArrayList<Integer> myArrList = new ArrayList ();
    @Override
    public boolean add(int element) {
        if (element == 0) {
            return false;
        } else {
            myArrList.add(element);
            return true;
        }
    }

    @Override
    public void add(int index, int element) {
        myArrList.add(index, element);
    }

    @Override
    public void clear() {
    myArrList.clear();
    }

    @Override
    public int get(int index) {
        myArrList.get(index);
        return 0;
    }

    @Override
    public boolean isEmpty() {
        myArrList.isEmpty();
        return true;
    }

    @Override
    public boolean remove(int index) {
        myArrList.remove(index);
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        myArrList.removeIf(integer -> integer == value);
        return false;
    }

    @Override
    public boolean set(int index, int element) {
        myArrList.set(index, element);
        return false;
    }

    @Override
    public int size() {
        myArrList.size();
                return 0;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {

         myArrList.subList(fromIndex, toIndex);

        return null;
    }

    @Override
    public char contains(int i) {
        IntList.super.contains(i);
        return 0;
    }

    @Override
    public int[] toArray() {
        myArrList.toArray();

        return new int[0];
    }
}
