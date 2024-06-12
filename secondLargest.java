// Java program to find second largest element in an array.
import java.util.*;
public class secondLargest {
    static void print2largest(Integer arr[], int arr_size)
    {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 1; i < arr_size; i++) {
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                                + "element is %d\n",
                        arr[i]);
                return;
            }
        }
        System.out.print("There is no second "+"largest element\n");
    }
    public static void main(String[] args)
    {
        Integer arr[] = { 12, 3, 1, 10, 34, 158 };
        int n = arr.length;
        print2largest(arr, n);
    }
}