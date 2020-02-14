/**
* Selection Sort
* @author Eli Gruzman
* 
*/

public class SelectionSort implements Practice03Sort
{
	public void sort(int [] arr)
	{
        int a = arr.length; 
        int temp = 0;
  
        for (int i = 0; i < a-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < a; j++)
            {
                if (arr[j] < arr[min]) 
                    min = j; 
            }
            temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp;
		}
	}
}