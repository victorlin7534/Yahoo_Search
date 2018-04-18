/*
  Team Yahoo Search -- Bing Li, Lily Yan
  APCS2 pd1
  HW37
  2018-04-18
 */

public interface Deque<T> {

    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //retrieves (doesn't remove) first/last element of deque
    //returns null if empty
    public T peekFirst();
    public T peekLast();
    
    //retrieves and removes first/last element of deque
    //returns null if empty
    public T pollFirst();
    public T pollLast();

    //inserts specified element at front/end of deque
    //returns false if deque is full
    public boolean offerFirst(T x);
    public boolean offerLast(T x);

    //throws IllegalStateException if deque is full
    //public void addFirst(T x);
    //public void addLast(T x);

    //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~
}
