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
				System.out.println("Harf Almak Ýstiyormusun e/h");
				StringBuilder sb = new StringBuilder(dummy);
				String harfAlayým = sc.nextLine();
				if (harfAlayým.equalsIgnoreCase("h")) {
					System.out.println("10 saniyelik süreniz baþladý:");
					Thread.sleep(5000);
					System.out.println("cevabýnýz:");
					String cevap=sc.nextLine();
					System.out.println("süre doldu");
					System.out.println("cevap:"+answers(i));
					break;
				}else if (harfAlayým.equalsIgnoreCase("e")) {
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
		answers[3] = "Þasi";
		answers[4] = "bakýr";
		answers[5] = "cübbe";
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
		questions[1] = "Gökyüzü rengi nedir?";
		questions[2] = "Garson Kalfasý";
		questions[3] = "Motorlu taþýt iskeleti";
		questions[4] = "Madeni para, kablolar,cezve yapýmýnda kullanýlýr.";
		questions[5] = "Yargýç, papaz gibi görevlilerin giydiði kýyafet";
		questions[6] = "Bateri, kalp atýþý, davul vb. çýkan düzenli ses";
		questions[7] = "Tekerlek, duvar kaðýdý, kara kalem çalýþmasý gibi durumlarda ortaya çýkan resim";
		questions[8] = "Anchorman olarakta adlandýrýlýr,haber sunar.";
		questions[9] = "Nane,mendil,polo þekerden yayýlan ferahlatýcý koku";
		questions[10] = "Dindar insanlarýn dini vecibelerini yerine getirdiði ödev";
		questions[11] = "ülkemizin baþkenti";
		questions[12] = "Önceden endülüs olarak bilinen ülkenin günümüzdeki ismi";
		questions[13] = "Ýtalya sýnýrlarý içinde bulunan Papanýnda yaþadýðý ayrý bir ülke";
		questions[14] = "Satürn,Venüz,Marsa verilen ad";
		questions[15] = "Gemilerin yan yatmýþ veya ters dönmüþ hali";

		return questions[i];

	}

}
