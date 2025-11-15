/**An interface for positional list*/

public interface PositionalList<E>{
	
	/**returns number of element in the list*/
	int size();

	/**returns if list is empty*/
	boolean isEmpty();

	/**returns the first Position in the list
	 * 
	 * the reason we put PositionE instead of int or string cuz we want to also know the position
	 * and with int or string we only know the element not the position*/
	Position<E> first(); 

	/**returns the last Position in the list*/
	Position<E> last();

	/**returns Position immediately before p (or null, if p is first)*/
	Position<E> before(Position<E> p) throws IllegalArgumentException;

	/**returns Position immediately after p (or null, if p is last)*/
	Position<E> after(Position<E> p) throws IllegalArgumentException;

	/**inserts element at the the front of the list, returning the position of new element*/
	Position<E> addFirst(E e);

	/**inserts element at the the back of the list, returning the position of new element*/
	Position<E> addLast(E e);

	/**inserts element in the list just before position p & returns position of the new element*/
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;

	/**inserts element in the list just after position p & returns position of the new element*/
	Position<E> addLast(Position<E> p, E e) throws IllegalArgumentException;

	/**replaces element at position p with element e and returns old element at that position*/
	Position<E> set(Position<E> p, E e) throws IllegalArgumentException;

	/**removes element at position p and returns old element at that position (invalidating p)*/
	Position<E> remove(Position<E> p) throws IllegalArgumentException;


}