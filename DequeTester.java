/*
Jesse Sit
APCS2 pd3
hw29 -- Stress is the Best
2017-4-4
*/
/*
I think that the reason why the pollLast() and removeLastOccurrence() methods don't seem to work is that they are changing  _end and don't affect _front and the toString() returns all the nodes of _front so it looks as if nothing has been removed. I'm not sure how to change _front to reflect the changes made by pollLast() and removeLastOccurrence() to _end
*/
public class DequeTester{
    public static void main(String[] args){
	Deque<String> Brown = new DADeque<String>();
	
	System.out.println(Brown); //prints an empty deque
	//System.out.println(Brown.isEmpty()); //returns true
	System.out.println(Brown.peekFirst()); //returns null
	System.out.println(Brown.peekLast()); //returns null
	System.out.println(Brown.pollFirst()); //returns null
	System.out.println(Brown.pollLast()); //returns null
	//System.out.println(Brown.removeFirstOccurrence("Jesse")); //results in null.pointer.exception because the deque is empty
	Brown.addFirst("Jesse"); // adds to front
        Brown.addLast("Sit"); //adds to end
        Brown.addFirst("Eng"); //adds to front
	Brown.addFirst("Lisa"); //adds to front
        Brown.addLast("Eng"); //adds to end
	System.out.println(Brown);
	System.out.println(Brown.removeFirstOccurrence("Lisa")); //expected result: first "Lisa" removed, result: nothing because our method does not work when removing first element
	System.out.println(Brown.removeFirstOccurrence("Eng")); //results in first "Eng" removed
	System.out.println(Brown.removeLastOccurrence("Lisa")); //expected result: last "Lisa" removed, result: nothing; unsure of reason
	System.out.println(Brown);
	System.out.println(Brown.pollLast()); //expected result: remove last element, result: nothing; unsure of reason
	System.out.println(Brown);
	System.out.println(Brown.pollFirst()); //remove first element
	System.out.println(Brown);
    }
}
