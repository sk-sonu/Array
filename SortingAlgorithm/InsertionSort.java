public class InsertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        int temp;
        int j;
        for(int i =1; i<n; i++){
            temp = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>temp){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void displayArray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,10,1,6,2};
        System.out.println("Original Array");
        displayArray(arr);
        System.out.println();
        sort(arr);
        System.out.println("Array After Sorting.....");
        displayArray(arr);
    }
}