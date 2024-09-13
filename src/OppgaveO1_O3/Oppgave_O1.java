package OppgaveO1_O3;

public class Oppgave_O1 extends javax.swing.JOptionPane {

		public static void main (String []args) {
			
			
		 for (int i=1; i<=10; i++) {
			 int tallKar = -1;
			 
			 while(tallKar <0|| tallKar > 100) {
				 String karTxt = showInputDialog("Poengsum");
				 tallKar = Integer.parseInt(karTxt);
					System.out.print("Studentnr "+ i + ": ");
					
				 
			 if (tallKar >101 || tallKar < 0) {
				 System.out.println("Ugyldig sum, skriv på nytt");
			 }
		 }
			 
		if (tallKar >= 90 && tallKar <= 100) {
	         System.out.println("A");
	     } else if (tallKar >= 80 && tallKar < 90) {
	         System.out.println("B");
	     } else if (tallKar >= 60 && tallKar < 80) {
	         System.out.println("C");
	     } else if (tallKar >= 50 && tallKar < 60) {
	         System.out.println("D");
	     } else if (tallKar >= 40 && tallKar < 50) {
	         System.out.println("E");
	     } else if (tallKar >= 0 && tallKar < 40) {
	         System.out.println("F");
	     } 
	     	
		}
	}
}
