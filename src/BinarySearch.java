public class BinarySearch {

    public int binarySearch(int[] arr, int key ){

        int left=0;
        int right=arr.length-1;


       while(left<=right){
           int mid= (left+right)/2;
           if(arr[mid]==key){
               System.out.println(mid);
               return mid;
           } else if (arr[mid]>key) {

               right=mid-1;

           }else {left=mid+1; }


       }
       //element not found
       return -1;
    }
}
