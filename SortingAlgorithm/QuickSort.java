import java.util.*;

public class QuickSort{
    public static  void displayArray(int arr[]){
    for(int i=0; i<arr.length;i++ ){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void quickSort(int array[], int lowerBound, int uppperBound){
        if(lowerBound<uppperBound){
            int local = partition(array, lowerBound, uppperBound);
            quickSort(array, lowerBound, local-1);
            quickSort(array, local+1, uppperBound);
        }
    }
    public static int partition(int array[], int lowerBound, int upperBound){
        int pivot = array[lowerBound];
        int start = lowerBound;
        int end = upperBound;
        while(start<end){
            while(array[start]<= pivot  && array[start] <= pivot){
                start++;
            }
            while(array[end]>pivot && array[end]>pivot){
                end--;
            }
            if(start<end){
                swap(array, start , end);
            }
        }
        swap(array,lowerBound, end);
        return end;
    }
  public static void swap(int arr[], int i, int j){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n;
      System.out.println("*****************This is the Quick Sort Algorithm*****************");
        System.out.print("Enter the size of the Array: ");
        n = sc.nextInt();
        System.out.println();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("**************Original Array Before Swapping**************");
        displayArray(array);
        int lowerBound = 0;
        int upperBound = n-1;
        quickSort(array, lowerBound, upperBound);
        System.out.println("**************Sorting Array After Swapping**************");
        displayArray(array);
        
        sc.close();
    }
}