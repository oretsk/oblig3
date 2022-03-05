public abstract class Lenkeliste<T> implements Liste<T> {
    protected Node forst = null;
    protected Node siste = null;
    protected int stoerrelse = 0;

    public class Node {
        Node neste = null;
        Node forrige = null; 
        T data;

        public Node(T data) {  
            this.data = data;  
        }
    }  
    public int stoerrelse() { 
        return stoerrelse; 
    } 
    public void leggTil(T x) { 
        Node node = new Node(x);
        stoerrelse ++; 
        if (siste == null) { 
            forst = node;
            siste = node;
            return; 
        } 
        siste.neste = node; 
        node.forrige = siste;
        siste = node;  
    }  
    public T hent() {
    if (forst == null) {
        return null;
    } 
    return forst.data;
    }
    public T fjern() throws UgyldigListeindeks {
        if (stoerrelse == 0) {
            throw new UgyldigListeindeks(0);
        }
        T verdi = forst.data;
        if (stoerrelse == 1) {
            siste = null;
            forst = null;  
        }else {
        Node node = forst;
        forst = node.neste;
        }
        stoerrelse -= 1;
        return verdi;
    }  
    public String toString() { 
        String s = "";  
        Node a = forst;
        while (a != null) {
            s += "" + a.data;
            a = a.neste; 
        }
        return s; 
    }
}
   