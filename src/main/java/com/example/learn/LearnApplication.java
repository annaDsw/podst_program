package com.example.learn;

import com.example.learn.listTwo.AplikacjaOsoba5;
import com.example.learn.listTwo.Osoba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class LearnApplication {

	public static void main(String[] args) {
		AplikacjaOsoba5 appOsoba = new AplikacjaOsoba5();
		Osoba osoba1 = new Osoba(95228L, "Ania", "Nowak", 29, "adres1", 1);
		Osoba osoba2 = new Osoba(4355L, "Asia", "Nikt", 22, "adres2", 2);
		appOsoba.zarejestruj(osoba1);
		appOsoba.dodajDoKolejki(osoba1);
		appOsoba.dodajDoKolejki(osoba2);
		appOsoba.wywolajNastepnaOsobeIUsunZKolejki();
	}
}
