public class MinMax{
    
    
    //Pair class is a static inner class, hence we simply need to call it Using the outerClass.InnerClass way
    //no need to initialize 
    static class Pair{
        int min;
        int max;
    }
    
    //getMinMax is a static method so we do not need to intialize the class.
    //It returns a Pair type of Object , which is our defined type
    //Hence we can initialize our static inner class to the return value of this function.
    static Pair getMinMax(int[] arr,int n){
        
        Pair minMax = new Pair();
        
        //if there is only one element in the List
        if(n == 1){
            minMax.min = arr[0];
            minMax.max = arr[0];
            return minMax;
        }
        
        if(arr[0] > arr[1]){
            minMax.min = arr[1];
            minMax.max = arr[0];
        }else{
            minMax.min = arr[0];
            minMax.max = arr[1];
        }
        
        for(int i = 2 ; i < n ; i++){
            if(arr[i] > minMax.max){
                minMax.max = arr[i];
            }else if(arr[i] < minMax.min){
                minMax.min = arr[i];
            }
        }
        
        return minMax;
        
        
    }
    
    
    
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        
        MinMax.Pair pr = MinMax.getMinMax(arr,arr.length);
        System.out.println(pr.min + " - " + pr.max);
    }    
    
    
}
