package com.company;

public class Main {

    public static void main(String[] args) {
	   int n=121;
       int temp=n;
       int rev=0,rem;
       while(temp>0){
           rem=temp%10;
           rev=rev*10+rem;
           temp=temp/10;
       }
       if(rev==n){
           System.out.println(121+" is a palindrome number");
       }
       else{
           System.out.println(121+" is Not a palindrome number");
       }
    }
}
