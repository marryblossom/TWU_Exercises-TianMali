package com.twu.biblioteca;


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
    public static void main(String[] args){
        ExercisesApp a = new ExercisesApp();
        System.out.println(a.horizontal(3));
        System.out.println(a.triangle(3));
    }

}
