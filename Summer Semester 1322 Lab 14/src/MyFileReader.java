import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
	//Reads a file and stores the contents in a list
    public static ArrayList<String> ScanList(Scanner s) {
    	ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		return list;
    }

    //Splits the contents of a list into two
    public static <String> List[] split(List<String> list)
	{
		
		List<String> first = new ArrayList();
		List<String> second = new ArrayList();

		int size = list.size();

		for (int i = 0; i < size; i++)
		{
			if (i < (size + 1)/2)
				first.add(list.get(i));
			else
				second.add(list.get(i));
		}

		return new List[] {first, second};
	}
}
