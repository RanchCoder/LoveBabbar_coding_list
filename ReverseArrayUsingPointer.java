public class Reverse{
    
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        int i , j , swap;
        // we will have two pointer ,one starting from 0 and other at the end of array
        //one by one they will proceed towards each other
        //if j > i, then it means more elements are to be swapped
        //if i == j that means the pointer has reached in the middle of the list
        //if j < i that means our pointers are now pointing to already swapped element.
        for( i = 0 , j = arr.length - 1; j > i ; i++,j--){
            if(j - i >= 1){
            swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        
            }
        }
        
        
        for(int a : arr){
            System.out.print(a);
        }
        
    }
    
    
}
