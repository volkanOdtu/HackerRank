import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SolutionTriplets {
	
	static long aVeryBigSum(long[] ar) {
		long result = 0;
		
		for( int i = 0 ;i <ar.length ;i++ )
			result = result +ar[i];
		
		return result;
		
    }
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
	{

		List<Integer> result = new ArrayList<Integer>();
		
		int sumAlice = 0 ,sumBob = 0 ;  
				
		for( int i =0 ; i < a.size(); i++)
		{
			if(a.get(i) > b.get(i))
				sumAlice++;
			else if( a.get(i) < b.get(i) )
				sumBob++;
		}
		
		result.add(sumAlice);
		result.add(sumBob);
		
		return result;
		
    }

	public static void main(String[] args) throws IOException {		
		//String fileOutputPath = "C:\\Hackerrank\\output";
		
		Scanner in = new Scanner(System.in);  
		int arrLength = Integer.valueOf( in.nextLine());  
		
		String numbers = in.nextLine();  
		
		/*
		long[] ar = new long[arrLength];
		
		String numberArr[] = numbers.split(" ");
		
		for(int i = 0 ; i< ar.length ;i++ )
		{
			ar[i] = Long.valueOf(numberArr[i]);
		}
		
		long result = aVeryBigSum(ar);
		
		System.out.println(result); */
		
		/*
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());*/
		
		
		
		/*
        List<Integer> a = new ArrayList<Integer>();
        a.add(17);
        a.add(28);
        a.add(30);
        
        List<Integer> b = new ArrayList<Integer>();
        b.add(99);
        b.add(16);
        b.add(8); 
                
        List<Integer> result = compareTriplets(a, b); */

        
        
        //bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" "))+ "\n");

        //bufferedReader.close();
        //bufferedWriter.close();

	}

}
