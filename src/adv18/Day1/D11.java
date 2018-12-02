package adv18.Day1;

import java.util.*;

public class D11 {

public static int part1 ( String[] input ) {
	int sum = 0;
	Integer n = 0;
	for ( String c : input ) {
		n = Integer.parseInt( c );
		sum += n;
	}

	return sum;
}

public static int part2 ( String[] input ) {
	Set<Integer> os = new HashSet<>( );
	int tw = 0;
	int sum = 0;
	Integer n;
	while ( tw == 0 ) {
		for ( String c : input ) {
			n = Integer.parseInt( c );
			sum += n;
			if ( ! os.contains( sum ) )
				os.add( sum );
			else {
				tw = sum;
				break;
			}
		}
	}
	return tw;
}

}
