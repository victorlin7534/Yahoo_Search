/* 
   Team Yahoo Search - Bing Li, Lily Yan
   APCS2 pd1
   HW23 - Give and Take
   2018-03-22
 */

/*****************************************************
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 *****************************************************/

public class LList implements List //your List interface must be in same dir
{ 

    //instance vars
    private LLNode _head;
    private int _size;

    // constructor -- initializes instance vars
    public LList( )
    {
	_head = null; //at birth, a list has no elements
	_size = 0;
    }


    //--------------v  List interface methods  v--------------
    
    public boolean add( String newVal )
    {
	LLNode tmp = new LLNode( newVal, _head );
	_head = tmp;
	_size++;
	return true;
    }

    public void add(int i, String s) {
	if (i < 0 || i >= _size) throw new IndexOutOfBoundsException();

	//adding at index i means inserting a node with cargo s between nodes at indices i-1 and i

	//make node with s as cargo, and make it point to node at index i:
	LLNode input = new LLNode(s, getNode(i));

	//make node at index i-1 point to node that was just inserted: 
	getNode(i-1).setNext(input);

	//increase size:
	_size++;
    }

    public String remove(int i) {	
	if (i < 0 || i >= _size) throw new IndexOutOfBoundsException();

	//get cargo of node to be removed:
	String retVal = getNode(i).getCargo();

	//removing the node at index i means making node at index i-1 point to node at index i+1 instead of index i
	
        //make node at index i-1 point to node at index i+1
	getNode(i-1).setNext(getNode(i+1));
	
	//decrease size:
	_size--;

	
	return retVal;
    }

    
    public String get( int index )
    {
	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	String retVal;
	LLNode tmp = _head; //create alias to head

	//walk to desired node
	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	//check target node's cargo hold
	retVal = tmp.getCargo();
	return retVal;
    }


    public String set( int index, String newVal )
    {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	LLNode tmp = _head; //create alias to head

	//walk to desired node
	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	//store target node's cargo
	String oldVal = tmp.getCargo();

	//modify target node's cargo
	tmp.setCargo( newVal );

	return oldVal;
    }


    //return number of nodes in list
    public int size() { return _size; }
    
    //--------------^  List interface methods  ^--------------


    // override inherited toString
    public String toString()
    {
	String retStr = "HEAD->";
	LLNode tmp = _head; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }

    //helper method: returns node of LList at specified index
    public LLNode getNode(int index) {
	LLNode output;
	LLNode tmp = _head; //create alias to head

	//walk to desired node
	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	//reassign output to target node
	output = tmp;
	return output;
    }


    //main method for testing
    public static void main( String[] args )
    {
	LList james = new LList();

	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("beat");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("a");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("need");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("I");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	System.out.println( "2nd item is: " + james.get(1) );

	james.set( 1, "got" );
	System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
	System.out.println( james );

	System.out.println("\n~~~~~~~~~~~~~~~Testing add(index i, String s) and remove(index i)~~~~~~~~~~~~~\n");

	james.add(3, "good");
	System.out.println( james);
	System.out.println("size: " + james.size());

	System.out.println("\nCargo of node being removed: " + james.remove(1));
	System.out.println(james);
	System.out.println("size: " + james.size());

	james.add(1, "lack");
	System.out.println("\n" + james);
	System.out.println("size: " + james.size());

	System.out.println("\nCargo of node being removed: " + james.remove(3));
	System.out.println(james);
	System.out.println("size: " + james.size());
	
    }

}//end class LList


