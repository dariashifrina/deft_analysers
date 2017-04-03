/*

NULL  <- N1 <--> N2 <--> N3 <--> N4 -> NULL

   _front^                        ^_end 

>>>>>> this way is NEXT 

<<<<<< this way is PREV

 */

public class DADeque<T> implements Deque<T> 
{

    private DLLNode<T> _front, _end;
    private int _size; 

    // default constructor creates an empty queue
    public DADeque()
    {
        _front = null;
	_end = null;
	_size = 0; 
    }
    //returns size of queue
    public int size(){
	return _size; 
    }
    //adds a value to the beginning of a queue
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
    //adds a value to the end of a queue
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
    //returns the value of the first item in queue
    public T peekFirst(){
	if(isEmpty()){
	    return null;
	}
	else{
	return _front.getCargo();
	} 
    }
    // returns the value of the last item in queue
    public T peekLast(){
	if(isEmpty()){
	    return null;
	}
	else{
	return _end.getCargo();
	}
    }
    //removes the first item in queue and returns its value
    public T pollFirst(){
	if(isEmpty()){
	return null;
}
	else{
	T tmpval = this.peekFirst();
	_front = _front.getNext();
	_size -= 1;
	return tmpval;
}
    }
    //removes the last time in queue and returns its value
    public T pollLast(){
	if(isEmpty()){
	return null;
}
	else{
	T tmpval = this.peekLast();
	_end = _end.getPrev();
	_size -= 1;
	return tmpval;
}
    }
    //returns whether or not queue is empty
    public boolean isEmpty(){
	return(_size==0);
    }
    
    public String toString() 
    { 
        String retStr = "HEAD->";
	DLLNode<T> tmp = _front;
	while(tmp != null){
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }

    public static void main(String[] args){
    }

}
