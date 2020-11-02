public class DutchNationalFlagAlgo{
    
    public static void swapper(int[] arr,int low, int mid){
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }
    
    
        //dutch national flag problem is used to sort array, 
        //the name dutch flag suggest that there will be only three type of values in array (red, white, blue)
        //red, blue, white are symoblic to any values of three types
        
         // initially low will be at 0 , mid at 0 and high pointing to last element in array, basically
        //low represents the color red , i.e all the minimum element needs to be on left hand side.
       //mid represents the mid color, i.e all the mid elements need to be in the middle
      //high represents the last color , i.e all the higher elements need to be on the right hand side.
      
      static int low = 0  , mid = 0 , high = 0;
      
      public static void flagColorSorter(int[] arr){
          high = arr.length - 1;
          
          while(mid <= high){
              
              
              //three operation , based on three colors
              if(arr[mid] == 0){
                  //if mid is 0 then swap with low , i.e place all red colors on left.
                  swapper(arr,low,mid);
                  low++;
                  mid++;
                  continue;
                  
              }
              if(arr[mid] == 1){
                  mid++;
                  continue;
              }
              if(arr[mid] == 2){
                  System.out.println("low : " + low + " mid " + mid  + " high " + high);
                  
                  swapper(arr,mid,high);
                  high--;
                  continue;
                  
              }
              
           }
      }  
      
        
        
    
    
    public static void main(String[] args){
        int[] a = {0,1,0,0,2,1,0,1,1,0,1,2};
        
        flagColorSorter(a);
        System.out.println();
        for(int num : a){
            System.out.print(num);
        }
        System.out.println();
        
    }
    
}
