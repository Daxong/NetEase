public class QuciklySort
{
    public static void main(String[] args) {

    }

    public static int[] quicklySort(int[] A, int n)
    {
       if (A == null || n<2)
           return null;
       int begin = 0;
       int end = n;

       return  sort(A,begin,end);
    }

    public static int[] sort(int[] A, int begin, int end)
    {
        if (begin > end)
            return null;
        int storeIndex = parttiton(A,begin,end);
        sort(A, begin,storeIndex-1);
        sort(A,storeIndex+1,end);
        return A;
    }

    public static int parttiton(int[] A , int begin , int end)
    {
        //随机选取基准
        if (end < 2 )
            return 0;
        //随机选择一个数
        int shuffle = (int)(Math.random()*(end));
        if (shuffle != end)
        {
            A=swap(A,end,shuffle);
        }

        int pivot = A[end];
        int storeIndex = begin;
        for (int i = begin;i < end ; i++)
        {
            if (A[i] < pivot)
            {
                A=swap(A,i,storeIndex);
                storeIndex++;
            }
        }
        swap(A,storeIndex,end);//将基准数放在合适的位置

        return storeIndex;
    }

    public static  int[] swap(int[] A , int change, int bechange)
    {
        int temp = A[change];
        A[change] = A[bechange];
        A[bechange] = temp;
        return A;
    }
}
