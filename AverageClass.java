
public class AverageClass {
   
	public static void main(String[] args) 
	{
		int[] array = new int[] {26,28,20,55,66,16,100};
		int sum =0;
		for(int i=0;i<array.length;i++)
		{
            sum =sum+array[i];
	    }
		
		float f = sum/array.length;
		System.out.println("Avearge of given array  is :"+f);
		
	}

	

}
