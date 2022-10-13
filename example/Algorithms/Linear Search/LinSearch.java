public class LinSearch {

    public int search(int[] arry, int target){

        for(int i=0; i < arry.length; i++){
            if(arry[i] == target){
                return i; 
            }
        }
        return -1;
    }
    
}

/*
Linear search goes through each element of an array to find the target and then returns the index. If the target is not present it returns -1. 
*/
