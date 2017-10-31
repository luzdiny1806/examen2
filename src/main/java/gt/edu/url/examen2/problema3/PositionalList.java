package gt.edu.url.examen2.problema3;

public interface PositionalList<E> {
	int size( );
	boolean isEmpty( );
	Position<E> first( );
	Position<E> last( );
	Position<E> addFirst(E e);
	Position<E> addLast(E e);
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	E set(Position<E> p, E e) throws IllegalArgumentException;
	E remove(Position<E> p) throws IllegalArgumentException;
        //Metodo a implementar
        void swap(Position<E> var2, Position<E> var4) {
        	Node<E> var1 = validate(var2); 
    		Node<E> var3 = validate(var4); 
    		E x = var1.getElement(); 
    		E y = var3.getElement();
    		P.setElement(x);
    		Q.setElement(y);
        }

}
