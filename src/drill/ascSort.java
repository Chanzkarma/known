package drill;

public class ascSort {
	 public static void main(String[] args) {        
         
	        //Initialize array     
	        int [] arr = new int [] {1234,543,654,7685,26354,8877656,987};     
	        int temp = 0;    
	            
	        //Displaying elements of original array    
	        System.out.println("Entered Array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " "); 
	            System.out.println(" ");
	        }    
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Sorted array in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");  
	            System.out.println(" ");
	        }    
	    }    

}
