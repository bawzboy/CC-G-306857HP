package thema6.rekursion.uebungen;

public class StringUmkehren {

	public static void main(String[] args) {
		String original = "Hallo";
		String umgekehrt = umkehrenString(original);

		System.out.println("Der umgekehrte String ist: " + umgekehrt);
	}

	public static String umkehrenString(String str) {
		if (str.isEmpty()) {
			return "";
		}

		System.out.println("str: " + str + ", str.substring(1): " + str.substring(1) + ", str.charAt(0): "
				+ str.charAt(0) + ", str.substring(1)) + str.charAt(0): " + str.substring(1) + str.charAt(0));

		return umkehrenString(str.substring(1)) + str.charAt(0);
	}

}
