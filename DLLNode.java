/*
  Lily Yan
  APCS2 pd1
  HW24a -- On the DLL
  2018-03-23
*/

/*****************************************************
 * class DLLNode
 * Implements a doubly-linked node,
 * for use in lists and other collection classes.
 * Stores data of type String
 *****************************************************/

public class DLLNode 
{
    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes

    //constructor: initializes instance vars
    public DLLNode(DLLNode prev, String value, DLLNode next) {
	_prevNode = prev;
	_cargo = value;
	_nextNode = next;
    }

    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getPrev() { return _prevNode; }
    
    public DLLNode getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
	_nextNode = newPrev;
	return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { return _cargo.toString(); }

    //main method for testing
    public static void main( String[] args )
    {
	DLLNode first = new DLLNode(null, "cat", null);

	//Create a new node after the first
	DLLNode second =  new DLLNode(first, "dog", null );
	first.setNext(second);
		      
	//Create a third node after the second
	DLLNode third =  new DLLNode(second, "cow", null );
	second.setNext(third);

    }

}//end class DLLNode
