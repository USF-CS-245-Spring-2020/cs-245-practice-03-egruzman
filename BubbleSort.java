/**
* Bubble Sort
* @author Eli Gruzman
* 
*/

public class BubbleSort implements Practice03Sort
{
	public void sort(int [] arr)
	{
        int a = arr.length; 
        int temp = 0;

        for (int i = 0; i < a-1; i++) 
        {
            for (int j = 0; j < a-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                { 
                    temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
			}
        }
	}
}