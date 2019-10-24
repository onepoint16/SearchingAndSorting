public class ShellSort
{

    public static int[] NumberSwap1(int[] numbersToSort1)
    {
        int n = numbersToSort1.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = numbersToSort1[i];
                int j;
                for (j = i; j >= gap && numbersToSort1[j - gap] > temp; j -= gap)
                    numbersToSort1[j] = numbersToSort1[j - gap];
                numbersToSort1[j] = temp;
            }
        }
        return numbersToSort1;
    }

    public static int[] NumberSwap2(int[] numbersToSort2)
    {
        int n = numbersToSort2.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = numbersToSort2[i];
                int j;
                for (j = i; j >= gap && numbersToSort2[j - gap] > temp; j -= gap)
                    numbersToSort2[j] = numbersToSort2[j - gap];
                numbersToSort2[j] = temp;
            }
        }
        return numbersToSort2;
    }
}
