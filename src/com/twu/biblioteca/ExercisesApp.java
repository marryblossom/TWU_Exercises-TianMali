package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class ExercisesApp {
    public String horizontal(int n){
        String s = "";
        for (int i = 0; i <n ; i++) {
            s+="*";
        }
        return s;
    }
    public String vertical(int n){
        String s = "";
        for (int i = 0; i < n  ; i++) {
            s += "*\n";
        }
        return s;
    }
    public String triangle(int n){
        String s = "";
        for (int i=1;i<=n;i++){
            for (int j =1 ; j<=i  ; j++) {
                s += "*";
            }
            s+="\n";
        }

        return s;
    }

public String[] isoscelesTriangle(int n){
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
        s[i] = "";
        for (int j=0;j<(n-i)-1;j++){
            s[i] += " ";
        }
        for (int j=0;j<2*i+1;j++){
            s[i] += "*";
        }
    }
    return s;
}
    public String[] diamond(int n){
        String[] s = new String[2*n-1];
        for (int i = 0; i < n; i++) {
            s[i] = "";
            for (int j=0;j<(n-i)-1;j++){
                s[i] += " ";
            }
            for (int j=0;j<2*i+1;j++){
                s[i] += "*";
            }
        }
//        for (int i = n; i < 2*n-1; i++) {
//            s[i] = "";
//            for (int j=1;j< (i-n/2-1);j++){
//                s[i] += " ";
//            }
//            for (int j=0;j<n-i/2;j++){
//                s[i] += "*";
//            }
//        }
        for (int i = n; i < 2*n-1; i++) {
            s[i] = s[i-n];
        }

        return s;
    }
    public String[] diamondWithName(int n){
        String[] s = new String[2*n-1];
        for (int i = 0; i < n-1; i++) {
            s[i] = "";
            for (int j=0;j<(n-i)-1;j++){
                s[i] += " ";
            }
            for (int j=0;j<2*i+1;j++){
                s[i] += "*";
            }
        }
        s[n-1] = "Bill";
        for (int i = n; i < 2*n-1; i++) {
            s[i] = "";
            for (int j=1;j< (i-n/2-1);j++){
                s[i] += " ";
            }
            for (int j=0;j<n-i/2;j++){
                s[i] += "*";
            }
        }
        return s;
    }
    public String[] fizzBuzz(int n){
        String s[] = new String[n];
        for (int i = 0; i < n ; i++) {
            if ((i+1)%3 == 0 && (i+1)%5 == 0){
                s[i] = "FizzBuzz";
            } else  if ((i+1)%3 == 0){
                s[i] = "Fizz";
            }else  if ((i+1)%5 == 0){
                s[i] = "Buzz";
            }else {
                s[i] = i+1+"";
            }
        }
        return s;
    }

    public List<Integer> primeFactors(int number) {
        List<Integer> factorsList = new ArrayList<Integer>();
        int temp = number;
        for (int i = 2; i <= number; i++) {
            if (!isPrime(i)) {
                continue;
            }
            while (true) {
                if (temp % i == 0) {
                    temp = temp / i;
                    factorsList.add(i);
                } else {
                    break;
                }
            }
        }
        return factorsList;
    }

    private boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n; i++) {
            if (n%i == 0) {
                break;
            }
        }
        if (i >= n) {
            return true;
        }else {
            return false;
        }
    }


//public static void main(String[] args){
//    ExercisesApp app = new ExercisesApp();
//    String[] s = app.fizzBuzz(15);
//    for (int i = 0; i <s.length ; i++) {
//        System.out.println(s[i]);
//    }
//
//}

}
