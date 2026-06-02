class BubbleSort{
    public static void sorting(int[] arr){
        int n = arr.length;
        int temp;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1; j++)
            {
                if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }

    }
    public static void displayArray(int arr[]){
        for(int i = 0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {15, 16,6,8,5};
        System.out.println("Original Array");
        displayArray(arr);
        sorting(arr);
        System.out.println("Array after sorting...");
        displayArray(arr);
    }
}