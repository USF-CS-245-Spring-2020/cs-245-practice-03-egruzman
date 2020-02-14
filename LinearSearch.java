/**
* Linear Search
* @author Eli Gruzman
* 
*/

public class LinearSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		int a = arr.length;

		for (int i = 0; i < a; i++)
		{
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
}