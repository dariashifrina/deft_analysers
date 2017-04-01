/*

NULL  <- N1 <--> N2 <--> N3 <--> N4 -> NULL

   _front^                        ^_end 

>>>>>> this way is NEXT 

<<<<<< this way is PREV

 */

public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;
    private int _size; 

    // default constructor creates an empty queue
    public LLQueue()
    {
        _front = null;
	_end = null;
	_size = 0; 
    }

    public int size(){
	return _size(); 
    }
    
    public void addFirst(T val){
	//DLLNode newNode = new DLLNode<T>(val, null, null);
        if(_front == null){
	    DLLNode newNode = new DLLNode<T>(val, null, null);
	    _front = newNode; 
	    _end = newNode; 
	}
	else{
	    DLLNode newNode = new DLLNode<T>(val, null, _front); 
	    _front.setPrev(newNode);
	    _front = newNode; 
	}
	_size++; 
    }

    public void addLast(T val){
        if(_front == null){
	    DLLNode newNode = new DLLNode<T>(val, null, null);
	    _front = newNode; 
	    _end = newNode; 
	}
	else{
	    DLLNode newNode = new DLLNode<T>(val, _end, null); 
	    _end.setNext(newNode);
	    _end = newNode; 
	}
	_size++; 	
    }
    
    public T peekFirst(){
	return _front.getCargo(); 
    }
    
    public T peekLast(T val){
	
    }
    
    public T pollFirst(){
    }
    
    public T pollLast(){
    }
    
    public boolean isEmpty(){
    }
    

    public String toString(){
	
    }


}
