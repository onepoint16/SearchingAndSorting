public class BinarySearch
{

    public static void Search(int[] arr, int l, int r, int x)
    {
        if (r >= 1)
        {
            int mid = ((l + r) / 2);

            if (arr[mid] == x){
                System.out.println(mid);
            }
            else if(arr[mid] > x){
                Search(arr, 1, mid -1, x);
            }
            else if(arr[mid] < x){
                Search(arr, mid + 1, r, x);
            }
            else{
                System.out.println("The item is not there");
            }
        }
    }

    public static void Search(String[] arr, int l, int r, String x)
    {
        if (r >= 1)
        {
            int mid = ((l + r) / 2);

            if (arr[mid].equals(x)){
                System.out.println(mid);
            }
            else if(arr[mid].compareToIgnoreCase(x)>0){
                Search(arr, 1, mid -1, x);
            }
            else if(arr[mid].compareToIgnoreCase(x)<0){
                Search(arr, mid + 1, r, x);
            }
            else{
                System.out.println("The item is not there");
            }
        }
    }
}
