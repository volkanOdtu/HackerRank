
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionArray {
	
	static void plusMinus() {

		int[] arr = { -4 , 3 , -9 , 0  ,4  ,1  };
		
		int positiveOccurrences =0,negativeOccurrences =0,zerosOccurrences =0;
		
		for(int i = 0 ; i < arr.length ; i++ )
		{
			if(arr[i] > 0 ) positiveOccurrences++;
			if(arr[i] < 0 ) negativeOccurrences++;
			if(arr[i] == 0 ) zerosOccurrences++;			
		}
		
		DecimalFormat df = new DecimalFormat("###,###.######");
		String p = df.format( ((double) positiveOccurrences / arr.length));
		
		System.out.println( p );
		
		String n = df.format( ((double) negativeOccurrences / arr.length));
		System.out.println( n  );
		
		
		String z = df.format( ((double) zerosOccurrences / arr.length ));
		System.out.println( z  );
		
		String r = df.format( ((double) 10777777777.789666 ));
		System.out.println( r  );
		
		
    }

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

    	int diagonalFirst= 0;
    	int diagonalSecond= 0;
    	int j;
    	
    	for( int i = arr.length -1 ;i >= 0; i-- )
    	{
    		diagonalFirst += arr[i][i];
    		j = arr.length -1 - i ;
    		diagonalSecond += arr[i][j];    			
    	}    	
    	

    	return Math.abs( diagonalFirst -diagonalSecond) ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	plusMinus();
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	/*
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        System.out.println(result ); */
        
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

