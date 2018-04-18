/*
  Team Yahoo Search -- Bing Li, Lily Yan
  APCS2 pd1
  HW37
  2018-04-18
 */

import java.util.*;

public class QQKachoo<T> implements Deque<T> {
    //instance vars
    private DLLNode<T> _front, _end;
    private int _size;

    //constructor
    public QQKachoo() {
	_front = new DLLNode<T>(null, null, null);
	_end = new DLLNode<T>(_front, null, null);
	_front.setNext(_end);
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

     //get methods
    public T getFirst() {
	if (_size == 0) throw new NoSuchElementException();
	return _front.getCargo();
    }

    public T getLast() {
	if (_size == 0) throw new NoSuchElementException();
	return _end.getCargo();
    }

    //poll methods
    public T pollFirst() {
	if (_size == 0) return null;
	T ans = _front.getCargo();
	_front = _front.getNext();
	return ans;
    }

    public T pollLast() {
	if (_size == 0) return null;
	T ans = _end.getCargo();
	_end = _end.getPrev();
	return ans;
    }

    //remove methods
    public T removeFirst() {
        if (_size == 0) throw new NoSuchElementException();
	T ans = _front.getCargo();
	_front = _front.getNext();
	return ans;
    }

    public T removeLast() {
        if (_size == 0) throw new NoSuchElementException();
	T ans = _end.getCargo();
	_end = _end.getPrev();
	return ans;
    }

    //offer methods
    public boolean offerFirst(T x) {
	
    }

    public boolean offerLast(T x) {
	return false;
    }

    //add methods
    public void addFirst(T x) {

    }

    public void addLast(T x) {

    }
    
    public static void main(String[] args) {
    }
}
