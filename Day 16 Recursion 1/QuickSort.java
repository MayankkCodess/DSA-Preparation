public class QuickSort {

    public static void quickSortRecursion(int arr[] , int si , int ei){
        //Base Case 
        if(si>=ei){
            return;
        }
        //last element-pivot
        int pivotIdx = partition(arr,si,ei);
        quickSortRecursion(arr,si,pivotIdx-1);
        quickSortRecursion(arr,pivotIdx+1,ei);
    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1;// to make place for elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]  = temp;
            }
        }
        i++;
        int temp = pivot ;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] =  {6,3,9,8,2,5};
        quickSortRecursion(arr,0,arr.length);
    }
}