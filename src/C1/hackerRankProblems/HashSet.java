package C1.hackerRankProblems;

import java.util.Scanner;
public class HashSet<S> {


    public HashSet(int t) {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i<t; i++) {
            pair_left [i] = s.next();
            pair_right [i] = s.next();
        }
        s.close();

//        HashSet <String> hashSet = new HashSet<String>(t);
////        for (int i=0; i<t; i++) {
////            hashSet.add (pair_left[i] +" " + pair_right[i]);
////            System.out.println(hashSet.size());
//        }
    }
}
