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
	_capacity = -1;
    }

    public QQKachoo(int cap) {
	this();
	_capacity = cap;
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
	if(_capacity != -1 && _size >= _capacity) {
	    return false;
	}
	_front = new DLLNode<T>(x, null, _front); //making node with x as cargo and former front node as its next node

	if ( _size == 0 ) 
	    _end = _front;
	else 
	    _front.getNext().setPrev( _front );
	_size++; //increment size
	return true;
    }

    public boolean offerLast(T x) {
	if(_capacity != -1 && _size >= _capacity) {
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
    
    public static void main(String[] args) {
	QQKachoo<String> mister = new QQKachoo<String>();
	QQKachoo<String> mrs = new QQKachoo<String>(8);

	System.out.println("\nEnqueueing deque mister...");

	System.out.println("Element added successfully: " + mister.offerLast("and"));
	System.out.println("Element added successfully: " + mister.offerLast("there's"));
	System.out.println("Element added successfully: " + mister.offerLast("nobody"));
	System.out.println("Element added successfully: " + mister.offerLast("around"));

	System.out.println("Element added successfully: " + mister.offerFirst("forest"));
	System.out.println("Element added successfully: " + mister.offerFirst("a"));
	System.out.println("Element added successfully: " + mister.offerFirst("in"));
	System.out.println("Element added successfully: " + mister.offerFirst("falling"));
	System.out.println("Element added successfully: " + mister.offerFirst("you're"));
	System.out.println("Element added successfully: " + mister.offerFirst("when"));
	System.out.println("\nmister after enqueing: " + mister);

	
	System.out.println("\nEnqueueing deque mrs...");

	System.out.println("Element added successfully: " + mrs.offerLast("peck"));
	System.out.println("Element added successfully: " + mrs.offerLast("of"));
	System.out.println("Element added successfully: " + mrs.offerLast("pickled"));
	System.out.println("Element added successfully: " + mrs.offerLast("peppers"));

	System.out.println("Element added successfully: " + mrs.offerFirst("a"));
	System.out.println("Element added successfully: " + mrs.offerFirst("picked"));
	System.out.println("Element added successfully: " + mrs.offerFirst("Piper"));
	System.out.println("Element added successfully: " + mrs.offerFirst("Peter"));
	System.out.println("Element added successfully: " + mrs.offerFirst("random"));
	System.out.println("Element added successfully: " + mrs.offerLast("thing"));

	System.out.println("\nmrs after enqueing: " + mrs);

	
	   
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
