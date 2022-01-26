package Assignment_01;
import java.util.Scanner;
/**
 * Name: Ngoc Duy Nguyen
 * Date: January 25th, 2022
 * Description: CS321_Assignment_01
 */
public class Main {
    /**Determine if two arrays are equal*/
    public static void equalArray(int[]a, int[]b){
        boolean equal = true;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                equal = false;
                break;}
        }
        if(equal)
            System.out.println("-> Two arrays are equal");
        else
            System.out.println("-> Two arrays are not equal");
    }
    /**Copy an array to a new array*/
    public static int[] copyArray(int[] arr, int size){
        int[] a = new int[size];
        for(int i=0; i<size; i++)
        a[i] = arr[i];
        return a;
    }

    /** Calculate the sum of the rows in 2D array*/
    public static void calculateMatrix(int[][] b, int cols, int rows){
        int[] rowsSum = new int[cols];
        for(int i=0; i<cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++)
            {
                sum += b[i][j];
            }
            rowsSum[i] = sum;
            System.out.println("Sum in row number " + i + " is: " + rowsSum[i]);
        }
    }
    /** Calculate hamming distance of two arrays*/
    public static void hammingDistance(int[] a, int[]b){
        int counter = 0;
        for(int i=0; i< a.length; i++)
        {
            if( a[i] != b[i])
                counter++;
        }
        System.out.print("Hamming distance of two arrays is " + counter);
    }

    /**Binary search*/
    public static void binarySearch(int[] c, int target){
        int first = 0, last = c.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if (c[mid] < target)
                first = mid + 1;
            else if ( c[mid] == target ){
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else
                last = mid - 1;

            mid = (first + last)/2;
        }
        if (first > last){
            System.out.println("Element is not found!");
        }
    }

    /**
     * Main function
     * @param args Execute methods for Assignment_01
     */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("1. Determine if two arrays are equal");
        System.out.print("Please input length of the array: ");
        length = input.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.print("Please input element of Array1: ");
        for(int i=0; i<length; i++)
            array1[i] = input.nextInt();

        System.out.print("Please input element of Array2: ");
        for(int i=0; i<length; i++)
            array2[i] = input.nextInt();

        /// Question 1
        equalArray(array1, array2);

        /// Question 2
        System.out.println("\n2. Copy a portion of a given array to a new array");
        int  elements, a;
        int[] temp = {};
        do {
            System.out.print("Which array do you want to copy (type 1 or 2): ");
            a = input.nextInt();
        }while(a!=1 && a!=2);
        if (a==1)
            temp = array1;
        else if (a==2)
            temp = array2;

        System.out.print("How many elements do you want to copy: ");
        elements = input.nextInt();

        int[] copyArray = copyArray(temp, elements);
        System.out.print("New array copied from array" + a + " is: ");
        for(int i=0; i<elements; i++)
            System.out.print(copyArray[i] + " ");

        /// Question 3
        System.out.println("\n\n3. Calculate the sum of the rows in 2D array");
        int rows, cols;

        System.out.print("Please enter number of rows:");
        rows = input.nextInt();

        System.out.print("Please enter number of column:");
        cols = input.nextInt();

        int[][] matrix = new int[cols][rows];
        System.out.println("Please enter value of 2D array:");

        for(int i=0; i<cols;i++)
            for(int j=0; j<rows; j++)
                matrix[i][j] = input.nextInt();

        calculateMatrix(matrix, cols, rows);

        ///Question 4
        System.out.println("\n4. Calculate the Hamming distance");
        int length1;

        System.out.print("Please input length of the array: ");
        length1 = input.nextInt();

        int[] array3 = new int[length1];
        int[] array4 = new int[length1];

        System.out.print("Please input element of Array3: ");
        for(int i=0; i<length1; i++)
            array3[i] = input.nextInt();

        System.out.print("Please input element to Array4: ");
        for(int i=0; i<length1; i++)
            array4[i] = input.nextInt();

        hammingDistance(array3, array4);

        ///Question 5
        System.out.println("\n\n5. Perform binary search");
        int target;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Please input value of target: ");
        target = input.nextInt();
        binarySearch(array, target);
    }
}
