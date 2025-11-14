public interface List<E> {

	int size(); /**returns the number of elements in the list*/

	boolean isEmpty(); /**returns if the list is empty*/

	E get(int i) throws IndexOutOfBoundsException; /**returns the element at index i; error occurs if i is not in range (0, size()-1)*/

	E set(int i, E e) throws IndexOutOfBoundsException; /**replaces the element at index i to the element e given and returns old element at the index*/

	void add(int i, E e) throws IndexOutOfBoundsException; /**inserts element e at the index i; shifts all elements that comes after that index down*/

	voif remove(int i) throws IndexOutOfBoundsException; /**removes element e at the index i; shifts all elements that follows to index earlier*/
}