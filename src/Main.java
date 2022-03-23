import java.util.Arrays;


public class Main {
    //public int c;
    public static void main(String[] args) {
        IntArrayList myList = new IntArrayList ();

        //fill our array with data
        creationArrayList (myList);

        //Demonstration of the work of the method "addAll" and print of the results
        myList.add (6, 33);

        //Demonstration of work of method "get"
        //Print value item 6:
        System.out.println("Added Item № 6, its value: " + myList.get(6));

        //Control our Array state
        printArrayState (myList);

        //Demonstration of the work of the void method "clear" and print of the results
        myList.clear();
        System.out.println("Applied the method 'clear'");
        printArrayState (myList);

        //Demonstration of the work of the boolean method "isEmpty ()" and print of the results
        System.out.println("Array is empty: " + myList.isEmpty() + '\n');

        //fill our array with new data
        creationArrayList (myList);
        printArrayState (myList);

        //Demonstration of the work of the method "set (int index, int element)" and
        //print of the results
        myList.set(0,555);
        System.out.println('\n' + "Set the elements # 0 equals 555: " + '\n');
        printArrayState (myList);

        //Demonstration of the work of the boolean method "remove (int index)" and print of the results
        System.out.println("Remove an element with index № 0: " + myList.remove(0) + '\n');
        myList.set(8,66);
        printArrayState (myList);

        //Demonstration of the work of the boolean method "removeIf (Predicate<? super E> filter)" and
        //print of the results
        System.out.println('\n' + "Remove the elements less than 50: " + myList.removeByValue(66) + '\n');
        myList.set(4,57);
        printArrayState (myList);

        //Demonstration of the work of the method "size ()" and
        //print of the results
        System.out.println('\n' + "Size of the Array: " + myList.size() + '\n');

        //Demonstration of the work of the method "subList ()" and
        //print of the result - "true" if list from 0 to 5 contains 57,
        //remove elements 0-5
        System.out.println('\n' + "Size of the Array: " + myList.subList(0, 5).contains(57) + '\n');
        myList.subList(0, 5).clear();
        printArrayState (myList);

        //Demonstration of the work of the method "toArray ()"
        myList.clear(); //Deleted old myList data
        creationArrayList (myList); //Created new ArrayList data
        int [] newArray; //declared array
        newArray = myList.toArray();//method toArray
        System.out.println("newArray current state: " + Arrays.toString(newArray));
        printArrayState (myList);
    }

    //Method for print All Array list
    //Сurrent state of the array
    public static void printArrayState(IntArrayList myList) {

        System.out.println("Array current state: " + Arrays.toString(myList.toArray()));
    }

    //Method fills 15 elements of the array with data,
    //demonstrates work of method "add"
    //and prints the elements of array.
    //Elements are pseudo-random numbers from 1 to 114
    public static void creationArrayList(IntArrayList myList) {

           for (int i = 0; i < 15; i++) {

            int c = (int) Math.round (i + Math.random() * 100);
            myList.add (c);
            System.out.print("Array's element " + i + ": " +  myList.get (i) + '\n');
        }
    }

}
