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

public class DLLNode<T> 
{
    private T _cargo;    //cargo may only be of type T
    private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes

    //constructor: initializes instance vars
    public DLLNode(DLLNode<T> prev, T value, DLLNode<T> next) {
	_prevNode = prev;
	_cargo = value;
	_nextNode = next;
    }

    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode<T> getPrev() { return _prevNode; }
    
    public DLLNode<T> getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
	T foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode<T> setPrev( DLLNode<T> newPrev ) {
	DLLNode<T> foo = getPrev();
	_nextNode = newPrev;
	return foo;
    }

    public DLLNode<T> setNext( DLLNode<T> newNext ) {
	DLLNode<T> foo = getNext();
	_nextNode = newNext;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { return _cargo.toString(); }

    //main method for testing
    public static void main( String[] args )
    {
	DLLNode<String> first = new DLLNode<String>(null, "cat", null);

	//Create a new node after the first
	DLLNode<String> second =  new DLLNode<String>(first, "dog", null );
	first.setNext(second);
		      
	//Create a third node after the second
	DLLNode<String> third =  new DLLNode<String>(second, "cow", null );
	second.setNext(third);

    }

}//end class DLLNode
