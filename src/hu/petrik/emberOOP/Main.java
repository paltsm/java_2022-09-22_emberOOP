package hu.petrik.emberOOP;

public class Main {
	public static void main(String[] args) {
		Ember e1=new Ember("Gipsz Jakab","1988-1-12","Budapest");
		Ember e2=new Ember("Teszt Elek","2003-12-5","Debrecen");
		Ember e3=new Ember("Kovács István","1973-9-22","Pécs");

		System.out.println(e1 + " " + e1.getSzuletesiEv());
		System.out.println(e2+" "+e2.getSzuletesiHonap());
		System.out.println(e3+" "+e3.getSzuletesiNap());
	}
}
