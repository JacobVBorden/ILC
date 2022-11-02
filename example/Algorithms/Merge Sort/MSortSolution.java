// Time complexity is always O(n log(n)) as it will always devide the arrays equally and merge. 
// Space complexity is O(n) as we need to create temp arrays for each recurssive call

public class MSortSolution {
    
    public static void mergeSort(int[] array, int leng){
        //base case 
        if (leng < 2){
            return;

        }

        int mid = leng/2;
        //sets lengths of the 2 sides
        // leng - mid sets the right side as the large side if the array length is odd
        int[] left = new int[mid];
        int[] right = new int[leng - mid];

        //fills the 2 halves
        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = mid; i < leng; i++){
            right[i - mid] = array[i];
        }

        mergeSort(left, mid);
        mergeSort(right, leng - mid);

        merge(array, left, right, mid, leng - mid);

    }

    public static void merge(int[] array, int[] left, int[] right, int leftEnd, int rightEnd){
        int leftPointer = 0, rightPointer = 0, finalArrayPointer = 0;

        //Merges 2 arrays by checking if the left or right is smaller and adding the smaller to the begging
        // of the array and increasing the index
        while (leftPointer < leftEnd && rightPointer < rightEnd) {
            if (left[leftPointer] <= right[rightPointer]) {
                array[finalArrayPointer++] = left[leftPointer++];
            }
            else {
                array[finalArrayPointer++] = right[rightPointer++];
            }
        }
        //If the left or right side has more values then the other this takes the rest of the values out of the 
        // remaing array
        while (leftPointer < leftEnd) {
            array[finalArrayPointer++] = left[leftPointer++];
        }
        while (rightPointer < rightEnd) {
            array[finalArrayPointer++] = right[rightPointer++];
        }
        }

}
