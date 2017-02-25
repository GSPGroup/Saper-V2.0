package logic;

import java.util.Scanner;

import fxml.GeneratedFXML;

public class CreateField {

	private static int i = 0;
	private static int j = 0;
	public static int[][] pole = new int[GeneratedFXML.x][GeneratedFXML.y];
	public static Scanner SC = new Scanner(System.in);
	private static boolean isRun = true;
	private static boolean boom = false;

	public void createFieldForForm() {
		makeBombs(pole);
		makeNumbers(pole);
	}

	private static int[] random() { // ïåâåðòàº X ³ Y ðàíäîìíî
		int[] arr = new int[2];
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		arr[0] = x;
		arr[1] = y;
		return arr;
	}

	private static void makeBombs(int[][] pole) {// ðîçñòàâëÿºì áîìáè
		for (int i = 0; i < 10; i++) {// amount of bombs має бути також змінною
			int[] arr = new int[2];
			boolean perevirka = true;
			while (perevirka) {
				arr = random();
				int x = arr[0];
				int y = arr[1];
				if (pole[x][y] == 0) {
					pole[x][y] = -1; // ставить -1 в матрицю тойсть бомба
					perevirka = false;
				}
			}
		}
	}

	private static void makeNumbers(int[][] pole) {// ðîçñòàâëÿºì öèôðè êðóãîì
		// áîìá
		for (int i = 0; i < pole.length; i++) {
			for (int j = 0; j < pole.length; j++) {
				if (pole[i][j] == -1) {

					if ((i - 1 >= 0) && (j - 1 >= 0)) {// 1
						if (pole[i - 1][j - 1] != -1) {
							pole[i - 1][j - 1] += 1;
						}
					}
					if (i - 1 >= 0) {// 2
						if (pole[i - 1][j] != -1) {
							pole[i - 1][j] += 1;
						}
					}
					if ((i - 1 >= 0) && (j + 1 <= 9)) {// 3
						if (pole[i - 1][j + 1] != -1) {
							pole[i - 1][j + 1] += 1;
						}
					}
					if (j + 1 <= 9) {// 4
						if (pole[i][j + 1] != -1) {
							pole[i][j + 1] += 1;
						}
					}
					if ((i + 1 <= 9) && (j + 1 <= 9)) {// 5
						if (pole[i + 1][j + 1] != -1) {
							pole[i + 1][j + 1] += 1;
						}
					}
					if (i + 1 <= 9) {// 6
						if (pole[i + 1][j] != -1) {
							pole[i + 1][j] += 1;
						}
					}
					if ((i + 1 <= 9) && (j - 1 >= 0)) {// 7
						if (pole[i + 1][j - 1] != -1) {
							pole[i + 1][j - 1] += 1;
						}
					}
					if (j - 1 >= 0) {// 8
						if (pole[i][j - 1] != -1) {
							pole[i][j - 1] += 1;
						}
					}
				}
			}
		}
	}
	
	public static boolean isRunGame(int[][] pole, boolean boom) {
		isRun = true;
		int count = 0;
		if (boom == true) {
			isRun = false;
		} else {
			for (int i = 0; i < pole.length; i++) {
				for (int j = 0; j < pole.length; j++) {
					if ((pole[i][j] == -1) || (pole[i][j] > 9)) {
						count += 1;
					}
				}
			}
			if (count == GeneratedFXML.button) {
				isRun = false;
			}
		}
		System.out.println(count);
		return isRun;
	}
}