package Questao_04;

import java.util.Scanner;

public class Startapp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		
		lerRetangulo();
	}
	 public static void lerRetangulo() {
		 Retangulo ret = new Retangulo();
		 System.out.println("Qual o inicio do X?");
		 ret.xIni = sc.nextInt();
		 System.out.println("Qual o fim do X?");
		 ret.xFim = sc.nextInt();
		 System.out.println("Qual o inicio do Y?");
		 ret.yIni = sc.nextInt();
		 System.out.println("Qual o fim do Y?");
		 ret.yFim = sc.nextInt();
	 }
}
