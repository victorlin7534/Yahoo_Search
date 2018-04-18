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

    //constructor
    public QQKachoo() {
	_front = new DLLNode<T>(null, null, null); 
	_end = new DLLNode<T>(null, _front, null); 
	_front.setNext(_end); //linking front and end to each other
	_size = 0; //deque empty at birth
    }

    //peek methods
    public T peekFirst() {
	if (_size == 0) return null;
	return _front.getCargo(); 
    }
    
    public T peekLast() {
	if (_size == 0) return null;
	return _end.getCargo();
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
	if (_size == 0) return null;
	T ans = _end.getCargo();
	_end = _end.getPrev(); //removing end node
	_size -= 1;
	return ans;
    }

    //offer methods (Q: when do we return false?)
    public boolean offerFirst(T x) {
        _front = new DLLNode<T>(x, null, _front); //making node with x as cargo and former front node as its next node

	if ( _size == 0 ) 
	    _end = _front;
	else 
	    _front.getNext().setPrev( _front );
	_size++; //increment size
	return true;
    }

    public boolean offerLast(T x) {
        _end = new DLLNode<T>(x, _end, null); //making node with x as cargo and former end node as its previous node

	if ( _size == 0 ) 
	    _front = _end;
	else 
	    _end.getPrev().setNext( _end );
	_size++;
	return true;
    }

    //add methods (do we need these?)
    public void addFirst(T x) {

    }

    public void addLast(T x) {

    }

    //toString method:
    public String toString() {
	String s = "NULL<--";
	DLLNode<T> tmp = _front;
	int ctr = 0;
	while (ctr < _size) {
	    s += tmp.getCargo() + "<-->";
	    tmp = tmp.getNext();
	    ctr ++;
	}
	return s.substring(0, s.length()-4) + "-->NULL";
    }
    
    public static void main(String[] args) {
	QQKachoo<String> mister = new QQKachoo<String>();

	System.out.println("\nEnqueueing deque...");

	mister.offerLast("and");
	mister.offerLast("there's");
	mister.offerLast("nobody");
	mister.offerLast("around");

	mister.offerFirst("forest");
	mister.offerFirst("a");
	mister.offerFirst("in");
	mister.offerFirst("falling");
	mister.offerFirst("you're");
	mister.offerFirst("when");
	
	System.out.println("\nDeque after enqueing: " + mister);
	   
	while (mister._size > 0) {
	    int firstOrLast = (int)(Math.random() * 2); //determines whether to remove element at front or end of deque
	    if (firstOrLast == 0) { 
		System.out.println("\nRemoving element at FRONT of deque...");
		System.out.println("Element at front: " + mister.peekFirst());
		System.out.println("Element removed: " + mister.pollFirst());
	    }

	    else {
	        System.out.println("\nRemoving element at END of deque...");
		System.out.println("Element at end: " + mister.peekLast());
		System.out.println("Element removed: " + mister.pollLast());
	    }

	    System.out.println("Deque after dequeue: " + mister);
	}	   
	/* ~~~~~~~~~~~~MOVE ME DOWN~~~~~~~~~~~~~
	   ~~~~~~~~~~~~YOU MADE IT~~~~~~~~~~~~~~~ */
    }
}
