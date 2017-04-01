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

    public int size(){
	return _size; 
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
    
    public T peekLast(){
	return _end.getCargo();
    }
    
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
