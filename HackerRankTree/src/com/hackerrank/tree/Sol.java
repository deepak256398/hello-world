package com.hackerrank.tree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol {

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
            for(int j=height;j<N;j=j*2){
            	swap(j,arr,N-1);
            }
             inorder(arr,0);
        }
        /*for(int i=1;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }*/
        
    }
    
    static void swap(int h,int[] arr,int totalHeight){
        for(int i=h;i<=totalHeight;i++){
        	int totalElements=(int)Math.pow(2, i);
        	int toSwap=totalElements/2;
        	int sameHeightLocation=(int)Math.pow(2, i)-1;
        	for(int j=0;j<toSwap;j++){
        		tempSwap(sameHeightLocation,arr,i-h);
        		sameHeightLocation++;
        	}
        }
    
    }
    
    static void tempSwap(int loc, int[] arr,int times){
    	int temp=arr[loc];
    	arr[loc]=arr[loc+(int)Math.pow(2, times)];
    	arr[loc+(int)Math.pow(2, times)]=temp;
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