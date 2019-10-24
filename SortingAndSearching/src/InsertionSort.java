public class InsertionSort
{

    public static int[] NumberSort1(int[] numbersToSort1)
    {

        int n = numbersToSort1.length;

        int pass = 0;

        for (int i = 1; i < n; ++i)
        {
            System.out.println("Pass:\t" + pass);

            int key = numbersToSort1[i];

            int j = i - 1;

            System.out.println("Comparing index: " + i + " which is\t" + key);

            System.out.println("With index: " + (i+1) + " which is\t" + numbersToSort1[i+1]);

            while (j >= 0 && numbersToSort1[j] > key)
            {
                System.out.println("Swapped\t" + numbersToSort1[j+1] +" With\t" + numbersToSort1[j]);
                numbersToSort1[j + 1] = numbersToSort1[j];
                j = j - 1;
            }
            System.out.println(numbersToSort1[j+1] + " has now become " + key);
            numbersToSort1[j + 1] = key;
        }
        return numbersToSort1;
    }

    public static int[] NumberToSort2(int[] numbersToSort2)
    {

        int n = numbersToSort2.length;

        for (int i = 1; i < n; ++i)
        {
            int key = numbersToSort2[i];

            int j = i - 1;

            int printNo = i;

            while (j >= 0 && numbersToSort2[j] > key)
            {
                numbersToSort2[j + 1] = numbersToSort2[j];
                j = j - 1;
            }

            numbersToSort2[j + 1] = key;
        }
        return numbersToSort2;
    }

}
