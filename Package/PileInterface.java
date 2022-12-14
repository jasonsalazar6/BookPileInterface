package Package;

/**
An interface for a pile of books.

@author Frank M. Carrano
@version 5.0
*/
public interface PileInterface<T> {
	/** Adds a new book to the top of this pile.
	 @param newBook  An object to be added to the pile. */
	public void add(T newBook);

	/** Removes and returns this pile's top book.
	 @return  Either the book at the top of the pile or, if the
			    pile is empty before the operation, null. */
	public T remove();

	/** Retrieves this pile's top book.
	 @return  Either the book at the top of the pile or null if
			    the pile is empty. */
	public T getTopBook();
	/** Detects whether this pile is empty.
	 @return  True if the pile is empty. */
 boolean isEmpty();

 /** Removes all books from this pile. */

	public void clear();

	/**
	 * Retries all entries that are in the bag. 
	 * @return A newly allocated array of all the entries in the bag. Note: If the bag is empty, the returned array is empty.
	 */
	public T[] toArray();
} // end PileInterface