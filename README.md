# deft_analysers
Home of the Deft Analysers.

## Rationale for choosing Doubly Linked Nodes for the implementation of the Deque. 

   It provides for the fastest way to store the data and view it-- 
   
   
   1-ArrayList: No matter which side of the ArrayList is considered the front or the end, there will always be an instance where the      ArrayList must be "shifted". If you remove or add at the the first index, then everything after must be shifted (this is what the ArrayList class does). Also, it is the case that you must remove or add at the first index because Deque is a data structure that wants to be able to add AND remove at the front AND the end. Therefore, no matter how it's done, one can't dodge an operation that is O(n) using ArrayList as the underlying data structure to implement a Deque. 
   
   
   2-Linked Nodes: Linked Nodes have the same problem as ArrayList in that one will always end up having to traverse the length of the set of Singly Linked Nodes. 
   
   
   3-Doubly Linked Nodes: Since these can point both ways, if you're at the front, you can get the Node that is one Node closer to the end, and if you're at the end, vice versa. This way, every method of removing or adding will be O(1), which makes Doubly Linked Nodes faster than the other two choices. 
   
   ## Our Methods

We included both the AddFirst(T val) and AddLast(T val) methods, as well as the pollFirst() and pollLast() methods. All four methods were required to support element insertion and removal at both ends. We also included the peekFirst() and peekLast() methods to assist with removing items from the deque. For example, if we added to the front, we would peek the first element to return, and if we added to the end, we would peek the last element to return. We also included removeFirstOccurence and removeLastOccurrence because it mobilized the removal of objects by tracking from the front and end of the queue. 
