package hatered;


public class hatred {
	
	public static void main(String[] args) 
	{
		int number = 20;
		int[] array1;
		int[] array2;

		array1 = new int[number];
		array2 = new int[number];

		for(int i = 0; i < number; i++)
		{
			
			long startTime = System.nanoTime();
			fiboBaggins(10);
			long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
			//System.out.println(totalTime);
			array1[i] = (int) totalTime;

			
			long startTime2 = System.nanoTime();
			bingus(10);
			long endTime2 = System.nanoTime();
			long totalTime2 = endTime2 - startTime2;
			//System.out.println(totalTime2);
			array2[i] = (int) totalTime2;

		}
		
		for(int i = 0 ; i < number; i++)
		{
			System.out.println(array1[i]);
		}

		System.out.println();
		for(int i = 0 ; i < number; i++)
		{
			System.out.println(array2[i]);
		}

	}
	
	
	static int bingus(int iterations) 
	{
	    if (iterations <=1) 
	    {
	        return iterations;
	    }
	    return bingus(iterations - 1) + bingus(iterations - 2);
	}
	
	static int fiboBaggins(int iterations) 
	{
	    int num1 = 0;
	    int num2 = 1;
		int	num3 = 1;
		
		
	    for (int i = 0; i < iterations; i++) 
	    {
	        num1 = num2;
	        num2 = num3;
	        num3 = num1 + num2;
	    }
	    
	    return num1;
	}

}