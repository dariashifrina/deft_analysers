
public class DLLNode<T>{
    
    private T _cargo;    //cargo may only be of type String
    private DLLNode<T> _nextNode; //pointer to next DLLNode
    private DLLNode<T> _prevNode; //pointer to previous DLLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode<T> prev, DLLNode<T> next ) 
    {
	_cargo = value;
	_prevNode = prev; 
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode<T> getNext() { return _nextNode; }

    public DLLNode<T> getPrev() { return _prevNode; } 
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) 
    {
	T ret = _cargo; 
	_cargo = newCargo; 
	return ret; 
    }

    public DLLNode<T> setNext( DLLNode<T> newNext ) 
    {
	DLLNode ret = _nextNode; 
	_nextNode = newNext;
	return ret; 
    }

    public DLLNode<T> setPrev( DLLNode<T> newPrev ) 
    {
	DLLNode ret = _prevNode; 
	_prevNode = newPrev;
	return ret; 
    }
    //--------------^  MUTATORS  ^--------------

    // override inherited toString
    public String toString() { return _cargo.toString(); }

}
