package Assessment;

import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void sortArray(List<Integer> numbers){
        int[] A = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
            A[i] = numbers.get(i).intValue();
        }

        mergeSort(A);
        printArray(A);
    }

    private static void printArray(int[] A){
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    private static int[] mergeSort(int [] A){
        int mid = A.length / 2;
        if(A.length < 2)
            return A;

        int [] left = Arrays.copyOfRange(A, 0, mid);
        int [] right = Arrays.copyOfRange(A, mid, A.length);

        mergeSort(left);
        mergeSort(right);
        A = merge(A, left, right);
        return A;
    }

    private static int[] merge(int [] A, int [] left, int [] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k] = left[i];
                i++;
            }else{
                A[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            A[k++] = left[i++];
        }

        while(j < right.length){
            A[k++] = right[j++];
        }

        return A;
    }
}
