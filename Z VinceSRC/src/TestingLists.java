
public class TestingLists {
	public static void main(String [] args) {
		
ArrayList1 arraylist = new ArrayList1();
		
		arraylist.AddLast(5);
		arraylist.AddLast(10);
		arraylist.AddLast(15);
		
		for(int i = 0; i < arraylist.length(); i++ ) {
			System.out.println("Value at ["+ i +"]: " + arraylist.Get(i));
		
		}
	
		arraylist.RemoveLast();
		arraylist.RemoveLast();
		arraylist.RemoveLast();
		
		for(int i = 0; i < arraylist.length(); i++ ) {
			System.out.println("Value at ["+ i +"]: " + arraylist.Get(i));
			
		}
		System.out.println("transition");
		//Part2:
		
		LinkedList1<Integer> linkedlist = new LinkedList1<Integer>();
		
		linkedlist.AddLast(5);
		linkedlist.AddLast(10);
		linkedlist.AddLast(15);
		
		for(int i = 0; i < linkedlist.Length(); i++ ) {
			System.out.println("Value at ["+ i +"]: " + linkedlist.Get(i));
			
		}
		
		linkedlist.RemoveLast();
		linkedlist.RemoveLast();
		
		for(int i = 0; i < linkedlist.Length(); i++ ) {
			System.out.println("Value at ["+ i +"]: " + linkedlist.Get(i));
			
		}
		
		
	}
	
	
}
