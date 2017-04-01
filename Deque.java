public interface Deque<T> {  

    int size();
    
    void addFirst(T val); 

    void addLast(T val);
    
    T peekFirst();
    
    T peekLast(T val);
    
    T pollFirst();
    
    T pollLast();
    
    boolean isEmpty(); 
    
}
