/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Ravi
 */
public class LinearSearch 
{
 
    public static void main(String[] args) 
    {
        int element,size,arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The size:");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter The Sorted Array:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Element To be Searched:");
        element=sc.nextInt();
        int result=linearsearch(arr,element);
        if(result==-1)
            System.out.println("Element Not found");   
        else
            System.out.println("Element Found At Index: "+(result+1));
    }

    private static int linearsearch(int[] arr, int element) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
    
}
