package com.hackerrank.tree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr_size=1+2*N;
        int[] arr=new int[arr_size];
        arr[0]=1;
        for(int i=1;i<arr_size;i++){
            try{
            arr[i]=in.nextInt();
            }catch(Exception e){
                System.out.println("Error is on line: "+i);
            }
        }
        int testCase=in.nextInt();
        int height;
        for(int i=0;i<testCase;i++){
            height=in.nextInt();
            for(int j=height;j<N;j=j*2)
            swap((int)Math.pow(2,j)-1,arr);
             inorder(arr,0);
        }
        /*for(int i=1;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }*/
        
    }
    
    static void swap(int h,int[] arr){
        try{
        int temp=arr[h];
        arr[h]=arr[h+1];
        arr[h+1]=temp;
        System.out.println("For height h:"+h);
        int arr_size=arr.length;
        for(int i=1;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }
        
        if(arr[h]!=-1 && 2*h+1<arr.length)
        swap(2*h+1,arr);
        if(arr[(h+1)]!=-1 && 2*h+2<arr.length)
        swap(2*h+2,arr);
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
    static void inorder(int[] arr,int k){
        try{
        int l=arr.length;
        if(k*2+1 <l){
            if(arr[k*2+1]!=-1){
                inorder(arr,k*2+1);
            }
        }
        System.out.print(arr[k]+" ");
        if(k*2+2 <=l){
            if(arr[k*2+2]!=-1){
                inorder(arr,k*2+2);
            }
        }
        
        }catch(Exception e){
            
        }
    }
}