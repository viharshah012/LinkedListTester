package queue;

/* You SHOULD use your custom built linked list for this */
import list.LinkedList;

/**
 * A Linked-List based Queue
 * @author Mark Floryan
 *
 * @param <T>
 */
public class Queue<T> implements IQueue<T>{

	private LinkedList<T> list;
	
	/**
	 * Constructor: Initialize the inner list
	 */
	public Queue(){
		this.list = new LinkedList<T>();
		/* TODO: Implement this method */  
	}
	
	/**
	 * Return the size by invoking the size of the list
	 */
	public int size() { 
		/* TODO: Implement this method */
		return list.size();
	}
	
	/**
	 * Simply add the data to the tail of the linked list
	 */
	public void enqueue(T data) {
		/* TODO: Implement this method */
		list.insertAtTail(data);
	}
	
	/**
	 * Simply remove data from the head of the list, throw exception if list is empty.
	 */
	public T dequeue(){	
		return list.removeAtHead();
		/* TODO: Implement this method */  
	}
	
	
}
