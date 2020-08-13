package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrintTable {
    int number;

    public PrintTable(int number) {
        this.number = number;
    }

    public void printMultiplicationTable() {
        int[][] arr = new int[this.number][this.number];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("*******Table of "+i+" is Complete********");
        }
    }

}

public class MultiplicationTable {

    public static void main(String[] args) {
        int num = getIntFromUser();
        PrintTable printTable = new PrintTable(num);
        printTable.printMultiplicationTable();
    }


    public static int getIntFromUser() {
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
