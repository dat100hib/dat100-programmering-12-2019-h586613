package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;


public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		//throw new UnsupportedOperationException(TODO.method());
		
		PrintWriter writer = null;
		
		String message = "Skriving av fil lyktes.";
		String txt = samling.toString();
		
		boolean ok = false;
		
		try {
			writer = new PrintWriter(MAPPE + filnavn + ".txt");
			writer.println(txt);
			ok = true;
		}
		catch (FileNotFoundException e) {
			message = "Skriving av fil mislyktes.";
			System.out.println(MAPPE + filnavn + "txt.");
		}
		finally {
			
			if (writer != null) {
				writer.close();
				System.out.println(message); }
			}
			return ok;
		
		}
	
}
