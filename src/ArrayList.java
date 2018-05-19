//Q5.a
public class ArrayList {
public static void main(String[] args) {
	java.util.ArrayList<String> name = new java.util.ArrayList<String>();

	System.out.println("initial size"+name.size());
	name.add("Apple");
	name.add("Banana");
	name.add("orange");
	name.add("boy");
	System.out.println("new size"+name.size());
	
	boolean blnfound = name.contains("Apple");
	System.out.println("Does array list contain 2?"+blnfound);
	java.util.ListIterator<String> iter1 = name.listIterator();
	
	while(iter1.hasNext()) {
		System.out.println(iter1.next());
	}
	System.out.println();
	java.util.ListIterator<String> iter2 = name.listIterator();
	while(iter2.hasPrevious());
	{
		System.out.println(iter2.previous());
	}
	
}
}
