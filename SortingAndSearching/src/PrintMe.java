public class PrintMe {

    public static void PrintMeNow(int[] array){

        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void PrintMeNow(String[] array){

        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
