public class BubbleSort
{
    public static String[] NameSort(String[] namesToSort){

        boolean swapMade = true;

        int length = namesToSort.length -1;

        int pass = 0;

        while (swapMade)
        {
            swapMade = false;

            System.out.println("Pass:\t" + pass);

            for (int i = 0; i < length; i++){

                String currentName = namesToSort[i];

                System.out.print("Comparing index " + i + " Which is:\t" + currentName );

                String compareName = namesToSort[i+1];

                System.out.println(" with index " + (i + 1) + " Which is:\t" + compareName);

                if (namesToSort[i].compareToIgnoreCase(compareName)>0){

                    namesToSort[i] = compareName;

                    namesToSort[i+1] = currentName;

                    System.out.println("Swap was made between\t" + currentName + "\nand\t" + compareName  );

                    swapMade = true;
                }
            }

            pass += 1;
        }
        return namesToSort;
    }

    public static int[] NumbersSort(int[] numbersToSort){

        int length = numbersToSort.length - 1;

        boolean swapMade = true;

        int pass = 0;

        while(swapMade){

            swapMade = false;

            System.out.println("pass:\t" + pass);

            for(int i = 0; i < length; i++ ){

                System.out.print("Comparing index " + i + " Which is:\t" + numbersToSort[i] );

                System.out.println(" with index " + (i + 1) + " Which is:\t" + numbersToSort[i+1]);

                if(numbersToSort[i] > numbersToSort[i+1]){

                    int numSwap = numbersToSort[i];

                    numbersToSort[i] = numbersToSort[i+1];

                    numbersToSort[i+1] = numSwap;

                    swapMade = true;

                    System.out.println("Swap was made between\t" + numbersToSort[i] + "\nand\t" + numbersToSort[i+1]);
                }
            }

            pass += 1;
        }
        return numbersToSort;
    }

}



