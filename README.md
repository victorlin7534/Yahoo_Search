# Team YahooSearch
## Members: Bing Li :mag:, Lily Yan :tennis:, Selina Zou :mortar_board:
## L #02: All Hands on Deque!

### To-do List
- [x] 1. public T peekFirst()
- [x] 2. public T peekLast();
- [x] 3. public T pollFirst();
- [x] 4. public T pollLast();
- [x] 5. public boolean offerFirst(T x);
- [x] 6. public boolean offerLast(T x);
   
### Rationale For Our Method Selections
Although there are multiple methods in the Java API to remove, add, and get the desired values, we chose this particular subset because the peek, poll and offer methods return the node that it has accessed / modified, while others methods who have the same functionality do not return the node. For example, according to the Java 8 API, both the addFirst() and offerFirst() methods "inserts the specified element at the front of this deque without violating capacity restriction", however the addFirst() method's return type is only an boolean while the offerFirst() method's return type is <E>. For programmers, seeing what exactly was modified in the data structure can be extremely helpful for debugging purposes, that is one reason why we chose the subset of methods with return type <E>. In addition to its return type, the subset of methods we chose does not throw exception if capacity restrictions are violated (ex.removing nodes when the deque is empty), but rather the value null is returned. This is advantageous because exceptions throwing often short circuits the program, which means the code after the capacity violations happened could not be ran.
  
### Rationale For Our Priorities
Peek methods are the easiest to code, since no pointers have to be reassigned.
We chose to do the offer methods last because at the time, we didn't have a clear idea on how to account for capacity restrictions. We thought it would be better to deal with those last.
   

### Rationale for Our Data Structure
Our team chose to implement a doubly linked list in Deque because Deque is designed to be used as both a stack and a queue, which means we must be able to traverse from either end. The two different pointers, each referencing the previous or the next node, is perfect for this job. 

### Development Plan
