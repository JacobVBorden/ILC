public class binSearch {

    public int search(int[] arry, int target){

        int low = 0, high = arry.length - 1;
        while (low <= high) {
 
            // this prevents overflow errors. If you do (high+low)/2 then this can lead to overflow with
            // larger data sets. This equation will overflow less often. 
            int mid = low + (high - low) / 2;
 
            if (arry[mid] == target)
                return mid;
 
            if (arry[mid] < target)
                low = mid + 1;
 
            else
                high = mid - 1;
        }
 
        return -1;
    }
    
}

/*
Binary Search works by using a sorted array. It first finds the midpoit and checks if the mid is the target. 
If not then it checks if it is lower or higher to elminate one half of the array each iteration. 
This can be done itterativley or recursivley. I chose the itterative implementation as this was how I 
naturally thought through it. 
*/
