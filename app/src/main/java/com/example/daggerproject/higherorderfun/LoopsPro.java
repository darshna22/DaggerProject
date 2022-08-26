package com.example.daggerproject.higherorderfun;

public class LoopsPro {
    public static void main(String args[]){
        int n=10;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j=(j+i)){
                System.out.print("hello "+j);
            }
            System.out.println("");
        }
    }
}
