public interface Deque<T> {  

    int size();

    void addLast(T val);
    
    void addFirst(T val); 

    T peekFirst();
    
    T peekLast(T val);
    
    T pollFirst();
    
    T pollLast();
    
    boolean isEmpty(); 
    
}
