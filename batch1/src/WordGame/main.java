package WordGame;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("----Welcome to the WordGame----");
		for (int i = 1; i < 5; i++) {
			System.out.println("soru " + questions(i));
			String dummy = "-".repeat(answers(i).length());
			Scanner sc = new Scanner(System.in);
			Random rn = new Random();
			System.out.println(dummy);
			label1:
			while (true) {
				System.out.println("Harf Almak �stiyormusun e/h");
				StringBuilder sb = new StringBuilder(dummy);
				String harfAlay�m = sc.nextLine();
				if (harfAlay�m.equalsIgnoreCase("h")) {
					System.out.println("10 saniyelik s�reniz ba�lad�:");
					Thread.sleep(5000);
					System.out.println("cevab�n�z:");
					String cevap=sc.nextLine();
					System.out.println("s�re doldu");
					System.out.println("cevap:"+answers(i));
					break;
				}else if (harfAlay�m.equalsIgnoreCase("e")) {
					int hintNumber = rn.nextInt(answers(i).length()) + 0;
					while(sb.charAt(hintNumber)!='-') {
						hintNumber=rn.nextInt(answers(i).length())+0;
					}
					sb.setCharAt(hintNumber, answers(i).charAt(hintNumber));
					dummy = "" + sb;
					System.out.println(sb);
					if (dummy.equals(answers(i))) {
						
						break label1;
					}
				}
				
			}
		}
	}

	public static String answers(int i) {
		String[] answers = new String[16];
		answers[1] = "blue";
		answers[2] = "komi";
		answers[3] = "�asi";
		answers[4] = "bak�r";
		answers[5] = "c�bbe";
		answers[6] = "ritim";
		answers[7] = "desen";
		answers[8] = "sunucu";
		answers[9] = "mentol";
		answers[10] = "ibadet";
		answers[11] = "Ankara";
		answers[12] = "ispanya";
		answers[13] = "vatikan";
		answers[14] = "gezegen";
		answers[15] = "Alabora";
		return answers[i];

	}

	public static String questions(int i) {

		String[] questions = new String[16];
		questions[1] = "G�ky�z� rengi nedir?";
		questions[2] = "Garson Kalfas�";
		questions[3] = "Motorlu ta��t iskeleti";
		questions[4] = "Madeni para, kablolar,cezve yap�m�nda kullan�l�r.";
		questions[5] = "Yarg��, papaz gibi g�revlilerin giydi�i k�yafet";
		questions[6] = "Bateri, kalp at���, davul vb. ��kan d�zenli ses";
		questions[7] = "Tekerlek, duvar ka��d�, kara kalem �al��mas� gibi durumlarda ortaya ��kan resim";
		questions[8] = "Anchorman olarakta adland�r�l�r,haber sunar.";
		questions[9] = "Nane,mendil,polo �ekerden yay�lan ferahlat�c� koku";
		questions[10] = "Dindar insanlar�n dini vecibelerini yerine getirdi�i �dev";
		questions[11] = "�lkemizin ba�kenti";
		questions[12] = "�nceden end�l�s olarak bilinen �lkenin g�n�m�zdeki ismi";
		questions[13] = "�talya s�n�rlar� i�inde bulunan Papan�nda ya�ad��� ayr� bir �lke";
		questions[14] = "Sat�rn,Ven�z,Marsa verilen ad";
		questions[15] = "Gemilerin yan yatm�� veya ters d�nm�� hali";

		return questions[i];

	}

}
