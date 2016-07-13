package squareSum;

import java.util.Random;

public class squareSum {
	
	public static void main(String[] args){
		
		Random r = new Random();
		
		for(int i=1; i<=1;i++){
			
			int myArray[] = new int[i];
			
			for(int j=0; j<i;j++){
				//randomly generate a number from [1,100]
				int randInt = r.nextInt(100)+1;
				myArray[j] = randInt;
			}
			
			int resArr[] = billify(myArray);
			
		}

	}
	
	
	public  static int[] billify(int[] x){
		int sum = 0;
		int res[] = new int[x.length+1];
		for(int k=0; k<x.length; k++){
			x[k]*=x[k];
			res[k]=x[k];
			sum+=res[k];
		}
		
		res[x.length] = sum;
		return res;
		
	}
}
