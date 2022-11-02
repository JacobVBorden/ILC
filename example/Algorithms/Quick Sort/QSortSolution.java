public class QSortSolution{

    public void quicksort(int[] array){
        quicksort(array, 0, array.length - 1);

    }

    public void quicksort(int[] array, int left, int right){
        // If left is the same as right or left has gone past right then there is nothing left to check
        if(left < right){
            int index = partition(array, left, right);

            // call quick sort recursively on both halves
            quicksort(array, left, index -1);
            quicksort(array, index + 1, right);
            
        }

    }

    public int partition(int[] array, int left, int right){
        // picking the end value for the pivot
        int pivot = array[right]; 

        // Starting the index behind the array so that when it is moved up in the first if statement 
        // the index is at the start. 
        int index = (left - 1);


        // Starting from the begging find values lower then the pivot and swap them to the front of the array
        for (int i = left; i < right; i++){
            if (array[i] <= pivot){
                index++;
                
                //takes the first (intitally) value
                int tempSwap = array[index];

                //swaps the lower value to the front of the array
                array[index] = array[i];
                array[i] = tempSwap;
            }

            //swap the pivot to the center
            int swapTemp = array[index + 1];
            array[index + 1] = pivot;
            array[right] = swapTemp;

        }
        
        // Returns the index of midpoint (ie where the pivot is)
        return index + 1;
        
    }

}