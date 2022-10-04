package Package;

/* In PileBooks interface, addBook(title) is a method to add books with title name as parameter.
removeBook() is a method to remove top book in pile.showBooks() is method for showing books in a pile.
numberOfBooks() method is to return a integer value by counting number of books in a pile currently.
findBook(title) is a method to check book is present in pile of books.
*/
//A class bag that uses linked nodes to store data.

public class PileOfBooks<T> implements PileInterface<T> {

	
	// First node reference is null

	private Node<T> firstNode;
	private int numberOfBooks;

	public PileOfBooks() {
		firstNode = null;
		numberOfBooks = 0;
	}


	//Adding node, referencing new node if first is null. New nodes are at the beginning of the chain

	@Override
	public void add(T newBook) {
		Node<T> newNode = new Node<T>(newBook);
		newNode.setNextNode(firstNode); 
		firstNode = newNode; 
		numberOfBooks++;

	}


	// Removes first node from the chain

	@Override
	public T remove() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.getData();
			firstNode = firstNode.getNextNode(); 
			numberOfBooks--;
		}
		return result;
	}

	@Override
	public T getTopBook() {
		if (firstNode != null) {
			return firstNode.getData();
		} else {
			return null;
		}
	} 

	@Override
	public boolean isEmpty() {
		return firstNode == null;

	}

	// used in loop until everything is removed
	
	@Override
	public void clear() {
		while (!isEmpty()) 
			remove();

	}

	//	It is a safe cast because the array has null entries
	
	@Override
	public T[] toArray() {
		
		// Unchecked cast
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfBooks]; 
		int index = 0;
		Node<T> currentNode = firstNode;
		while ((index < numberOfBooks) && (currentNode != null)) {
			result[index] = (T) currentNode.getData();
			index++;
			currentNode = currentNode.getNextNode();
		}

		return result;
	}
}