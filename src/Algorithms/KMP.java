package Algorithms;

//String Search Algorithm and String Matching Algorithm

//Patterned to be searched
//Two Phases ....preprocessing and Search Phase...


//Temporary array as PMT
//Its array of size where, for each position of i in pattern p, b[i] is defined such that 
//it takes the length of largest proper suffiex of 
public class KMP {

	
	
	
	public int[] preProcessPattern(char[] ptrn) {
    
		int i = 0, j = -1;
        int ptrnLen = ptrn.length;
        int[] b = new int[ptrnLen + 1];
 
        b[i] = j;
        while (i < ptrnLen) {
            while (j >= 0 && ptrn[i] != ptrn[j]) {
                // if there is mismatch consider next widest border
                j = b[j];
            }
            i++;
            j++;
            b[i] = j;
        }
        // print pettern, partial match table and index
        System.out
                .println("printing pattern, partial match table, and its index");
        System.out.print(" ");
        for (char c : ptrn) {
            System.out.print(c + "   ");
        }
        System.out.println(" ");
        for (int tmp : b) {
            System.out.print(tmp + "   ");
        }
        System.out.print("\n ");
        for (int l = 0; l < ptrn.length; l++) {
            System.out.print(l + "   ");
        }
        System.out.println();
        return b;
    }
	
}
