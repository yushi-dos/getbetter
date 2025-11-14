/**An implementation of a simple ArrayList class with bounded capacity*/

public class ArrayList<E> implements List<E>{

	//instance variables 

	public static final int CAPACITY = 16 //default array capacity
	private E[] data; //generic aray used for storage
	private int size = 0; //set intial number elements in the list to zero

	//constructors 

	public ArrayList() {
		this(CAPACITY); // constructs an list with this default capacity
	}

	public ArrayList(int capacity){
		data = (E[]) new Object[capacity]; //safe cast; compiler may throw warning, gotta add suppress warning
	}

	//public methods 

	public int size() {
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i]; //Stores the old element currently at position i in temp.
		data[i] = e;//Replaces the element at index i with the new element e.
		return temp; // returns old element
	}

	/**Inserts element e to be at index i, shifting all subsequent elements later.*/
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException{
		checkIndex(i, size + 1);
		if(size == data.length)
			throw new IllegalStateException("Array is full");
		for(int k = size-1; k >= i; k--) //start by shifting rightmost
			data[k+1] = data[k];
		data[i] = e;
		size++; // ready to place the new element
	}

	/**Removes/returns the element at the index i, shifting following elements earlier*/
	public E remove(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		for(int k=i; k<size-1; k++)
			data[k] = data[k+1]
		data[size-1] = null  // help garbage collection
		size--;
		return temp;
	}

	//utility method

	/**Checks whether the given index is in the range[0, n-1]*/
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		if( i<0 || i>=n) throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
}