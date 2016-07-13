package squareSum;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import org.mockito.Mockito;

public class testSquareSum {
	//Test the property based function
	/*
	 * Properties to be tested
	 * 1.  Output array size greater than input array by one
       2.  Final array value larger than any others
       3.  Every non-final value square of input
           Final value always equal to sum of previous
           etc.
       4.  Every non-final value's square root should be an integer
           which 1<=x<=100
	 */
	
	// Test the sum of the array values should larger than every single previous
	@Test
	public void testSumIsLargest(){
		boolean flag = true;
	    Random r = new Random();
		for(int i=1; i<=100;i++){
			//generate random array size
			int randSize = r.nextInt(100)+1;
			
			int myArray[] = new int[randSize];
			
			for(int j=0; j<randSize;j++){
				//randomly generate a number from [1,100]
				int randInt = r.nextInt(100)+1;
				 myArray[j] = randInt;
			}
			
		   int resArr[] = Mockito.mock(squareSum.class).billify(myArray);
			 
		   for(int k=0; k<resArr.length-1;k++){
				if(resArr[myArray.length]<resArr[k]) 
				    flag=false;
		   }  
			 assertEquals(flag,true);
	   }	
	}
  
	// Test the result array size is greater than input array size by one
	@Test
	public void testOutputArrSize(){
		 Random r = new Random();
		 
		 for(int i=1; i<=100;i++){
			 //generate random array size
			 int randSize = r.nextInt(100)+1;
			
			 int myArray[] = new int[randSize];
			 for(int j=0; j<randSize;j++){
				 //randomly generate a number from [1,100]
				 int randInt = r.nextInt(100)+1;
				 myArray[j] = randInt;
			 }
		
			 int res[] = Mockito.mock(squareSum.class).billify(myArray);
		
			 assertEquals(res.length, myArray.length+1);
		}
	}
	
	// Test the summation of previous numbers is correct. Only for the first three elements
	@Test
	public void testSummation(){
		
	    Random r = new Random();
	    
	    int sumExpected=0;
	   for(int i=1; i<=100;i++){
	    	
	    	//generate random array size
	    	int randSize = r.nextInt(100)+1;
	    	 
	    	int myArray[] = new int[randSize];
	    	for(int j=0; j<3;j++){
	    		//randomly generate a number from [1,100]
	    		int randInt = r.nextInt(100)+1;
	    		myArray[j] = randInt;	   
	    		sumExpected+=myArray[j]*myArray[j];		
	    	}
	    	System.out.println(sumExpected);
	    	 	    
	    	int result[] = Mockito.mock(squareSum.class).billify(myArray);
	    	
	    	assertEquals(result[3],sumExpected);
	    }
	}
	
	//Every non-final value's square root should be an integer
    // which 1<=x<=100
	@Test
	public void testSqrtOfOutputArray(){
		
		boolean flag = true;
        Random r = new Random();
        
        for(int i=1; i<=100;i++){
	        int randSize = r.nextInt(100)+1;
			
		    int myArray[] = new int[randSize];
	         
			
	         for(int k=0; k<randSize;k++){
	        	 int randInt = r.nextInt(100)+1;
	        	 myArray[k] = randInt;
	         }
	         int res[] = Mockito.mock(squareSum.class).billify(myArray);
	         
	         for(int j=0; j<randSize; j++){
	        	 int num= (int)Math.sqrt(res[j]);
	        	 if(num <1 ||num>100)
	        		 flag = false;
	         }
	         assertEquals(flag,true);
     }
	}
}
