package hu.petrik.emberOOP;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Ember e1 = new Ember("Gipsz Jakab", "1988-1-12", "Budapest");
		Ember e2 = new Ember("Teszt Elek", "2003-12-5", "Debrecen");
		Ember e3 = new Ember("Kovács István", "1973-9-22", "Pécs");
		Ember e4 = new Ember("Lakatos József", "2005-7-15", "Veszprém");
		Ember e5 = new Ember("Jovács Dóra", "1999-12-31", "Miskolc");

		Ember[] emberTomb = new Ember[]{e1, e2, e3, e4, e5};
		Emberek ek = new Emberek(emberTomb);
		String fajlNev="emberek.txt";
		try {
			Emberek ek2 = new Emberek(fajlNev);
		} catch (FileNotFoundException e) {
			System.out.printf("a %s nem található\n",fajlNev);
		} catch (IOException e) {
			System.out.println("ismeretlen hiba történt");
		}
		System.out.println(ek);

		System.out.println(e1 + " " + e1.getSzuletesiEv());
		System.out.println(e2 + " " + e2.getSzuletesiHonap());
		System.out.println(e3 + " " + e3.getSzuletesiNap());
	}
}
