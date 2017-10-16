/**
*
* 时间复杂度O N平方
* 选择最小的数放在队列前
 */
public class SelectitonSort
{
    public int[] selectitionSort(int[] A,int n)
    {
        for ( int i = 0; i < n ; i++ )
        {
            int temp = A[i];
            int count = i;
            for ( int j = i+1; j < n ; j++ )
            {
                if( temp > A[j])
                {
                    temp = A[j];
                    count = j;
                }
            }
            A[count] = A[i];
            A[i] = temp;
        }
        return A;
    }
}
