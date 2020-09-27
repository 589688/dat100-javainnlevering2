package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// Metode som kan skrive ut en tabell meg heltall
					// for løkke der i=indeks i tabellen, og skriver ut verdi for hver i
					
				for (int i=0; i<tabell.length; i++) 
						System.out.print(tabell[i] + " ");
						System.out.println();

	}

	// b)
	public static String tilStreng(int[] tabell) {

		//Starte strengen med "[" , avslutte med "]"
				//Bygger strengen ved å legge til tab[indeks] og et komma ","
				//For tab[idneks] -1 (siste tall vi legger til), legg til uten komma
				
				String streng= ("[");
				
				for (int i=0; i<tabell.length; i++) {
					
					if (i == tabell.length -1)
						streng += (tabell[i]);
					
					else streng += (tabell[i] + ",");
				}
					streng += ("]");
					
					return streng;
	}

	// c)
	public static int summer(int[] tabell) {

		//Med while løkke:
		//int sum=0;
		//int i=0;
		//while (i<tabell.length) {
		//sum += tabell[i];
		//i++; }
		//return sum;
	
		//Med utvida for-løkke:
		//int sum=0;
		//for (int i : tabell) {
		//sum +=i; }
		//return sum;
		
		//Med vanlig for-løkke
		int sum= 0;
		
		for (int i =0; i<tabell.length;i++) {
			sum += tabell[i];
		}
			return sum;
			
		}
	
		
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// Sette funnet til false, while (false) fortsette til neste tabell[indeks]
		// If tabell[indeks] = tall, funnet = true
		// return funnet
		
		boolean funnet = false;
		int i=0;	
		
		while (!funnet && i<tabell.length) {
			
				if (tabell[i] == tall) {
					funnet= true;
				}
				
				i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		//while løkke som for hver indeks sjekker om [i] == tall
		//endrer verdi til i dersom sann, hvis ikke beholder verdien = -1
		
		int verdi = -1;
		int i =0;
		
		while (i<tabell.length && verdi != i) {
			
			if (tabell[i] == tall) {
				verdi = i; }
			i++; }
		
			return verdi;
			}
		

	// f)
	public static int[] reverser(int[] tabell) {

		//For løkke, to variable, den ene teller opp den andre end
		//for indeks 0 i ny tabell settes indeks[tabell.length-1]
		
		int []nyTab = new int[tabell.length];
		
		for (int i= 0, j= tabell.length-1; i<tabell.length && j>=0; i++, j--) {
			
			nyTab[j] = tabell[i];
		}
		return nyTab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		//boolean variabel sort=true
		//sjekke om [i] er mindre enn [i+1], sort=false dersom den ikke er det
		//å sjekke for siste indeks vil være out of bounds, så i må være mindre en tablength -1
		
		boolean sort = true;
		
		for (int i=0; i<tabell.length - 1; i++) {
			if (tabell[i] > tabell[i +1])
				sort = false;
		}
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		//Opprette ny tabell med like mange element som de to tabellene tilsammen
		//En for løkke som setter inn indeks i fra tab1 til indeks i hos tabny
		//En for løkkge som setter inn indeks i fra tab2 til indeks [i + tab1.length] hos tabny
		
		int []tabellNy = new int[tabell1.length + tabell2.length];
		
			for (int i= 0; i< tabell1.length; i++) {
				tabellNy[i] = tabell1[i];
				}
				
				for (int j= 0; j< tabell2.length; j++) {
					tabellNy[j + tabell1.length] = tabell2[j];
				}
			return tabellNy;
		}
	
}
