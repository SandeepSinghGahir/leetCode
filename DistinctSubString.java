package prac;

/* Question : The input to the fucntion consist of two arguments - inputString representing the string written by the teacher on the board.
Output : Return a list of all substrings of inputString with K characters, that have K-1 distinct i.e exactly one character is repeated, or an empty list if no such substring exists in inputString. The order in which the substrings are returned doesn't matter.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctSubString {

	private List<String> subStringLessKDist(String inputString, int k) {
		List<String> distinctKminus1 = new ArrayList<String>();
		Map<Character, Integer> charactersOccurences = new HashMap<Character, Integer>();
		int i = 0;
		while (i + k <= inputString.length()) {
			String str = inputString.substring(i, i + k);
			charactersOccurences.clear();
			boolean isRepeat = false;
			for (char c : str.toCharArray()) {
				if (charactersOccurences.containsKey(c)) {
					if (!isRepeat)
						isRepeat = true;
					else {
						isRepeat = false;
						break;
					}
				} else
					charactersOccurences.put(c, 1);
			}
			if (isRepeat)
				distinctKminus1.add(str);
			i++;			
		}
		return distinctKminus1;
	}

	public static void main(String args[]) {
		DistinctSubString ds = new DistinctSubString();
		List<String> list = ds.subStringLessKDist("awaglk", 4);
		for (String items : list)
			System.out.println(items);
	}

}
