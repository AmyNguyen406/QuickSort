import java.util.Random;
import java.util.Arrays;

public class QuickSort {

    //----------Pivot = First Element---------
    public static void sortFirst(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;
        if (start >= end)
            return;

        int pivot = array[start];


        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (start < j)
            sortFirst(array, start, j);
        if (end > i)
            sortFirst(array, i, end);
    }

    //------------Pivot = Random--------------
    public static void sortRandom(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;
        if (start >= end)
            return;


        Random randomPivot = new Random();
        int pivot = array[Math.abs(randomPivot.nextInt(array.length-1))];


        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (start < j)
            sortFirst(array, start, j);
        if (end > i)

            sortFirst(array, i, end);
    }

    //--------------Pivot = Median of Three Random Elements---------------
    public static void sortMedian(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;

        if (start >= end)
            return;

        // Get 3 random elements
        Random random = new Random();
        int a = random.nextInt(array.length-1);
        int b = random.nextInt(array.length-1);
        int c = random.nextInt(array.length-1);

        // Put in array, sort, middle element is pivot
        int[] medianArray = {a, b, c};
        Arrays.sort(medianArray);
        int pivot = medianArray[1];


        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (start < j)
            sortFirst(array, start, j);
        if (end > i)
            sortFirst(array, i, end);
    }

    //-----------------Pivot = Book Technique (Median of First, Center, and Last)-----------------
    public static void sortBook(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;

        if (start >= end)
            return;

        //find 1st, middle, and last elements of array
        int first = array[start];
        int middle = array[(start + end) / 2];
        int last = array[end];

        //put into new array, sort, set pivot to middle element
        int[] medianArray = {first, middle, last};
        Arrays.sort(medianArray);
        int pivot = medianArray[1];

        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (start < j)
            sortFirst(array, start, j);
        if (end > i)
            sortFirst(array, i, end);
    }
}

