public class DividenConquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static void mergeSort(int arr[], int si, int ei ){
      if(si>=ei){
        return ;
      }
       int mid = si+ (ei-si)/2;
       // To divide the half array
       mergeSort(arr, si, mid );
       // to divide the rest array 
       mergeSort( arr, mid+1, ei);
       // call merge so that they can merge using temporary array and then copy to the original array
       merge(arr,si, ei, mid);
        
    }
    public static void merge(int arr[], int si, int ei , int mid){
      // first make temporary array so that you can compare and then copy to original
      int temp[] = new int[ei-si+1]; // this is the temporary array inserting the sorted value 
      int i = si;  // this is for the left sorted array
      int j= mid+1;  // this is for the right sorted array 
      int k =0; // this is for the temporary array

      // Comparing the values
      while( i <=mid && j<= ei){
       if( arr[i] <= arr[j]) {
         temp[k] = arr[i];
         i++;
       }else{
           temp[k] = arr[j];
           j++;
       }
       k++;
      }

      //If the values of some iterators remains left then what you have to do is print them
      while( i<= mid ){
        temp[k++] = arr[i++]; // Here you have been swapped the remaining value of left sorted array
      }
      while(j<=ei){
        temp[k++] = arr[j++]; // Here you have been swapped the remaining value of right sorted array
      }
    
    
      // Now copy the duplicate array into the sorted array
      for(i=si ,  k=0; k<temp.length;k++,i++){
        arr[i] = temp[k];
      }



    }
    public static void main(String args[]){
    int arr[] = {6,3,9,5,2,8};
    mergeSort(arr, 0,  arr.length-1);
    // merge(arr, 0, arr.length-1, 0);
    printArr(arr);
    }
}