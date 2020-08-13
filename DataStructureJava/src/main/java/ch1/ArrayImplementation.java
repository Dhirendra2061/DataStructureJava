package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestArray {

    private int arr[];
    private int nElement;

    public TestArray(int max) {
        arr = new int[max];
        nElement = 0;
    }

    public void printArray() {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public void insertData(int value) {
        if(nElement==arr.length){
            System.out.println("Array is Full");
            return;
        }
        arr[nElement] = value;
        nElement++;
    }

    public boolean deleteData(int value) {
        int i,j;
        for (i = 0; i < nElement; i++) {
            if (arr[i] == value)
                break;
        }
        if (i == nElement) {
            return false;
        } else {
            for ( j = i; j < nElement-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j]=0;
            nElement--;
            return true;
        }
    }

    public int search(int value) {
        int i;
        for (i = 0; i < nElement; i++) {
            if (arr[i] == value) {
                break;
            }
        }
        if (i == nElement)
            return -1;
        else
            return i;
    }
}


public class ArrayImplementation {
    public static void main(String[] args) {

        int size=getIntFromUser("Size of Array");
        TestArray testArray=new TestArray(size);

        for(int i=0;i<size;i++) {
            testArray.insertData(getIntFromUser(i +"place Input Element"));
        }
        testArray.printArray();

        testArray.deleteData(getIntFromUser("Delete Element"));
        testArray.printArray();
        testArray.deleteData(getIntFromUser("Delete Element"));

        testArray.printArray();

        testArray.insertData(getIntFromUser(" Input Element"));

        testArray.printArray();

        testArray.insertData(getIntFromUser(" Input Element"));

        testArray.printArray();

        int i=testArray.search(getIntFromUser(" Search Element"));
        if (i != -1) {
            System.out.println("Element Found ");
        } else {
            System.out.println("Element Not Found");
        }
        testArray.printArray();



    }


    public static int getIntFromUser(String msg) {
        System.out.println(" Enter the Value of "+msg+" :: ");
        String input = null;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(input);

    }


}
