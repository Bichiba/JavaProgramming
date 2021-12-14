package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    // prints each integer of an integer array on seprate lines
    public static void printEach(int[]array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    // prints each double of double array in separate lines
    public static void printEach(double[]array){
        for (double each : array) {
            System.out.println(each);
        }
    }
// prints each char of a char array in separate lines
    public static void printEach(char[]array){
        for (char each : array) {
            System.out.println(each);
        }
    }

   // prints each string of a string array in separate lines
    public static void printEach(String[]array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from an integer Array
    public static int max (int[]numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];

    }

    //returns the maximum double number from a double array
    public static double max (double[]numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // check if the given integer is contained in the given array. returns boolean. contains(int[], int)
    public static boolean contains(int[] array,int element){
        boolean result = false;
        for (int each : array) {
            if (each == element){// if any arrays element is matching with the given element, it means the given elemnt is
                result = true;
            }
        }
        return result;
    }


    }
