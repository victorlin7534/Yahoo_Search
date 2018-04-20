# Team Yahoo Search
## Members: Bing Li :mag:, Lily Yan :tennis:, Selina Zou :mortar_board:
## L #02: All Hands on Deque!

### To-do List
- [x] 1. `public T peekFirst()`
- [x] 2. `public T peekLast();`
- [x] 3. `public T pollFirst();`
- [x] 4. `public T pollLast();`
- [x] 5. `public boolean offerFirst(T x);`
- [x] 6. `public boolean offerLast(T x);`
   
### Rationale For Our Method Selections
Although there are multiple methods in the Java API to remove, add, and get desired values, we chose this particular subset because the `peek()`, `poll()` and `offer()` methods do not throw exceptions unlike the add, remove, and get methods. 

For example, the `peek()` and `poll()` methods return null if the deque is empty and there is nothing to get/remove. However, the `get()` and `remove()` methods return NoSuchElementExceptions. The `offer()` methods return false to see if an element can be added without violating capacity restrictions before actually attempting to add the element. But the `add()` methods throw IllegalStateExceptions. 

Using the `peek()`, `poll()`, and `offer()` methods is advantageous because exception-throwing often short circuits the program, which means the code after the lines with capacity violations cannot be run and thus cannot be tested for debugging as we code. 
  
### Rationale For Our Priorities
`peek()` methods are the easiest to code, since no pointers have to be reassigned.
We chose to do the `offer()` methods last because at the time, we didn't have a clear idea on how to account for capacity restrictions. We therefore thought it would be better to deal with those last.

### Rationale for Our Data Structure
Our team chose to implement a doubly linked list in Deque because we must be able to traverse Deque in both directions. The two different pointers, each referencing the previous or the next node, is perfect for this job. 

The `offer()` and `poll()` methods both require the ability to access a node's previous and next nodes. `pollFirst()` requires reassigning the former front node to its next node, while `pollLast()` requires reassigning the former end node to its previous node. `offerFirst()` requires adding a node in the front and setting it as the former front node's previous node. `offerLast()` requires adding a node at the end and setting it as the former end node's next node.

### Development Plan
1. Choose the methods we want to implement in our Deque implementation from the Java 8 API. Base decisions on how easy the method will be to code and how useful they are.
2. Write local Deque interface.
3. Choose data structure for Deque that will result in efficient runtime (preferrably constant time) for our methods.
4. Create Driver file. Keep everything commented.
5. Code methods one at a time, checking for compilability after writing each one.
   * NOTE: After successfully implementing a working version of `offer()` methods, figure out how to account for capacity limitations.
6. Uncomment one section of the Driver file, and compile and run it. If successful, uncomment the next section and repeat. If not, go back and fix code.
