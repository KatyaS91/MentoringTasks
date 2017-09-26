package tasks.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CheckSpeed {
    public static void main(String[] args) {

        ArrayList<String> arrayListForTest = createArrayList();
        LinkedList<String> linkedListForTest = createLinkedList();

        long time = 0;
        //find element
        for (int i = 0; i < 100; i++) {
            time = +findElement(arrayListForTest);
        }
        System.out.println("Average time to find element in array list is " + String.valueOf(time / 100) + " nanoseconds");

        //delete element
        time = 0;
        for (int i = 0; i < 100; i++) {
            time = +removeElement(arrayListForTest);
        }
        System.out.println("Average time to delete element in array list is " + String.valueOf(time / 100) + " nanoseconds");

        //add element
        time = 0;
        for (int i = 0; i < 100; i++) {
            time = +addElement(arrayListForTest);
        }
        System.out.println("Average time to add element in array list is " + String.valueOf(time / 100) + " nanoseconds");

        //find element
        time = 0;
        for (int i = 0; i < 100; i++) {
            time = +findElement(linkedListForTest);
        }
        System.out.println("Average time to find element in linked list is " + String.valueOf(time / 100) + " nanoseconds");

        //delete element
        time = 0;
        for (int i = 0; i < 100; i++) {
            time = +removeElement(linkedListForTest);
        }
        System.out.println("Average time to delete element in linked list is " + String.valueOf(time / 100) + " nanoseconds");

        //add element
        time = 0;
        for (int i = 0; i < 100; i++) {
            time = +addElement(linkedListForTest);
        }
        System.out.println("Average time to add element in linked list is " + String.valueOf(time / 100) + " nanoseconds");
    }

    private static long findElement(List<String> list) {
        String elToFindAndRemove = list.get(10000);
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elToFindAndRemove)) {
                break;
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long removeElement(List<String> list) {
        String elToFindAndRemove = list.get(10000);
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elToFindAndRemove)) {
                list.remove(i);
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long addElement(List<String> list) {
        long start = System.nanoTime();
        list.add("test");
        long end = System.nanoTime();
        return end - start;
    }


    private static ArrayList<String> createArrayList() {
        ArrayList<String> array = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 15000; i++) {
            array.add(i, Integer.toString(random.nextInt()));
        }
        return array;
    }

    private static LinkedList<String> createLinkedList() {
        LinkedList<String> array = new LinkedList<String>();
        Random random = new Random();
        for (int i = 0; i < 15000; i++) {
            array.add(i, Integer.toString(random.nextInt()));
        }
        return array;
    }
}
