package com.bridgeit.Programs;

import java.lang.*;
import java.util.Scanner;

import com.bridgeit.Utility.Utility; 
class Permutation
{
     public static void main(String[] args)
     {
       System.out.println("Program Started");
       Utility utility=new Utility();
       Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter the name :");
       String str=sc.next();
       int n=str.length();
       utility.perm(str,0,n-1);
       System.out.println("using itrater .....");
       
       Permutation obj=new Permutation(str);
       obj.permute();
       System.out.println("Program Ended");
     }
     private char[] S; 
	    private int count;
	    public Permutation(String Word)
	    { 
	        S=removeInvalid(Word).toCharArray();
	        bubbleSort();
	    }
	    
	    private boolean permuteNext()
	    {
	        int i,j;
	        i=S.length-2; 
	        while(i>=0 && S[i]>S[i+1])
	            i--;
	        if(i<0)
	            return false;
	        j=S.length-1; 
	        while((int)S[j]<(int)S[i])
	            j--;
	        char temp=S[i]; 
	        S[i]=S[j];
	        S[j]=temp;
	        int f=i+1,b=S.length-1;
	        while(f<b){
	            temp=S[f];
	            S[f++]=S[b];
	            S[b--]=temp;
	        }
	        return true;
	    }
	    
	    public void permute(){
	        System.out.println(S); 
	        count++; 
	        while(permuteNext()){ 
	            System.out.println(S);
	            count++;
	        }
	        System.out.println("\nNo. of Permutations : "+count);
	    }
	    
	    private static String removeInvalid(String s){
	        String output="";
	        for(int i=0;i<s.length();i++){
	            if(!Character.isWhitespace(s.charAt(i))&&(output==""||output.indexOf(s.charAt(i))<0))
	                output+=s.charAt(i);
	        }
	        return output;
	    }
	    
	    public void bubbleSort()
	    {
	        for(int i=S.length-1;i>0;i--){ 
	            for(int j=0;j<i;j++){       
	                if(S[j]>S[j+1])
	                {   
	                    char temp=S[j];    S[j]=S[j+1];    S[j+1]=temp; 
	                }
	            } 
	        } 
	    }
	    
    
}
