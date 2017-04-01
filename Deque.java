public interface Deque<T> {  

    int size();//return size of the deque 
    
    void addFirst(T val);//add val to the start

    void addLast(T val);//add val to the end 
    
    T peekFirst();//return the element at the beginning of deque 
    
    T peekLast();//return the element at the end
    
    T pollFirst();//return AND remove the element at the beginning
    
    T pollLast();//return AND remove the element at the end  
    
    boolean isEmpty();//returns true if the deque has no elements, false otherwise 
    
}
