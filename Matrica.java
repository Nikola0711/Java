package zadaci;

import javax.swing.JOptionPane;

public class Matrica {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		
		
		
		int imaksimalno = a-1;
		
		int jmaksimalno = b-1;
		
		int iminimalno=0;
		
		int jminimalno=0;
		
		int br=1;
		
		int[][] m = new int [a][b];
		while(br<=a*b) {
			
		for(int i=jmaksimalno;i>=iminimalno;) {
			m[imaksimalno][i--]=br++;
		}
		if(br>(a*b)) {
			break;
		}
		for(int i=imaksimalno-1;i>=iminimalno;) {
			m[i--][jminimalno]=br++;
		}
		if(br>(a*b)) {
			break;
		}
		for(int i=jminimalno+1;i<=jmaksimalno;) {
			m[iminimalno][i++]=br++;
		}
		if(br>(a*b)) {
			break;
		}
		for(int i=iminimalno+1;i<=imaksimalno-1;) {
			m[i++][jmaksimalno]=br++;
		}
		if(br>(a*b)) {
			break;
		}
		jminimalno++;
		iminimalno++;
		jmaksimalno--;
		imaksimalno--;
		
		}
		
		for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < b; j++)
	        {
	            System.out.print(m[i][j]+ "\t");
	        }
	         
	        System.out.println();
	    }
	}



}
