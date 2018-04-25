// Driver class by Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )

/*****************************************************
 * class QQDriver
 * Driver for QQKachoo
 ******************************************************/

public class QQDriver {
    
    public static void main( String[] args ) {

	System.out.println( "-INITIATING TESTING-" );
	
	System.out.println( "Creating New Double-Ended Queue..." );
	QQKachoo<String> squashy = new QQKachoo();
	
	System.out.println( "Testing offerFirst()..." );
	squashy.offerFirst( "be" );
	squashy.offerFirst( "it" );
	System.out.println( "squashy:" );
	System.out.println( squashy );	
	
	System.out.println( "Testing offerLast()..." );
	squashy.offerLast( "like" );
	squashy.offerLast( "that" );
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
	
	System.out.println( "Testing pollLast()..." );
	System.out.println( squashy.pollLast() ); // that


	System.out.println( "-TERMINATING TESTING-" );
	
	/* ----- SQUASH ---------
	   -------- SQUAD -------- */
	
    } // end of main method

    
} // end of QQDriver class
