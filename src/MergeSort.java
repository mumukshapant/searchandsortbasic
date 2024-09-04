import java.util.ArrayList;
import java.util.List;

public class MergeSort {


  public void merge(int[] arr, int start, int mid, int end){

    /**
     * 1 ) use temp[] to store elements of sorted array after merging
     * 2 ) 2 pointers -- left & right where left=start & right= mid+1
     *
     * 3 ) while(left<=right && right<=end) {
     *   -- select smallest el from the 2 sides
     *   -- insert smallest element to temp array
     * }
     *
     * 4) Remaining els copy to temp[]
     * 5 ) Transfer el of temp[] from low to high in original array
     *
     */

    List<Integer> temp = new ArrayList<>(); // (1)

    int left= start;  // ( 2 )
    int right= mid+1;

    while(left<=right && right<=end){ //( 3 )

      if(arr[left]<=arr[right]){
        temp.add(arr[left]);
        left++;
      }else{
        temp.add(arr[right]);
        right++;
      }
    }

    // ( 4 ) remaining elements
    while(left<right){
      temp.add(arr[left]);
      left++;
    }

    while(right<end){
      temp.add(arr[right]);
      right++;
    }


    // (5 )
    for (int i = start; i <= end; i++) {
      arr[i] = temp.get(i - start);
    }



  }
  public void mergesort(int[] arr, int start, int end){

    if (start<end){
      int mid= start+(end-start)/2;

      mergesort(arr, start, mid);
      mergesort(arr, mid+1 , end);

      merge(arr, start , mid, end);
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[]{5, 2, 3, 5, 1, 9, 10, 22};
    MergeSort obj = new MergeSort();

   obj.mergesort(arr, 0, arr.length-1);

    for(int x:arr)
      System.out.println(x);
  }
}
