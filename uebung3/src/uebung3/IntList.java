package uebung3;

import java.awt.List;

/**
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 * </p>
 * Java-Exception k√∂nnen nicht genutzt werden, da sie im ersten Semester nicht
 * vorgesehen sind. Deshalb werden Ausnahmen (Fehlerzust√§nde) durch die R√ºckgabe
 * von -1 gekennzeichnet. Daraus folgt, dass in dieser Liste nur Zahlen >= 0
 * gespeichert werden sollten.
 *
 * @author Markus Gumbel
 * @version public
 */
public class IntList {

    /**
     * Listenkopf.
     */
    IntNode head = null;

    /**
     * Falls bereits ein Element in neuer Liste sein soll.
     *
     * @param value Wert des ersten Elements.
     */
    public IntList(int value) {
        head = new IntNode(value, null);
    }

    public IntList() {
    }

    public void addFirst(int value) {
        IntNode element = new IntNode();
        element.value = value;
        element.next = head;
        // Alternativ: ... new IntNode(value, head);
        head = element;
    }

    /**
     * F√ºgt ein Element an das Ende der Liste an. Alternative Implementierung.
     *
     * @param value Element, das eingef√ºgt werden soll.
     */
    public void addLast(int value) {
        IntNode element = new IntNode(); // Erzeuge Knoten
        element.value = value;
        element.next = null;
        // Das Ende der Liste suchen:
        IntNode p = head;
        if (p == null) {// Leere Liste?
            head = element;
        } else { // Liste enth√§lt Elemente
            while (p.next != null) {
                p = p.next;
            }
            // F√ºge am Ende an:
            p.next = element;
        }
    }

    /**
     * √úberpr√ºft, ob die Liste Elemente enth√§lt.
     *
     * @return Wahr, wenn die Liste leer ist, falsch sonst.
     */
    public boolean isEmpty() {
        // Es k√∂nnte auch √ºberpr√ºft werden, ob size() 0 liefert,
        // dieser Test ist jedoch schneller:
        return head == null;
    }

    /**
     * @return Der Wert des ersten Elements oder -1, wenn die Liste leer ist.
     */
    public int getFirst() {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	if (p == null){
    		return -1;
    	} else {
    		return head.value;
    	}
        //return 0;
    }

    /**
     * @return Der Wert des letzten Elements oder -1, wenn die Liste leer ist.
     */
    public int getLast() {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
        if (p == null) {// Leere Liste?
            return -1;
        } else { // Liste enth√§lt Elemente
            while (p.next != null) {
                p = p.next;
            }
            return p.value;
        }
        //return 0;
    }

    /**
     * Entfernt das erste Element aus der Liste.
     *
     * @return Der Wert des ersten Elements oder -1, wenn die Liste leer ist.
     */
    public int removeFirst() {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	if (p == null) {// Leere Liste?
            return -1;
        } else {
        	head = p.next;
        	return p.value; 
        }    	
    	//head = p.next;
        //return 0;
    }

    /**
     * Entfernt das letzte Element aus der Liste.
     *
     * @return Der Wert des letzten Elements oder -1, wenn die Liste leer ist.
     */
    public int removeLast() {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	IntNode hilf = p;
    	if (p == null) {// Leere Liste?
            return -1;
    	} else if (p.next == null){//Liste hat nur ein Element
    		head = null;
    		return p.value;
        } else {//Liste hat mehr als ein Element
        	while (p.next != null) {
        		hilf = p;
                p = p.next;
            }
        	hilf.next = null;        
        	return p.value;
        }
    	//return 0;
    }

    /**
     * @param idx
     * @return Wert an Position <code>idx</code> oder -1 im Fehlerfall,
     *         wenn der Index ung√ºltig ist.
     */
    public int getAt(int idx) {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	if(size() < idx || idx <= 0){
    		return -1;
    	} else {
    		while (1 < idx){
    			idx = idx - 1;
    			p = p.next;
    		}
    		return p.value;
    	}
        //return 0;
    }

    /**
     * √úberschreibe den Wert an Position <code>idx</code> mit <code>value</code>.
     * Es wird eine Fehlermeldung ausgegeben, wenn <code>idx</code> eine
     * √ºng√ºltige Position ist.
     *
     * @param idx
     * @param value
     */
    public void setAt(int idx, int value) {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	if(size() < idx || idx <= 0){
    		System.out.print("Der Index ist nicht verf¸gbar! ");
    	} else {
    		while (1 < idx){
    			idx = idx - 1;
    			p = p.next;
    		}
    		p.value = value;
    	}
    }

    public void remove(int e) {
        // NOCH NICHT IMPLEMENTIERT!
    }

    public int removeAt(int idx) {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	IntNode hilf = p;
    	int merkep = p.value;
    	int position = 1;
    	if(size() < idx || idx <= 0){
    		return -1;
    	} else if (idx == 1){
    		head = p.next;
    		return p.value;
    	} else if (idx == size()){
    		merkep = getAt(size());
    		removeLast();
    		return merkep;
    	} else {
    		while (1 < idx){
    			idx = idx - 1;
    			hilf = p;
    			p = p.next;
    			position = position + 1;
    			/*System.out.print("h:" + hilf.value +" ");
    			System.out.print("p:" + p.value + " ");
    			System.out.print("pos:" + position + " ");*/
    		}
    		merkep = p.value;
    		while (position < size()){
    			hilf.next.value = p.next.value;
    			hilf = hilf.next;
    			p = p.next;
    			position = position + 1;
    		}
    		removeLast();
    		return merkep;
    	}
    	//return 0;
    }
    
    /**
     * Erstellt eine tiefe Kopie der Liste.
     * @return IntList
     */    
    public IntList deepCopy(){
    	// NOCH NICHT IMPLEMENTIERT!
    	IntList deepcopy = new IntList();
    	IntNode p = IntList.this.head;
    	for (int i = 1; i <= IntList.this.size(); i++){
    		deepcopy.addLast(p.value);
    		p = p.next;
    	}
    	return deepcopy;
    }

    /**
     * F√ºgt eine andere Liste an das Ende dieser Liste an.
     * Achtung! Die angef√ºgte Liste k√∂nnte auch weiterhin
     * doppelt verwendet werden. Das wird hier NICHT gemacht,
     * statt dessen wird die urspr√ºngliche Liste geleert.
     *
     * @param otherList Die andere Liste.
     */
    public void concat(IntList otherList) {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = IntList.this.head;
    	IntNode q = otherList.head;
    	while (p.next != null) {
            p = p.next;
        }
    	p.next = q;
    	otherList.clear();
    }
    
    /**
     * Bildet die Schnittmenge dieser Liste mit einer anderen.
     * Sie besitzt die Elemente die in beiden Listen WAREN!!!!
     * 
     * @param otherList Die andere Liste.
     */
    public void intersectList(IntList otherList){
    	// NOCH NICHT IMPLEMENTIERT!
    	IntList hilfList = new IntList();
    	IntNode p = IntList.this.head;
    	int zaehler = 1;
    	while (zaehler <= size()){
    		if (otherList.contains(p.value) == true && hilfList.contains(p.value) == false){
    			hilfList.addLast(p.value);
    			p = p.next;
    			zaehler = zaehler + 1;
    		} else {
    			IntList.this.removeAt(zaehler);
    		}
    	}
    	otherList.clear();
    	hilfList.clear();
    }

    /**
     * √úberpr√ºft, ob der der Wert <code>value</code> in der Liste
     * enthalten ist.
     *
     * @param value
     * @return
     */
    public boolean contains(int value) {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	int laeufer = 1;
    	while (laeufer <= size()){
    		if (p.value == value){
    			return true;
    		}
    		p = p.next;
    		laeufer = laeufer + 1;
    	}
    	return false;
    }

    /**
     * Entfernt alle Elemente aus der Liste.
     */
    public void clear() {
        // NOCH NICHT IMPLEMENTIERT!
    	head = null;
    }

    /**
     * @return Anzahl der Elemente in der Liste.
     */
    public int size() {
        // NOCH NICHT IMPLEMENTIERT!
    	IntNode p = head;
    	int groeﬂe = 0;
    	if (p == null){
    		return groeﬂe;
    	} else {
    		while (p != null){
    			p = p.next;
    			groeﬂe = groeﬂe + 1;
    		}
    		return groeﬂe;
    	}
    	//return 0;
    }

    /**
     * Gibt die Liste auf die Console aus.
     */
    public void print() {
        System.out.print("( ");
        IntNode p = head;
        while (p != null) {
            p.print();
            System.out.print(" ");
            p = p.next;
        }
        System.out.print(")");
    }

    public String toString() {
        // Anmerkung: StringBuffer w√§re die bessere L√∂sung. Egal.
        String text = "";
        IntNode p = head;
        while (p != null) {
            text += p.toString() + " ";
            p = p.next;
        }
        return text;
    }
}
