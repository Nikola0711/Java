package zadaci;

import javax.swing.JOptionPane;

public class Matrica {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		
				
		int redmax = a-1;
		
		int stupacmax = b-1;
		
		int redmin=0;
		
		int stupacmin=0;
		
		int br=1;
		
		int[][] matrica = new int [a][b];
		while(br<=a*b) {
			
		for(int i=stupacmax;i>=redmin;) {
			matrica[redmax][i--]=br++;
		}
		
		if(br>(a*b)) {
			break;
		}
		
		for(int i=redmax-1;i>=redmin;) {
			matrica[i--][stupacmin]=br++;
		}
		
		if(br>(a*b)) {
			break;
		}
		
		for(int i=stupacmin+1;i<=stupacmax;) {
			matrica[redmin][i++]=br++;
		}
		
		if(br>(a*b)) {
			break;
		}
		
		for(int i=redmin+1;i<=redmax-1;) {
			matrica[i++][stupacmax]=br++;
		}
		
		if(br>(a*b)) {
			break;
		}
		
		stupacmin++;
		
		redmin++;
		
		stupacmax--;
		
		redmax--;
		
		}
		
		for (int i = 0; i < a; i++)
			
	    {
			
	        for (int j = 0; j < b; j++)
	        	
	        {
	            System.out.print(matrica[i][j]+ "\t");
	        }
	         
	        System.out.println();
	    }
	}



}
