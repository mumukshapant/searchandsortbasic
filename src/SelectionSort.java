public class SelectionSort {
    public void selectionSort(int[] arr) {


        for(int i=0;i<arr.length;i++){

            int smallest=i;

            for(int j=0;j<arr.length;j++){

            if(arr[j]>arr[smallest])
                smallest=j;

                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }

    }
}