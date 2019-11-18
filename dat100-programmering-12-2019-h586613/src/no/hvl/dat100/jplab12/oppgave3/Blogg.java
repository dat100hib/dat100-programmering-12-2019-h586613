package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;


public class Blogg {

	private Innlegg[] samling;
	private int nesteledig;

	public Blogg() {
		this.samling = new Innlegg[20];
		this.nesteledig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.samling = new Innlegg[lengde];
		this.nesteledig = 0;
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return samling;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
			if(samling[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg) == -1) {
			return false;
		}
		return true;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		int i = 0;
		boolean x = false;
		int t = samling.length;
		
		while(i<t) {
			if(samling[i] == null){
				nesteledig = i;
				t = i;
				x = true;
			}
			
		}
		
		return x;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!ledigPlass() || finnes(innlegg)) {
			return false;
		}
		else {
			samling[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}

		//throw new UnsupportedOperationException(TODO.method());
	}
	@Override
	public String toString() {
		String innleggstr = Integer.toString(nesteledig) + "\n";
		for(int i = 0; i < nesteledig; i++) {
			innleggstr += samling[i].toString();
		}
		return innleggstr;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}