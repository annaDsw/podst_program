package com.example.learn;

import com.example.learn.semester1.listTwo.AplikacjaOsoba5;
import com.example.learn.semester1.listTwo.Osoba;
import com.example.learn.semester2.list1.Ciężarówka;
import com.example.learn.semester2.list1.Gąsienicowe;
import com.example.learn.semester2.list1.Kołowe;
import com.example.learn.semester2.list1.Szynowe;

public class LearnApplication {

	public static void main(String[] args) {
		/*AplikacjaOsoba5 appOsoba = new AplikacjaOsoba5();
		Osoba osoba1 = new Osoba(95228L, "Ania", "Nowak", 29, "adres1", 1);
		Osoba osoba2 = new Osoba(4355L, "Asia", "Nikt", 22, "adres2", 2);
		appOsoba.zarejestruj(osoba1);
		appOsoba.dodajDoKolejki(osoba1);
		appOsoba.dodajDoKolejki(osoba2);
		appOsoba.wywolajNastepnaOsobeIUsunZKolejki();*/
		Kołowe kołowe = new Kołowe();
		kołowe.uruchomSilnik("benzynowy");
	}
}
