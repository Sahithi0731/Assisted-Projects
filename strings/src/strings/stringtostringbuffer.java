package strings;

public class stringtostringbuffer {
	public static void main(String[] args) {
		String str1 = "mphasis";
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		String str2 = "simplylearn";
		sb.append(str2);
		String str3 = "java";
		sb.append("\n"+str3);
		System.out.println("String to stringbuffer" +"using append() method:\n\n"+sb);
	}

}
