// Driver by Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )

/*****************************************************
 * class DequeTester
 * Driver for QQKachoo
 ******************************************************/

public class DequeTester {
    
    public static void main( String[] args ) {

	System.out.println( "-INITIATING TESTING-" );
	
	System.out.println( "Creating New Double-Ended Queue..." );
	QQKachoo<String> squashy = new QQKachoo();
	
	System.out.println( "Testing addFirst()..." );
	squashy.addFirst( "be" );
	squashy.addFirst( "it" );
	System.out.println( "squashy:" );
	System.out.println( squashy );	
	
	System.out.println( "Testing addLast()..." );
	squashy.addLast( "like" );
	squashy.addLast( "that" );
	System.out.println( "squashy:" );
	System.out.println( squashy );

	System.out.println( "Testing peekFirst()..." );
	System.out.println( squashy.peekFirst() ); // it

	System.out.println( "Testing peekLast()..." );
	System.out.println( squashy.peekLast() ); // that
	
	System.out.println( "Testing pollFirst()..." );
	System.out.println( squashy.pollFirst() ); // it
	System.out.println( squashy.pollFirst() ); // be
	System.out.println( squashy.pollFirst() ); // like
	
	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // false
	
	System.out.println( "Testing pollLast()..." );
	System.out.println( squashy.pollLast() ); // that

	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // true

	System.out.println( "-TERMINATING TESTING-" );
	
	/* ----- SQUASH ---------
	   -------- SQUAD -------- */
	
    } // end of main method

    
} // end of DequeTester class
