public class InsertionSort
{
    public int[] insertionSort(int[] A,int n)
    {
        for ( int i = 1 ; i < n ; i++ )
        {
            for (int j = 0 ; j < i ; j++)
            {
                if (A[i] < A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
