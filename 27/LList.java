/*
  Team Yahoo Search -- Bing Li, Lily Yan
  APCS2 pd1
  HW27 -- 
  2018-03-27
*/

/*****************************************************
 * class LList
 * Implements a linked list of DLLNodes, each containing String data
 * new in v2: add-at-index, remove
 *****************************************************/

public class LList<T> implements List<T> //your List interface must be in same dir
{ 

    //instance vars
    private DLLNode<T> _head;
    private DLLNode<T> _tail;
    private int _size;

    // constructor -- initializes instance vars
    public LList()
    {
	_head = null;
	_tail = null; //at birth, a list has no elements
	_size = 0;
    }


    //--------------v  List interface methods  v--------------
    
    public boolean add( T newVal )
    {
	DLLNode<T> tmp;
	
	if (_size == 0) {
	    tmp = new DLLNode<T> (_head, newVal, _tail);
	    _head = tmp;
	    _tail = tmp;
	}
	else {
	    tmp = new DLLNode<T>( _tail, newVal, null );
	    _tail.setNext(tmp);
	    _tail = tmp;
	}
	
	_size++;
	return true;
    }

    
    public T get( int index )
    {
	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	T retVal;
	DLLNode<T> tmp = _head; //create alias to head

	//walk to desired node
	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	//check target node's cargo hold
	retVal = tmp.getCargo();
	return retVal;
    }


    public T set( int index, T newVal )
    {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	DLLNode<T> tmp = _head; //create alias to head

	//walk to desired node
	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	//store target node's cargo
	T oldVal = tmp.getCargo();

	//modify target node's cargo
	tmp.setCargo( newVal );

	return oldVal;
    }


    //return number of nodes in list
    public int size() { return _size; }
    

    //insert a node containing newVal at position index
    public void add( int index, T newVal ) {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	DLLNode<T> newNode = new DLLNode<T>( null, newVal, null );

	//if index==0, insert node after tail node
	if ( index == 0 ) 
	    add( newVal );
	else {
	    DLLNode<T> tmp = _head; //create alias to head

	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
		tmp = tmp.getNext();

	    //insert new node
	    newNode.setPrev( tmp.getPrev() );
	    newNode.setNext( tmp.getNext() );
	    tmp.setNext( newNode );

	    //increment size attribute
	    _size++;
	}
    }


    //remove node at pos index, return its cargo
    public T remove( int index ) {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	T retVal;
	DLLNode<T> tmp = _head; //create alias to head

	//if index==0, remove head node
	if ( index == 0 ) {
	    //check target node's cargo hold
	    retVal = _head.getCargo();

	    //remove target node
	    _head = _head.getNext();	    
	}
	else {
	    //walk to node before desired node
	    for( int i=0; i < index-1; i++ )
		tmp = tmp.getNext();

	    //check target node's cargo hold
	    retVal = tmp.getNext().getCargo();

	    //remove target node
	    tmp.setNext( tmp.getNext().getNext() );
	}

	//decrement size attribute
	_size--;

	return retVal;
    }

    //--------------^  List interface methods  ^--------------


    // override inherited toString
    public String toString()
    {
	String retStr = "NULL<--";
	DLLNode tmp = _head; //init tr
	while( tmp != null ) {
	    if (tmp.getNext() == null) retStr += tmp.getCargo();
	    else retStr += tmp.getCargo() + "<-->";
	    tmp = tmp.getNext();
	}
	retStr += "-->NULL";
	return retStr;
    }
    
}//end class LList


