/*
Quicksort
 * Author: Amy Nguyen
 * Class: CS3345 - Data Structures & Intro to Algorithm Analysis
 * Section: 004
 * Semester: Spring 2018
 * IDE USED: Intellij IDEA
 * Date: 04-15-2018
 */


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Print Array method
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        try {

            int input = 0;
            System.out.println("Please enter the size of the array: ");

            Random numbers = new Random();
            Scanner userInput = new Scanner(System.in);
            QuickSort sort = new QuickSort();

            //Print out original Array
            int n = userInput.nextInt();
            int[] orgInput = new int[n];

            for (int i = 0; i < n; i++) {
                orgInput[i] = Math.abs(numbers.nextInt(1000));
            }

            System.out.println("The original array is:");
            printArray(orgInput);

            //Initialize Array
            int[] array = orgInput;

            Scanner inputOption = new Scanner(System.in);

            System.out.println("---------------QuickSort Options---------------");
            System.out.println("");
            System.out.println("1.) 1st Element as Pivot");
            System.out.println("2.) Random Element as Pivot");
            System.out.println("3.) Median of 3 Random Elements as Pivot");
            System.out.println("4.) Book Technique");
            System.out.println("5.) Exit");
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("Please enter an interger from the QuickSort Options List");

            input = inputOption.nextInt();

            switch (input) {
                //Pivot = First Element
                case 1: {
                    long startTime = System.nanoTime();

                    System.out.println("---------------------------------------");
                    System.out.println("Original Array:");
                    printArray(orgInput);
                    System.out.println("");
                    System.out.println("Quicksort using 1st element as pivot:");
                    sort.sortFirst(array, 0, array.length - 1);
                    System.out.println("");
                    printArray(array);

                    long endTime = System.nanoTime();
                    long totalTime = endTime - startTime;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Time to execute in nano seconds: " + totalTime);

                    break;
                }
                //Pivot = Random
                case 2: {
                    long startTime = System.nanoTime();
                    System.out.println("---------------------------------------");
                    System.out.println("Original Array:");
                    printArray(orgInput);
                    System.out.println("");
                    System.out.println("Quicksort using random element as pivot:");
                    sort.sortRandom(array, 0, array.length - 1);
                    System.out.println("");
                    printArray(array);

                    long endTime = System.nanoTime();
                    long totalTime = endTime - startTime;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Time to execute in nano seconds: " + totalTime);

                    break;
                }
                //Pivot = Median of Three Random Elements
                case 3: {
                    long startTime = System.nanoTime();
                    System.out.println("---------------------------------------");
                    System.out.println("Original Array:");
                    printArray(orgInput);
                    System.out.println("");
                    System.out.println("Quicksort using the median of 3 random elements as pivot:");
                    sort.sortFirst(array, 0, array.length - 1);
                    System.out.println("");
                    printArray(array);

                    long endTime = System.nanoTime();
                    long totalTime = endTime - startTime;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Time to execute in nano seconds: " + totalTime);

                    break;
                }
                //Pivot = Book Technique (Median of First, Center, and Last)
                case 4: {
                    long startTime = System.nanoTime();
                    System.out.println("---------------------------------------");
                    System.out.println("Original Array:");
                    printArray(orgInput);
                    System.out.println("");
                    System.out.println("Quicksort using book technique as pivot:");
                    sort.sortBook(array, 0, array.length - 1);
                    printArray(array);

                    long endTime = System.nanoTime();
                    long totalTime = endTime - startTime;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Time to execute in nano seconds: " + totalTime);

                    break;
                }
                //Exit
                case 5: {
                    System.out.println("Exiting Program.");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("");
            System.out.println("***INVALID OPTION***");
            System.out.println("");
        }
    }
}

