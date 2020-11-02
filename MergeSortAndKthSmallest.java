public class MergeSortAndKthSmallest{
    
    public static void conquer(int[] arr,int low,int mid,int high){
        
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i = 0 ; i < n1 ; i++){
            left[i] = arr[i+low];
            
        }
        
        for(int j = 0 ; j < n2 ; j++){
            right[j] = arr[j + mid + 1];
        }
        int i = 0 , j = 0 , k = low;
        while(i < n1 && j < n2){
             if(left[i] <= right[j]){
                 arr[k++] = left[i++];
             }
             else{
                 arr[k++] = right[j++];
             }
             
        }
        
        while(i < n1){
            arr[k++] = left[i++];
        }
        while(i < n2){
            arr[k++] = right[i++];
        }
        
        
        
    }
    
    public static void divide(int[] arr,int low,int high){
        if(low < high){
            int mid = (high + low)/2;
            divide(arr,low,mid);
            divide(arr, mid+1, high);
            conquer(arr,low,mid,high);
        }
    }
    
    
    public static void main(String[] args){
        int[] arr = {10,2,4,12,2,43,23,32};
        
        divide(arr,0,arr.length - 1);
        
    //     System.out.println();
    //     for(int a : arr){
    //         System.out.print(a + " ");
    //     }
        
    //     System.out.println();
        
    // }
    
        System.out.println(arr[4 - 1]);
    }
    
}
