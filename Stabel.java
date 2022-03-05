public class Stabel<T> extends Lenkeliste<T> {
    
    @Override
    public void leggTil(T x) {
        Node node = new Node(x);
        node.data = x; 
        node.neste = forst; 
        forst = node;
        stoerrelse ++;
    }
} 
 