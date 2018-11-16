package util;

import java.util.Scanner;


public class LecturaDatos {
		public static String leerString() {
			return new Scanner(System.in).nextLine();
		}

		public static int leerInteger() {
			return new Scanner(System.in).nextInt();
		}

		public static String leerString(String msg) {
			System.out.println(msg);
			return leerString();
		}

		public static int leerInteger(String msg) {
			System.out.print(msg);
			return LecturaDatos.leerInteger();
		}

	}


