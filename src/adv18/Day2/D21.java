package adv18.Day2;

import java.util.*;

public class D21 {
	public static void Day2( String[] input ) {
		System.out.println( "Part 1 : " + part1( input ) );
		System.out.println( "Part 2 : " + part2( input ) );
	}

	static int part1( String[] input ) {
		int tw = 0, tr = 0;
		for( String c : input ) {
			Map<Character, Integer> co = new HashMap<Character, Integer>( );
			for( int i = 0; i < c.length( ); i++ ) {
				char at = c.charAt( i );
				if( ! co.containsKey( at ) )
					co.put( at, 1 );
				else
					co.put( at, co.get( at ) + 1 );
			}
			if( co.values( ).contains( 2 ) )
				tw++;
			if( co.values( ).contains( 3 ) )
				tr++;
		}
		return tw * tr;
	}

	static String part2( String[] input ) {
		int m = - 3;
		String o = " ";
		int split = - 5;
		for( String c : input ) {
			for( String d : input ) {
				m = 1;
				if( d.length( ) == c.length( ) ) {
					for( int i = 0; i < c.length( ); i++ ) {
						if( c.charAt( i ) != d.charAt( i ) ) {
							m--;
							split = i;
						}
					}
					if( m == 0 )
						break;
				}

			}
			if( m == 0 ) {
				StringBuilder gg = new StringBuilder( c );
				gg.deleteCharAt( split );
				o = gg.toString( );
				break;
			}
		}
		return o;
	}
}
