public class ArrayExploration {
    
    public static void main(String[] args) {
        
        int[] arr2 = {3, 7, -10, 2, 9, 1};

        //Q1:
        System.out.println(min(arr2));
        System.out.println(max(arr2));

        //Q2: 
        System.out.println(range(arr2));

        //Q3: 
        rev(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //Q4: 
        int [] arr3 = {3, 7, -10, 2, 8, 9, 5, 1};
        System.out.println(longestIncreasingSubsequence(arr3));


        // Q5: 
        int [] fibonacciArray = fib(10);
        for (int i = 0; i < fibonacciArray.length; i++) {
            System.out.println(fibonacciArray[i]);
        }

    }


    
    public static int min(int[] arr) {
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static int max(int[] arr) {
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int range(int[] arr) {
        return max(arr) - min(arr);
    }

    // Q: 3 
    public static void rev(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Q:4
    public static int longestIncreasingSubsequence(int [] arr){
        int longestLength = 0; 
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i+1] > arr[i]){
                count++; 
            }
            else {
                if (count > longestLength){
                    longestLength = count; 
                }
                count = 0;
            }
        }
        
        
        return longestLength + 1;
    }

    //Q5:
    public static int[] fib(int n){
        int [] fibArray = new int [n];
        fibArray[0] = 1;
        fibArray[1] = 1;

        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }

        return fibArray;
    }

    
}


/*
 * 1. It gives a compilation error stating that a ']' is expected.
 * 2. It initialises the array with value 0 in all places. 
 * 3. No, we can't go out of bound in java. It throws a compilation error stating "out of bound". One reason for that could be when you don't know the length of an array and you want to traverse all  the elements of it. One way to do that would be to have a catch for an array out of bound error. 
 * 
 */


