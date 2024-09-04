public class InsertionSort {

    int[] insertionSort(int[] arr){

        for(int i=1;i<arr.length; i++){
            int key=arr[i];
            int j=i-1;


            while(j>=0 && arr[j]>key ){
                arr[j+1]=arr[j];
                j=j-1;
            }

            arr[j+1]=key;



        }



        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{5,2,3,5,1,9,10,22};
        InsertionSort obj = new InsertionSort();
        arr = obj.insertionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    }
