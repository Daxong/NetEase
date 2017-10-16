public class BubbleSort
{
    public int[] bubbleSort(int[] A , int n )
    {
        for (int i = 0; i < n ; i++)
        {
            for (int j = i+1 ; j < n ; j++)
            {
                if (A[i] > A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A ;
    }
}
