import java.util.*;

/*
Bob is a guy who likes arrays.
An array is called beautiful if it contains one number more than once in array.
An array is called non beautiful if it contains each number only once in array.
You are given an integer n which represents array size,
n integers represent array elements i.e A[i]
Your task is to tell that number by removing one occurence of that number your array will be non beautiful.
It is guaranteed that given array will be beautiful.
 */

public class F12_Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // reading array size
        int n = sc.nextInt();
        int[] A= new int[n];

        // reading array elements
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        
        // creating a hashset to store unique elements
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(A[i]);
        }

        // finding duplicate element
        int duplicate = 0;
        for(int i=0;i<n;i++){
            if(hs.contains(A[i])){
                hs.remove(A[i]);
            }
            else{
                duplicate = A[i];
                break;
            }
        }

        // printing duplicate element
        System.out.println(duplicate);
    }
}