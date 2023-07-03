package in.co.rays;

public class stringmethod {
	public static void main(String[] args) {
		String name = "sushmita sen";
		
		System.out.println("str length" + name.length());
		System.out.println("7th char is" + name.charAt(8));
		System.out.println("shiv index is" + name.indexOf("shiv"));
		System.out.println("first Position" + name.indexOf("i"));
		System.out.println("last position" + name.indexOf("v"));
		System.out.println("a is replaced by b" + name.replace("a", "b"));
		System.out.println("chotashiv" + name.toUpperCase());
		System.out.println("badanamdev" +name.toLowerCase());
		System.out.println("StartWith" +name.startsWith("namdev"));
		System.out.println("endswith" +name.endsWith("shiv"));
		System.out.println("substring" +name.substring(6));
		
	} 

}
