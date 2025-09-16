// import java.util.Arrays;
// public class arrayEx {
//     public static void main(String[] args) {
//         char[] vowels={'a','e', 'i' ,'o','u'};
//         vowels[2]='x';
//         // char[] vowels = new char[5];
//         // vowels[0] = 'a';
//         // vowels[1] = 'e';
//         // vowels[2] = 'i';
//         // vowels[3] = 'o';
//         // vowels[4] = 'u';
//         // System.out.println(Arrays.toString(vowels));
//         System.out.println(vowels);
//          System.out.println(vowels.length);
//     }
// }

// EX-2:
import java.util.Arrays;
public class arrayEx {
    public static void main(String[] args) {
        char[] vowels={'u','o', 'e' ,'i','a'};
        // int startIndex=1;
        // int endIndex=4;
        // Arrays.sort(vowels,startIndex,endIndex);
      Arrays.sort(vowels);
       int startIndex=1;
        int endIndex=4;
      char key='o';
      int found= Arrays.binarySearch(vowels,startIndex,endIndex,key);
System.out.println(Arrays.toString(vowels));
System.out.println(found);
    }}