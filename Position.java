public interface Position<E>{
	/**Returns element stored at this position
	 * 
	 * returns the stored element
	 * throws error if the position is not valid*/

	 E getElement() throws IllegalStateException;
}