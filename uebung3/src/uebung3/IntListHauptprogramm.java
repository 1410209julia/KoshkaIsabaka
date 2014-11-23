package uebung3;

public class IntListHauptprogramm {

	public static void main(String[] args) {
		//IntList list = new IntList(2);
		IntList list = new IntList();
		//IntNode node = new IntNode();
		
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");
		System.out.print("S:" + list.size() + " ");
		list.print();
		list.addFirst(3);
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");
		System.out.print("S:" + list.size() + " ");
		list.addFirst(1);
		list.addFirst(8);
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");
		System.out.print("S:" + list.size() + " ");
		list.addLast(5);
		list.print();
		//list.clear();
		System.out.print(list.isEmpty() + " ");
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");
		System.out.print("S:" + list.size() + " ");
		System.out.print("R:" + list.removeFirst() + " ");
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");
		System.out.print("S:" + list.size() + " ");
		list.addFirst(8);
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");	
		System.out.print("S:" + list.size() + " ");
		System.out.print("R:" + list.removeLast() + " ");
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");	
		System.out.print("S:" + list.size() + " ");
		
		//neue Zeile (2)
		System.out.println();
		list.addLast(5);
		list.print();
		System.out.print("F:" + list.getFirst() + " ");
		System.out.print("L:" + list.getLast() + " ");	
		System.out.print("S:" + list.size() + " ");
		
		System.out.print("G1:" + list.getAt(1) + " ");
		System.out.print("G2:" + list.getAt(2) + " ");
		System.out.print("G3:" + list.getAt(3) + " ");
		System.out.print("G4:" + list.getAt(4) + " ");
		System.out.print("G5:" + list.getAt(5) + " ");
		System.out.print("G-6:" + list.getAt(-6) + " ");
		System.out.print("G0:" + list.getAt(0) + " ");
		
		//neue Zeile (3)
		System.out.println();
		list.setAt(5, 2);	//ACHTUNG: hier Test, Liste hat nur 4 Elemente
		list.setAt(4, 4);	//5 wird an Position 4 durch 4 ersetzt
		list.setAt(-5, 2);	//ACHTUNG: hier Test, neg. Wert darf nicht angemommen werden
		list.setAt(0, 10);	//ACHTUNG: hier Test, auch darf nicht angenommen werden
		list.setAt(3, 8);	//3 wird an Position 3 durch 8 ersetzt
		list.setAt(2, 6);	//1 wird an Position 2 durch 6 ersetzt
		list.setAt(1, 1);	//8 wird an Position 1 durch 1 ersetzt		
		list.print();
		
		//neue Zeile (4)
		System.out.println();
		System.out.print("C-1:" + list.contains(-1) + " ");
		System.out.print("C0:" + list.contains(0) + " ");
		System.out.print("C1:" + list.contains(1) + " ");
		System.out.print("C2:" + list.contains(2) + " ");
		System.out.print("C6:" + list.contains(6) + " ");
		System.out.print("C8:" + list.contains(8) + " ");
		System.out.print("C9:" + list.contains(9) + " ");
		System.out.print("C4:" + list.contains(4) + " ");
		list.print();
		
		//neue Zeile (5)
		System.out.println();
		System.out.print("R-1:" + list.removeAt(-1) + " ");
		System.out.print("R0:" + list.removeAt(0) + " ");
		list.print();
		System.out.print("R3:" + list.removeAt(3) + " ");
		list.print();
		System.out.print("R2:" + list.removeAt(2) + " ");
		list.print();
		System.out.print("R2:" + list.removeAt(2) + " ");
		list.print();
		System.out.print("R1:" + list.removeAt(1) + " ");
		list.print();
		
		//neue Zeile (6)
		System.out.println();
		list.addFirst(1);
		list.addLast(6);
		list.addLast(8);
		list.addLast(4);
		System.out.print("Liste1: ");
		list.print();
		IntList list2 = new IntList();
		list2.addFirst(7);
		list2.addLast(9);
		list2.addLast(3);
		list2.addLast(5);
		System.out.print(", Liste2: ");
		list2.print();
		list.concat(list2);
		System.out.print("--> Liste1: ");
		list.print();
		IntList list3 = new IntList(10);
		System.out.print(", Liste3: ");
		list3.print();
		list.concat(list3);
		System.out.print("--> Liste1: ");
		list.print();
		System.out.print(", Liste2: ");
		list2.print();
		System.out.print(", Liste3: ");
		list3.print();
		
		//neue Zeile (7)
		System.out.println();
		IntList listschnitt = new IntList(10);
		listschnitt.addFirst(7);
		listschnitt.addFirst(6);
		listschnitt.addFirst(9);
		listschnitt.addFirst(1);
		listschnitt.addFirst(20);
		listschnitt.addFirst(2);
		listschnitt.addFirst(14);
		list.addFirst(10);
		System.out.print("Liste1: ");
		list.print();
		System.out.print(", Liste die geschnitten wird: ");
		listschnitt.print();
		list.intersectList(listschnitt);
		System.out.print("--> Liste1: ");
		list.print();
		System.out.print(", Liste die geschnitten wurde: ");
		listschnitt.print();
		
		//neue Zeile (8)
		System.out.println();
		System.out.print("Liste1 Original: ");
		list.print();
		System.out.print(", Kopie von Liste1: ");
		IntList kopie = new IntList();
		kopie = list.deepCopy();
		kopie.print();
		//list.deepCopy().print();
		
		/*list.addFirst(3);
		list.addFirst(4);
		list.print();
		System.out.print(list.removeLast());
		list.print();
		System.out.print(list.removeLast());
		list.print();
		list.addLast(10);
		list.print();
		System.out.print(list.removeLast());
		list.print();*/
	}

}

