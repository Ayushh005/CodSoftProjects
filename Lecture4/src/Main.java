class Main {

    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2,7,6};

        for (int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



