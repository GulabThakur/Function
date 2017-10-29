package com.bridgeit.Utility;


public class Utility { 
	 public <T> void toDArray(T[][] array)
	    {
	       for(int i=0;i<array.length;i++) 
	       {
	    	   for(int j=0;j<array.length;j++) 
	    	   {
	    		   System.out.print(array[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
	       System.out.println();
	    }
     public void windChill(double temp,double speed) 
     {
    	 double windChill = 35.74 + (0.6215 * temp) ; 
    		windChill=windChill+( 0.4275 * temp - 35.75)*Math.pow(speed, 0.16);

         System.out.println("The wind chill index is " + windChill);
     }
     public void quadricEqun(int a,int b,int c) 
     {
    	 double delta=b*b;
    		delta=delta-4*a*c;
    		//System.out.println(delta);
    		double value= delta;
    		if(delta<0) 
    		{
    			System.out.println("There are no real roots");
    			return;
    		}
    		
    		double root1,root2;
    		delta=Math.sqrt(value);
    		root1=-b+delta;
    		root1=root1/(2*a);
    		root2=-b-delta;
    		root2=root2/(2*a);
    		
    		    if(delta==0)
    			System.out.println("Root1=1"
    					+ ""+root1);
    	     	else
    	     	System.out.println("Root of X :"+root1+" and Root of X :"+root2);
           
     }
     /**
     * @param str
     * @param l
     * @param r
     */
     String str1 = null;
    
    public  void perm(String str,int l,int r)
     {
    	Utility utility=new Utility();
      if(l==r)
       { 
    	 
	       if(!str1.equals(str)) {
	       
		    System.out.println(str);
		  
	        }
    	
       }
      else
      {
    	  str1=str;
        for(int i=0;i<=r;i++)
	     {  
        	str=utility.swap(str,l,i);
	        perm(str,(l+1),r);
	       str=utility.swap(str,l,i);
	        
	     }
      }
      
     } 
     public static String swap(String str1,int i,int j)
     {
                char temp;
		char[] charArray = str1.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
     }
} 
