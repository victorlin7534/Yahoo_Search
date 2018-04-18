/*
  Team Yahoo Search -- Bing Li, Lily Yan
  APCS2 pd1
  HW37
  2018-04-18
 */

public class QQKachoo<T> implements Deque<T> {
    //instance vars
    private DLLNode<T> _front, _end;
    private int _size;

    //constructor
    public QQKachoo {
	_front = new DLLNode<T>(null, null, null);
	_end = new DLLNode<T>(_front, null, null);
	_front.setNext(_end);
	_size = 0; //deque empty at birth
    }

    //helper method: isEmpty()
    //peek methods
    public T peekFirst() {
	if (_size == 0) return null;
	return _front.getCargo();
    }
    
    public T peekLast() {
	if (_size == 0) return null;
	return _end.getCargo();
    }
    
    
    public static void main(String[] args) {
    }
}
