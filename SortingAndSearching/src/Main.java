public class Main {

    public static void main(String[] args)
    {
        //***********************************************
        System.out.println("Bubble Sort Name Sort:");

        String[] BubbleNamesToSort = new String[]{"Brian", "Dona" ,	"Anna",	"Tom",
                "Ian",	"Bob",	"Guy",	"Iona",
                "Jack",	"Jim",	"Joe",	"Mark",	"Nadia"};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(BubbleNamesToSort);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NameSort(BubbleNamesToSort));

        //***********************************************

        System.out.println("Bubble Sort Number Sort:");

        int[] BubbleNumbersToSort = new int[]{100, 45, 20, 97, 67, 85, 15, 32, 7, 99, 74, 28, 82};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(BubbleNumbersToSort);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(BubbleNumbersToSort));

        //***********************************************

        System.out.println("Insertion Sort Number Sort 1:");

        int[] InsertionNumbersToSort1 = new int[]{25,19,11,80,1,45,60,24,82,12,30,20,76,34,10,47};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(InsertionNumbersToSort1);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(InsertionNumbersToSort1));

        //***********************************************

        System.out.println("Insertion Sort Number Sort 2:");

        int[] InsertionNumbersToSort2 = new int[]{45,36,1,87,57,62,18,17,19,7,10,32,40,30,58,60};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(InsertionNumbersToSort2);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(InsertionNumbersToSort2));

        //***********************************************

        System.out.println("Shell Sort Number Sort 1:");

        int[] ShellNumbersToSort1 = new int[]{25,19,11,80,1,45,60,24,82,12,30,20,76,34,10,47};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(ShellNumbersToSort1);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(ShellNumbersToSort1));

        //***********************************************

        System.out.println("Shell Sort Number Sort 2:");

        int[] ShellNumbersToSort2 = new int[]{45,36,1,87,57,62,18,17,19,7,10,32,40,30,58,60};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(ShellNumbersToSort2);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(ShellNumbersToSort2));

        //***********************************************

        System.out.println("Selection Sort Number Swap 1:");

        int[] SelectionNumberSwap1 = new int[]{25,19,11,80,1,45,60,24,82,12,30,20,76,34,10,47};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(SelectionNumberSwap1);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(SelectionNumberSwap1));

        //***********************************************

        System.out.println("Selection Sort Number Swap 2:");

        int[] SelectionNumberSwap2 = new int[]{45,36,1,87,57,62,18,17,19,7,10,32,40,30,58,60};

        System.out.println("Before sorting: ");

        PrintMe.PrintMeNow(SelectionNumberSwap2);

        System.out.println("After Sorting");

        PrintMe.PrintMeNow(BubbleSort.NumbersSort(SelectionNumberSwap2));

        //***********************************************

        System.out.println("Linear Search to display the index of a particular number or word:");

        int[] LinearSearchNum = new int[]{12,13,14,15,16,17,18,19,20};

        System.out.println("Full Array ");

        PrintMe.PrintMeNow(LinearSearchNum);

        System.out.println("What index is number 13 which should be 1");

        LinearSearch.Search(LinearSearchNum, 13);

        System.out.println("Now to find a name in an array");

        String[] LinearSearchNames = new String[]{"Brian", "Dona" ,	"Anna",	"Tom",
                "Ian",	"Bob",	"Guy",	"Iona",
                "Jack",	"Jim",	"Joe",	"Mark",	"Nadia"};

        System.out.println("Full Array ");

        PrintMe.PrintMeNow(LinearSearchNames);

        System.out.println("Lets find the position os Guy which should be 6 ");

        LinearSearch.Search(LinearSearchNames, "Guy");

        //*****************************************************

        System.out.println("Binary Search to display the index of a particular number or word:");

        int[] BinarySearchNum = new int[]{20,21,22,23,24,25,26,27,28,29,30};

        System.out.println("Full Array ");

        PrintMe.PrintMeNow(BinarySearchNum);

        System.out.println("What index is number 23 which should be 3");

        // you will have to send the array, 1, arrayLength -1, the number your searching for

        BinarySearch.Search(BinarySearchNum, 0, BinarySearchNum.length -1, 23 );

        System.out.println("Now to find a name in an array");

        String[] NamesPreSort = new String[]{"Brian", "Dona" ,	"Anna",	"Tom",
                "Ian",	"Bob",	"Guy",	"Iona",
                "Jack",	"Jim",	"Joe",	"Mark",	"Nadia"};

        String[] SortedNamesForSearch = BubbleSort.NameSort(NamesPreSort);

        System.out.println("Full Array ");

        PrintMe.PrintMeNow(SortedNamesForSearch);

        System.out.println("Lets find the position of Guy");

        BinarySearch.Search(SortedNamesForSearch, 0, SortedNamesForSearch.length -1, "Guy");

        //*****************************************************
    }

}
