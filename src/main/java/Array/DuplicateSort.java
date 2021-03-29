package Array;

public class DuplicateSort {

    public static int DeleteDuplicateandElements(int arr[], int n){
         if (n==0 || n==1){
             return n;
         }
         int[] temp = new int[n];
         int j = 0;

         for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
 
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
        }

        public static void main(String[] args){
        int arr[] = {1,12,7,3,6,9,7,15,1,8,4,3,9,4,5};  
        int length = arr.length;  
        length = DeleteDuplicateandElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" "); 
        }
}
