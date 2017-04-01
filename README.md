# deft_analysers
Home of the Deft Analysers.

Rationale for choosing Doubly Linked Nodes for the implementation of the Deque. 

It provides for the fastest way to store the data and view it-- 
   -ArrayList: No matter which side of the ArrayList is considered the front or the end, there will always be an instance where the ArrayList must be "shifted". If you remove or add at the the first index, then everything after must be shifted (this is what the ArrayList class does). Also, it is the case that you must remove or add at the first index because Deque is a data structure that wants to be able to add AND remove at the front AND the end. Therefore, no matter how it's done, one can't dodge an operation that is O(n) using ArrayList as the underlying data structure to implement a Deque. 
   -Linked Nodes: Linked Nodes have the same problem as ArrayList in that one will always end up having to traverse the length of the set of Singly Linked Nodes. 
   -Doubly Linked Nodes: Since these can point both ways, if you're at the front, you can get the Node that is one Node closer to the end, and if you're at the end, vice versa. This way, every method of removing or adding will be O(1), which makes Doubly Linked Nodes faster than the other two choices. 
   
   
