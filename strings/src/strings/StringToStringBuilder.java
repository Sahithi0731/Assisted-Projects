package strings;

public class StringToStringBuilder {
	public static void main(String args[]) {
		String strs[]= {"mphasis", "simplylearn", "java", "strings", "stringbuilders"};
		StringBuilder sb = new StringBuilder();
		sb.append(strs[0]);
		sb.append(" "+strs[1]);
		sb.append(" "+strs[2]);
		sb.append(" "+strs[3]);
		sb.append(" "+strs[4]);
		System.out.println(sb.toString());
	}

}
