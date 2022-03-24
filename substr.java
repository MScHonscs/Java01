public class substr {
	
	public static void main (String[] args) {
		
		String str = new String("The quick brown fox jumps over the lazy dog."); 
		String replace = "fox";
		String replaceWith = "cat";
		int position = 0;
		
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i) == replace.charAt(0))
				position = i;
			
		}
		
		String newstr = str.substring(0, position) + replaceWith + str.substring(position+replaceWith.length(), str.length());
		
		System.out.println(newstr);
		
	}
	
}