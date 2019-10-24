public class SelectionSort
{

    public static int[] numberSort1(int[] numberSwap1)
    {
        int n = numberSwap1.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numberSwap1[j] < numberSwap1[min_idx])
                    min_idx = j;
            int temp = numberSwap1[min_idx];
            numberSwap1[min_idx] = numberSwap1[i];
            numberSwap1[i] = temp;
        }
        return numberSwap1;
    }

    public static int[] numberSort2(int[] numberSwap2)
    {
        int n = numberSwap2.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numberSwap2[j] < numberSwap2[min_idx])
                    min_idx = j;
            int temp = numberSwap2[min_idx];
            numberSwap2[min_idx] = numberSwap2[i];
            numberSwap2[i] = temp;
        }
        return numberSwap2;
    }
}
