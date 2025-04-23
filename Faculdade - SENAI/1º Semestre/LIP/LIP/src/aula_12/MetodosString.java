package aula_12;

public class MetodosString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		System.out.println("original - |" + original + "|");
		System.out.println("toLowerCase() = |" + original.toLowerCase() + "|");
		System.out.println("toUpperCase() = |" + original.toUpperCase() + "|");
		System.out.println("trim() = |" + original.trim() + "|");
		System.out.println("substring(2) = |" + original.substring(2) + "|");
		System.out.println("substring(2,9) = |" + original.substring(2,9) + "|");
		System.out.println("replace('a', 'x') = |" + original.replace('a', 'x') + "|");
		System.out.println("replace(\"abc\", \"xy\") = |" + original.replace("abc", "xy") + "|");
		System.out.println("indexOf(\"bc\") = |" + original.indexOf("bc") + "|");
		System.out.println("lastIndexOf(\"bc\") = |" + original.lastIndexOf("bc") + "|");
	}

}
