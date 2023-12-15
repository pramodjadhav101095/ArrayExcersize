package com.prowing.ArrayExercise;

public class ElementOfArray_AssendingOrder {

	public static void main(String[] args) {
		int[]ar = {12,23,34,45,67};
		assending(ar);

	}
    public static int[] assending(int[]ar){
    	int temp;
    	for(int i=0; i< ar.length;i++) {
    		
    		for(int j=i+1;j< ar.length;j++) {
    			
    			if(ar[i] > ar[j]) {
    				  temp = ar[i];    
                      ar[i] = ar[j];    
                      ar[j] = temp;   
    			}
    		}
    	}
    	 System.out.println();    
         
         //Displaying elements of array after sorting    
         System.out.println("Elements of array sorted in ascending order: ");  
         
         for (int i = 0; i < ar.length; i++) {     
             System.out.print(ar[i] + " "); 	
    	
    	
    }
         return ar ;
}
}