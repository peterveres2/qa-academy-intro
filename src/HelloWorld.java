public class HelloWorld{

     public static void main(String []args){
     //Write a function that returns the largest element in a list.
      //int[] arrTemp = {10, 12, 1, -2, 0, 132};
      System.out.println(getMax(new int[] {10, 12, 1, -2, 133, 134}));
      firstNFibonacci(7);
    }
    
    static int getMax(int[] arr){
        int max = arr[0];
        int secMax = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                secMax = max;
                max = arr[i];
            }
            else {
                if (secMax < arr[i]) {
                    secMax = arr[i];
                }
            }
        }
        return secMax;
    }
    

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
        
    static void firstNFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
    }  
    
}