



package akasztofa_hazi;
import java.util.Scanner;

public class Akasztofa_hazi {

    
    public static void main(String[] args) {
       

		Scanner scanner = new Scanner(System.in);

		System.out.println("Akasztófa játék");
                System.out.println("Csak a betük keresése a fontos, szóval a játék automatikusan leírja majd a számokat.");
                
                boolean ujra = true;
                do {
            
                     
		System.out.println("Írja be a szót amit szeretne, hogy mások kitaláljanak.");
                System.out.println("Összesen 12 hibát lehet véteni.");
                
                
		String szo = scanner.nextLine();
		szo = szo.trim();
		szo = szo.replaceAll(" ", "  ");
		szo = szo.toUpperCase();
		String jatekszo = szo.replaceAll("[A-Z]", "_ ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("Indulhat a játék:");

		int hiba = 0;
		String tipp;
		char karakter;
		boolean tobbszoritipp;
		String tippek = "";
		boolean sikerestipp;

		while (hiba < 12 && jatekszo.contains("_")) {

			System.out.println(jatekszo);
			System.out.print("\n");
			System.out.println("Eddig: " + hiba + " hibád van");
			System.out.print("\n");
			if (hiba == 1) { 
                                System.out.println("                     ");
                                System.out.println("                     ");
                                System.out.println("                     ");
                                System.out.println("                     ");
                                System.out.println("                     ");
                                System.out.println("         ____________");
                                System.out.print("\n");
			} else if (hiba == 2) { 
				System.out.println("                     ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			} else if (hiba == 3) { 
				System.out.println("         ____________");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			} else if (hiba == 4) { 
				System.out.println("         ____________");
                                System.out.println("        |/           ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 5) { 
				System.out.println("         ____________");
                                System.out.println("        |/      |    ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 6) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/   ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 7) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/   ");
                                System.out.println("        |      O     ");
                                System.out.println("        |            ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 8) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/   ");
                                System.out.println("        |      O     ");
                                System.out.println("        |      |     ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 9) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/    ");
                                System.out.println("        |      O     ");
                                System.out.println("        |     /|     ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 10) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/    ");
                                System.out.println("        |      O     ");
                                System.out.println("        |     /|\\   ");
                                System.out.println("        |            ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}else if (hiba == 11) { 
				System.out.println("         ____________");
                                System.out.println("        |/    \\|/    ");
                                System.out.println("        |      O     ");
                                System.out.println("        |     /|\\   ");
                                System.out.println("        |     /      ");
                                System.out.println("        |____________");
                                System.out.print("\n");
			}
                        

			System.out.println("Írj be egy betűt");
			tipp = scanner.nextLine(); 
			tipp = tipp.toUpperCase(); 
			karakter = tipp.charAt(0); 

			tobbszoritipp = (tippek.indexOf(karakter)) != -1;
			tippek += karakter; 

			karakter = Character.toUpperCase(karakter);
			System.out.print("\n");
			if (tobbszoritipp == true) { 
				System.out.println("Ezt a betüt már próbáltad egyszer " + karakter + ".");
				System.out.print("\n");
				if (hiba > 0) { 
					hiba--;
				} 

			} 

			sikerestipp = (szo.indexOf(karakter)) != -1;
			if (sikerestipp == true) { 
				System.out.println(karakter + " benne van a szóban");
				System.out.print("\n");
				for (int position = 0; position < szo.length(); position++) { 
					if (szo.charAt(position) == karakter && jatekszo.charAt(position) != karakter) {
						jatekszo = jatekszo.replaceAll("_ ", "_");
						String kiegeszitettszo;
						kiegeszitettszo = jatekszo.substring(0, position) + karakter + jatekszo.substring(position + 1);
						kiegeszitettszo = kiegeszitettszo.replaceAll("_", "_ ");
						jatekszo = kiegeszitettszo;
					} 
				} 
			} else { 
				System.out.print("\n");
				System.out.println(karakter + " nincs benne a szóban"); 
				System.out.print("\n");
				hiba++; 
			}
		} 

		if (hiba == 12) {
			System.out.println("         ____________");
			System.out.println("        |/    \\|/    ");
			System.out.println("        |      O     ");
			System.out.println("        |     /|\\   ");
			System.out.println("        |     / \\   ");
			System.out.println("        |____________");
			System.out.print("\n");
			System.out.println("Elérted a maximális hibahatárt. A játéknak vége.");
                        System.out.println("\n\n");
		} else {

			System.out.println("A keresett szó:");
			System.out.println(jatekszo);
			System.out.println("Nyertél!");
                        System.out.println("\n\n");
		}
                System.out.println("Ha nem akarsz többet játszani írd be a 'nem' szót. ");
                String ismetles = scanner.nextLine();
                if (ismetles == "nem")
                    ujra = false;
                else   
                    ujra = true;
        } while (ujra);
        
               scanner.close();  
	}
    }
    

    