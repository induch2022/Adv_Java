package src;

public class ArrayOfArrayExmp {
    public static void main(String[] args) {
        int[][] arrays = new int[3][]; 
        
        
         
        arrays[0] = new int[] {5, 7, 6, 4,3,5,6,7,8,9,0};
        arrays[1] = new int[] {1, 3, 1, 8, 6,1,1,1,1,1,1};
        arrays[2] = new int[] {9, 2, 3, 5,2,2,2,2,22,3};     
         
        for(int[] arr: arrays) {
            for(int n: arr) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        int y=0;
        int[] array = new int[y];

                int[] array1 = {5, 7, 6, 4,23,24,25};
                int[] array2 = {1, 3, 1, 8,32,33,34};
                int[] array3 = {9, 2, 3, 5,42,42,433};
                 
                //array of arrays
                int[][] arraysTest = {array1, array2, array3};
                 
                for(int index_1 = 0; index_1 < arraysTest.length; index_1++) {
                    for(int index_2 = 0; index_2 < arraysTest[index_1].length; index_2++) {
                        System.out.print(arraysTest[index_1][index_2]+" ");
                    }
                    System.out.println();
                }

    }
}