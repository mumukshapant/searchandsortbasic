//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Objects;
//
//import javax.sound.sampled.Line;
//
//public class LinearSearch {
//
//
//  int[][][] memo;
//  static int mod = (int)Math.pow(10, 9) + 7;
//  class Item {
//    int len;
//    int vowels;
//    long count;
//
//    public Item(int len, int vowels, long count) {
//      this.len = len;
//      this.vowels = vowels;
//      this.count = count;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//      if (this == o) return true;
//      if (o == null || getClass() != o.getClass()) return false;
//      Item item = (Item) o;
//      return len == item.len && vowels == item.vowels;
//    }
//
//    @Override
//    public int hashCode() {
//      Objects Objects;
//      return Objects.hash(len, vowels);
//    }
//  }
//
//    static int calculateWays(int wordLen, int maxVowels){
//  {
//    if (wordLen == 0)
//      return 0;
//    ArrayDeque q = new ArrayDeque<>();
//    q.offer(new Item(1, 0, 21));
//    if (maxVowels > 0) {
//      q.offer(new Item(1, 1, 5));
//    }
//    for (int l = 1; l < wordLen; l++) {
//      int qs = q.size();
//      HashMap<Item, Item> map = new HashMap<>();
//      while (qs > 0) {
//        var item = q.poll();
//        long count;
//        if (item.vowels + 1 <= maxVowels) {
//          count = (item.count * 21) % mod;
//          var next = new Item(item.len + 1, item.vowels, count);
//          var exist = map.get(next);
//          if (exist == null) {
//            map.put(next, next);
//            q.offer(next);
//          } else {
//            exist.count = (exist.count + count) % mod;
//          }
//          count = (item.count * 5) % mod;
//          next = new Item(item.len + 1, item.vowels + 1, count);
//          exist = map.get(next);
//          if (exist == null) {
//            map.put(next, next);
//            q.offer(next);
//          } else {
//            exist.count = (exist.count + count) % mod;
//          }
//        } else {
//          count = (item.count * 21) % mod;
//          var next = new Item(item.len + 1, 0, count);
//          var exist = map.get(next);
//          if (exist == null) {
//            map.put(next, next);
//            q.offer(next);
//          } else {
//            exist.count = (exist.count + count) % mod;
//          }
//        }
//        qs--;
//      }
//    }
//    long ans = 0;
//    while (!q.isEmpty()) {
//      ans = (ans + q.poll().count) % mod;
//    }
//    return (int)ans;
//    }
//
//
//  static int longest_subsequence(String s){
//
//          int ans = 0, l = 0, r = 0;
//          int n = s.length();
//          int[] map = new int[26];
//          Arrays.fill(map, -1);
//          while (r < n) {
//            if (map[s.charAt(r)-'a']  != -1) {
//              l = Math.max(map[s.charAt(r)-'a'] + 1, l);
//            }
//            map[s.charAt(r)-'a'] = r;
//            ans = Math.max(ans, r - l + 1);
//            r++;
//          }
//          return ans;
//        }
//
//        static int[] plusOne(int[] digits){
//          int n = digits.length;
//
//          for (int i = n - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//              digits[i]++;
//              return digits;
//            }
//
//            digits[i] = 0;
//          }
//
//          // If we reached here, all digits were 9, so we need to add a new digit.
//          int[] newnum = new int[n + 1];
//          newnum[0] = 1;
//
//          return newnum;
//
//        }
//
//  static boolean primeOrNot(int n){
//    if(n==1 || n==2)
//      return false;
//
//    for(int i=2;i<n;i++){
//      if (n%i==0)
//        return false; // not a prime
//    }
//    return true; //else prime
//
//
//  }
//
//
//    public static void main(String[] args)
//    {
//        int N = 10;
//
//        int[] arr=new int[]{9,9,9};
//        String str= "abcaxb";
//
//
//       System.out.println( primeOrNot(7) ) ;
//
//
//
//
//    }
//}
