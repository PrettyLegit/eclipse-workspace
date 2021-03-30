import java.util.List;

public class HelperClass implements Runnable {
	private List<String> words;

    public HelperClass(List<String> words) {
        this.words = words;
    }

    //function which replaces <>
    public static void ReplaceHTML(List<String> tws1) {

        /* Write your logic to replace the tags and print the text here */
    	System.out.println("Replacing html");
    	
    	for(int i = 0; i < tws1.size(); i ++) {
    		System.out.println(tws1.get(i));
    		
    		String temp = tws1.get(i);
    		if(temp.contentEquals("<")){
    			
    		}
    	}
    	
    }

	@Override
	public void run() {
		HelperClass.ReplaceHTML(this.words);
	}
}
