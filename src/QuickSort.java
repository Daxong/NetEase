public class QuickSort
{
    public static void quickSort(int[] A ,int low , int high)
    {
        if (null == A || A.length < 2)
            return ;
        if( low < high)
        {
            int storeIndex = partition(A,low,high);
            quickSort(A,low,storeIndex-1);
            quickSort(A,storeIndex+1,high);
        }


    }

    private static int partition(int[] A ,int low, int high)
    {
        int pivot = A[low];

        while (low<high)
        {
            while(low < high && A[high] >= pivot)
            {
                high--;//
            }
            A[low] = A[high];
            while(low < high && A[low] <= pivot)
            {
                low++;
            }
            A[high] = A[low];
        }

        A[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] A = {1,23,3,2,54,7};
        quickSort(A,0,5);
        for (int i : A)
        {
            System.out.println(i);
        }

    }
}
