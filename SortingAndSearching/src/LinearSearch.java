public class LinearSearch
{

    public static void SearchChecker(int n)
    {

        if(n == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + n);

    }


    public static void Search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x) {
                SearchChecker(i);
            }
        }
    }

    public static void Search(String arr[], String x)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i].equals(x)) {
                SearchChecker(i);
            }
        }
    }
}
