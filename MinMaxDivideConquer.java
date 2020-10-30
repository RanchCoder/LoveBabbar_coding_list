public class MinMaxDivideConquer{
    
    
    //Pair class is a static inner class, hence we simply need to call it Using the outerClass.InnerClass way
    //no need to initialize 
    static class Pair{
        int min;
        int max;
    }
    
    
    //we use recursive solution to divide and conquer the problem
    public static Pair getMinMax(int[] arr, int low, int high){
        
        Pair minMax  = new Pair();
        Pair mml = new Pair(); // to store min , max of left array.
        Pair mmr = new Pair(); // to store min , max of right array.
        
        
        //only one element is present in the array
        if(low == high){
            minMax.max = arr[low];
            minMax.min = arr[high];
            return minMax;
        }
        
        //if we have two elements in array
        if(low+1 == high){
            if(arr[low] > arr[high]){
                minMax.min = arr[high];
                minMax.max = arr[low];
            }else{
                minMax.min = arr[low];
                minMax.max = arr[high];
            }
            return minMax; // return the min , max pair stored in the minMax object of type Pair
        }
        
        //if we have more than two element
        int mid = (low + high) / 2;
        mml = getMinMax(arr,low,mid);  // go inwards towards left tree
        mmr = getMinMax(arr,mid+1,high); // go inwards towards right tree
        
        //now we can check which of our object has min and max element of current sub array
        
        //setting min
        if(mml.min < mmr.min){
            minMax.min = mml.min;
        }else{
            minMax.min = mmr.min;
        }
        //setting max
        if(mml.max >= mmr.max){
            minMax.max = mml.max;
        }else{
            minMax.max = mmr.max;
        }       
        return minMax; // this is the object that will store min , max value pair
        
        
    }   
    
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        
        MinMax.Pair pr = MinMax.getMinMax(arr,0,arr.length - 1);
        System.out.println(pr.min + " - " + pr.max);
    }    
    
    
}
