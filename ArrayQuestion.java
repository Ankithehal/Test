import java.util.Scanner;  // Import the Scanner class
import java.util.Arrays; // Import the Array class
public class ArrayQuestion {
 
    public static void main(String[] args) {
    int numberOfElements;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	numberOfElements=sc.nextInt();  
	//creates an array in the memory of length 10  
	int[] array = new int[numberOfElements];  
	System.out.println("Enter the elements of the array: ");  
	for(int arrayIndex = 0; arrayIndex < numberOfElements; arrayIndex ++) 
	{	
		{
		
		//reading array elements from the user   
		array[arrayIndex]=sc.nextInt();   
		}
		
		
	}
	// checking the length of an array
	if ( array.length == 1)
		{
			System.out.println("minimun cost required:" + array[0]);
		}
		else {
		Arrays.sort(array);
			System.out.println(array[1] - array[0]);
			System.out.println("minimun cost required:" + array[0]);
			// Remove the element
			array = removeTheElement(array, array[1]);
		}
		
		
		
	}

		public static int[] removeTheElement(int[] array,int index)
    {
  
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (array == null || index >= array.length) 
		{
            return array;
        }
  
        // Create another array of size one less
        int[] anotherArray = new int[array.length - 1];
  
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < array.length; i++) {
  
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
  
            // if the index is not
            // the removal element index
            anotherArray[k++] = array[i];
        }
  
        // return the resultant array
        return anotherArray;
    }
			
	 
}
	


	
