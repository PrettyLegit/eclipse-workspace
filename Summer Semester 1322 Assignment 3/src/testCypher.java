
public class testCypher {
	
	public static void main(String[] args) {
		
		String userInput1 = "Hello World!";
		String userInput2 = "Attack at Dawn";
		
		Cypher c0 = new Cypher();
		Cypher c1 = new Cypher(userInput1);
		Cypher c2 = new Cypher(userInput2);
		
		c0.cypherMethod();
		c0.revereseMethod();
		c1.cypherMethod();
		c1.revereseMethod();
		c2.cypherMethod();
		c2.revereseMethod();
		
		System.out.println(c0.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}
