package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		//To for løkker, ene teller rad andre teller kolonne
		//printer ut alle verdiene på en rad, og så println
		
		for (int rad=0; rad<matrise.length; rad++) {
			for (int kol=0; kol<matrise[rad].length; kol++) {
				System.out.print(matrise[rad] [kol] + " ");
			}
			System.out.println();
		}
		}
		

	// b)
	public static String tilStreng(int[][] matrise) {

		//Bruker lignende metode som for tabell, men med to for løkker
		
		String streng= ("");
		
		for (int rad=0; rad<matrise.length; rad++) {
			for ( int kol=0; kol<matrise[rad].length; kol++) {
				streng += (matrise[rad][kol] + " ");
			}
			
			streng += ("\n");
		}
			
			return streng;	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		//Oprette matrise like stor som parameter(matrise)
		//Gå igjennom hver rad for hver kolonne, multiplisere med (tall) hver gang
		
		int [][]mat2 = new int[matrise.length][matrise[0].length];
		
		for (int rad=0; rad<mat2.length; rad++) {
			for ( int kol=0; kol<mat2[rad].length; kol++) {
				
				mat2 [rad][kol] = (matrise [rad][kol]) * tall;
			}
			}
		
	return mat2;
	
	}
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		//boolean lik=false, to for løkker som sjekker rad og kolonne
		//sjekke om antall rader er like, hvis ikke lik=false
		//sjekke om antall kolonner er like hvis ikke lik=false 
		//Dersom kolonner er like, sjekke om indeks[rad][kol] har lik verdi for a og b, hvis ikke lik=false
		
		int rada, kola, radb, kolb;
		boolean lik = true;
		
		rada = a.length;
		kola = a[0].length;
		radb = b.length;
		kolb= b[0].length;
		
		if (rada != radb || kola !=kolb)
			lik = false;
		
		else {
			for (int rad= 0; rad < rada; rad++) {
				for(int kol= 0; kol < kola; kol++) {
					if (a[rad][kol] != b[rad][kol]) {
						lik = false;
						break;
					}
				}
			}
		}
			
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// Ny matrise kopi av parameter, dobbel for løkke for å kopiere element
		// Ny matrise speil, skal henvise til kopimatrisen med to for løkker
		// Skal sette verdi for speil[a][b] = kopi[a][b]
		
		int [][]kopi = new int[matrise.length][matrise[0].length];
		
		for (int rad=0; rad<kopi.length; rad++) {
			for (int kol=0; kol<kopi[rad].length; kol++) {
				
				kopi[rad][kol] = matrise[rad][kol];
			}
		}
		
		int [][]speil = new int[kopi.length][kopi[0].length];
		
		for (int rad=0; rad<speil.length; rad++) {
			for (int kol=0; kol<speil[rad].length; kol++) {
				
				speil[rad][kol] = kopi[kol][rad];
		
			}
		}
		
		return speil;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		throw new UnsupportedOperationException("multipliser ikke implementert");
		
		}
}