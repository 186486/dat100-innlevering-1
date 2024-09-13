package OppgaveO1_O3;

import javax.swing.JOptionPane;

public class Oppgave_O3 extends javax.swing.JOptionPane {

	
	public static void main (String[] args) {
		
		String inputNummer = showInputDialog("Hva vil du fakultere? (maks 20!)");
		 long faknummer = Integer.parseInt(inputNummer);	
		 if(faknummer > 0) {
			 long fakt =1;
			 
			for(int i=1; i<=faknummer; i++) {
				fakt=fakt*i;	
			} 
			System.out.println("Faktor av " + faknummer + " er " + fakt);	
			
		 }else{
				System.out.print("Sorry mac... Du må skrive et positivt heltall."); 
		 }	
	}
}
