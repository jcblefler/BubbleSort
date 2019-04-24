package com.company;

public class Main {

    public static void main(String[] args) {

int array[] = new int[5];

    array[0] = 34;
    array[1] = 29;
    array[2] = 69;
    array[3] = 33;
    array[4] = 62;


    //a temporary variable to store array value
    int temp;

    //checks if the value of the next array item is less than current value
    // if it is then they switch positions
    // Used to sort in ascending order
    for (int i = 0; i < array.length; i++){
        for(int j = 0; j < array.length-1; j++){
            if (array[j]>array[j+1]){
                temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }
    //prints results
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.println("");
        }


    }
}
