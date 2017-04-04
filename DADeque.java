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
	_end = _end.getPrev() ;
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
        String retStr = "FRONT--> ";
	DLLNode<T> tmp = _front;
	while(tmp != null){
	    retStr += tmp.getCargo() + "  ";
	    tmp = tmp.getNext();
	}
	retStr += "<--END";
	return retStr;
    }
    
//removes the first occurrence of an object in the queue from the front, returns true if successful and false otherwise.
     public boolean removeFirstOccurrence(T thing){
	DLLNode temp = _front; 
	while(temp != null){
	    if(temp.getCargo().equals(thing)){
		if(temp == _front){//this was the very first element checked (aka _front)
		    _front = temp.getNext();
		    _front.setPrev(null); 
		}
		else if(temp == _end){//this was the very last element checked (aka _end)
		    _end = _end.getPrev();
		    _end.setNext(null); 
		}
		else{//somewhere in between...
		    temp.getPrev().setNext(temp.getNext());
		    temp.getNext().setPrev(temp.getPrev()); 
		}		
		_size--;
		return true; 
	    }
	    temp = temp.getNext(); 
	}	
	return false; 
    }
//removes the first occurrence of an object in the queue from the back, returns true if successful and false otherwise.
    public boolean removeLastOccurrence(T thing){
	DLLNode temp = _end; 
	while(temp != null){
	    if(temp.getCargo().equals(thing)){
		if(temp == _front){//this was the very last element checked (aka _front)
		    _front = temp.getNext();
		    _front.setPrev(null); 
		}
		else if(temp == _end){//this was the very first element checked (aka _end)
		    _end = _end.getPrev();
		    _end.setNext(null); 
		}
		else{//somewhere in between...
		    temp.getPrev().setNext(temp.getNext());
		    temp.getNext().setPrev(temp.getPrev()); 
		}		
		_size--;
		return true; 
	    }
	    temp = temp.getPrev(); 
	}	
	return false; 
    }       

    public static void main(String[] args){
	DADeque dasha = new DADeque<String>();
	dasha.addFirst("poop");
	dasha.addLast("HELLO");
	dasha.addLast("jasper");
	System.out.println(dasha); //poop->hello->jasper
	dasha.pollFirst();
	System.out.println(dasha); // hello -> jasper
	dasha.pollLast();
	System.out.println(dasha); // hello
	dasha.addFirst("allard");
	dasha.addLast("allard");
	dasha.addLast("bob"); 
	System.out.println(dasha); // allard -> hello -> allard -> bob
	
	System.out.println("removing bob via removeFirstOcc: " + dasha.removeFirstOccurrence("bob"));
	System.out.println(dasha);
	System.out.println("removing last allard via removeLastOcc: " + dasha.removeLastOccurrence("allard"));
	System.out.println(dasha);
    }

}
