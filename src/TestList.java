//import java.util.Iterator;
//import java.util.LinkedList;
import java.util.*;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 = "Testdhjfdfjdf";
		String b = "Testjsndsdsdshdlsahdlkd";
		
//		b.toUpperCase();
	//	b.substring(5)
		System.out.println(b.substring(5));
		
	   if (b.equalsIgnoreCase(a1))
	   {
		   System.out.println("pass");
	   }
		
		LinkedList<String>  l1 = new  LinkedList<String>();
		ArrayList l2 = new ArrayList();
		ListIterator<String> a = l1.listIterator();
		l1.add("a");
		l1.add("a");
		l1.add("an");
		l1.add("ab");
		l1.add("am");
		l1.add("a");
		l1.add("ak");
		l1.add("a");
		l1.add("aj");
		l1.add("a");
		l1.add("ap");
		while(a.hasNext())
		{
		//	String elem = a.next();
		//	System.out.println(elem);
		}
//		System.out.println(l1.removeFirst());
	//	System.out.println(l1.getFirst());
		

	}

}
