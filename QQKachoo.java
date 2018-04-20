/*
  Team Yahoo Search -- Bing Li, Lily Yan, Selina Zou
  APCS2 pd1
  Lab 02
  2018-04-18
*/

import java.util.*;

public class QQKachoo<T> implements Deque<T> {
    //instance vars
    private DLLNode<T> _front, _end;
    public int _size;
    private int _capacity;

    //default constructor
    public QQKachoo() {
	_front = new DLLNode<T>(null, null, null); 
	_end = new DLLNode<T>(null, _front, null); 
	_front.setNext(_end); //linking front and end to each other
	_size = 0; //deque empty at birth
	_capacity = -1; //if no capacity is instantiated by user, set as -1
    }

    public QQKachoo(int cap) { //if user decides to put capacity restrictions on deque
	this();
	_capacity = cap;
    }
    

    //peek methods
    public T peekFirst() {
	if (_size != 0)
	    return _front.getCargo();

	 return null;
    }
    
    public T peekLast() {
	if (_size != 0)
	    return _end.getCargo();

	return null;
    }

    //poll methods
    public T pollFirst() {
	if (_size == 0) return null; //if empty, return null
	
	T ans = _front.getCargo(); //store cargo of node to be removed
	_front = _front.getNext(); //removing front node
	_size -= 1; //decreasing size
	return ans;
    }

    public T pollLast() {
	if (_size != 0) {
	    T ans = _end.getCargo();
	    _end = _end.getPrev(); //removing end node
	    _size -= 1;
	    return ans;
	} else {
	    return null;
	}
    }

    //offer methods (Q: when do we return false?)
    public boolean offerFirst(T x) {
	if(!(_capacity == -1 || _size < _capacity) { //if a capacity was set AND the deque is full...
	    return false;
	}
	
	_front = new DLLNode<T>(x, null, _front); //making node with x as cargo and former front node as its next node

	if ( _size != 0 )
	    _front.getNext().setPrev( _front );
	else 
	    _end = _front;

	_size++; //increment size
	return true;
    }

    public boolean offerLast(T x) {
	if(!(_capacity == -1 || _size < _capacity)) {  //if a capacity was set AND the deque is full...
	    return false;
	}
	
        _end = new DLLNode<T>(x, _end, null); //making node with x as cargo and former end node as its previous node
	
	if ( _size == 0 ) 
	    _front = _end;
	else 
	    _end.getPrev().setNext( _end );
	_size++;
	return true;
    }

    //toString method:
    public String toString() {
	String s = "NULL<--";
	DLLNode<T> tmp = _front;
	int ctr = 0;
	if (_size == 0) return "NULL<-->NULL";
	while (ctr < _size) {
	    s += tmp.getCargo() + "<-->";
	    tmp = tmp.getNext();
	    ctr ++;
	}
	return s.substring(0, s.length()-4) + "-->NULL";
    }
}
