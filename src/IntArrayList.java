import java.util.ArrayList;

public class IntArrayList implements IntList {

    private final ArrayList<Integer> myArrList = new ArrayList ();
    @Override
    public boolean add(int element) {
        if (element == 0) {
            return false;
        } else {
            myArrList.add(myArrList.size(), element);
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

        return myArrList.get(index);
    }

    @Override
    public boolean isEmpty() {

        return myArrList.isEmpty();
    }

    @Override
    public boolean remove(int index) {
        myArrList.remove(index);
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        myArrList.removeIf(integer -> integer == value);
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        myArrList.set(index, element);
        return true;
    }

    @Override
    public int size() {

        return myArrList.size();
    }

    @Override
    public int[] subList(int fromIndex, int toIndex) {
        ArrayList <Integer> myArr = new ArrayList(myArrList.subList(fromIndex, toIndex));

        int[] ints = new int[myArr.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = myArr.get(i);
        }

        return ints;
    }


    @Override
    public int[] toArray() {
       //myArrList.toArray();
       int[] ints = new int[myArrList.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = myArrList.get(i);
        }

        return ints;
    }
}
