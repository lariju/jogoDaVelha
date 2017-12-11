/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 20141D12GR0149
 */
public class Tabuleiro {
    String tab [][] = new String[3][3];
    public void construir(){
        
                tab[0][0] = "1";
 		tab[0][1] = "2";
 		tab[0][2] = "3";
 
 		tab[1][0] = "4";
 		tab[1][1] = "5";
 		tab[1][2] = "6";
 
 		tab[2][0] = "7";
 		tab[2][1] = "8";
 		tab[2][2] = "9";
    }
     
     public String mostrarPosicoes(){
		for(int i=0; i<tab.length; i++){
			for (int j=0; j<tab.length; j++) {
				System.out.printf("  "+tab[i][j]);
			}
			System.out.println("\n");
		}
		return null;
	}
}
