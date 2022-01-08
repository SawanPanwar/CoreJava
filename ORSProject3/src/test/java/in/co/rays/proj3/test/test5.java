package in.co.rays.proj3.test;

import java.util.ArrayList;

public class test5 {

	 static boolean PowerOfTwo(int n)
	    {
	        if (n == 0)
	            return false;
	         
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	    }
	 
	   
	    public static void main(String args[])
	    {
	        if (PowerOfTwo(26))
	            System.out.println("True");
	        else
	            System.out.println("False");
	 
	        if (PowerOfTwo(256))
	            System.out.println("True");
	        else
	            System.out.println("False");
	    }
	}

