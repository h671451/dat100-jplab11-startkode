package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;
 
public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;	
		}
	
	public String getBruker() {
		
		return this.bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	public int getLikes() {
		return this.likes;
	}
	
	public void doLike () {
		
		this.likes = this.likes+1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		
		int innlegg1 = innlegg.getId();
		int innlegg2 = innlegg.getId();

		
		if(innlegg1 == innlegg2) {
			return true;
			
		}else if (innlegg1 != innlegg2){
			
			return false;
		}
		
		return false;
		
		
		

	}
	
	@Override
	public String toString() {
		
		String str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
