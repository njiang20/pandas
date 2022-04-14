Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )

APCS pd7

<<<<<<< HEAD
HW91-- Deque the Halls

2022-04-14r

time spent: 1.0 hrs


=======
HW90-- Swabbing the Deque

2022-04-12w

time spent: 1.0 hrs

### PLAN:
* addFirst(), addLast()
* peekFirst(), peekLast()
* removeFirst(), removeLast()
* isEmpty()
* size()

### EXTRAS METHODS:
* contains()
* iterator(), descendingIterator()

### OTHER METHODS:
* offerFirst(), offerLast()
* pollFirst(), pollLast()
* getFirst(), getLast()
* removeFirstOccurrence(), removeLastOccurrence()
* pop()
* push()


We imported LinkedList and use its methods to implement adding and removing for Deque.
Similar to what we did in the homework last night for ALQueue and LLQueue.
We decided not to implement the methods in the OTHER METHODS section because many of them were repetetive. For example getFirst() is only different from peekFirst() in that it returns null if the LinkedList is empty.
However, we are not sure how to implement pop() and push() because they are used for stacks and we are using a linked list.
We added additional methods like the iterator() and contains().
