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
public class Jogadas {
     public boolean validar(String p, Tabuleiro tab){
		for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
			if(tab.tab[i][j].equals(p)){
				return true;
			}
                    }	
		}
		return false;
	}
        
        public void fazerJogadaX(String p, Tabuleiro tab){
		if(p.equals("1")){
			tab.tab[0][0]="X";
		}
		else if(p.equals("2")){
			tab.tab[0][1]="X";
		}
		else if(p.equals("3")){
			tab.tab[0][2]="X";
		}
		else if(p.equals("4")){
			tab.tab[1][0]="X";
		}
		else if(p.equals("5")){
			tab.tab[1][1]="X";
		}
		else if(p.equals("6")){
			tab.tab[1][2]="X";
		}
		else if(p.equals("7")){
			tab.tab[2][0]="X";
		}
		else if(p.equals("8")){
			tab.tab[2][1]="X";
		}
		else if(p.equals("9")){
			tab.tab[2][2]="X";
		}
	}
	public void fazerJogadaO(String p, Tabuleiro tab){
		if(p.equals("1")){
			tab.tab[0][0]="O";
		}
		else if(p.equals("2")){
			tab.tab[0][1]="O";
		}
		else if(p.equals("3")){
			tab.tab[0][2]="O";
		}
		else if(p.equals("4")){
			tab.tab[1][0]="O";
		}
		else if(p.equals("5")){
			tab.tab[1][1]="O";
		}
		else if(p.equals("6")){
			tab.tab[1][2]="O";
		}
		else if(p.equals("7")){
			tab.tab[2][0]="O";
		}
		else if(p.equals("8")){
			tab.tab[2][1]="O";
		}
		else if(p.equals("9")){
			tab.tab[2][2]="O";
		}
	}
        
        public String ganhar(int jogadas, Tabuleiro tab){ //verificar se ganhou
            String[] T = new String[8]; //oito é o numero de possiveis vitorias
            String vencedor = "null"; //inicializa com null pq ainda n tem vencedor por enquanto
            if(jogadas == 9){ 
			vencedor = "Empate!";//se preencher tudo é pq ninguem ganhou
            }
            T[0] = tab.tab[0][0] +tab.tab[0][1] + tab.tab[0][2];//uma vitoria
            T[1] = tab.tab[1][0] + tab.tab[1][1] + tab.tab[1][2];//outra vitoria
            T[2] = tab.tab[2][0] + tab.tab[2][1] + tab.tab[2][2];

            T[3] = tab.tab[0][0] + tab.tab[1][0] + tab.tab[2][0];
            T[4] = tab.tab[0][1] + tab.tab[1][1] + tab.tab[2][1];
            T[5] = tab.tab[0][2] + tab.tab[1][2] + tab.tab[2][2];

            T[6] = tab.tab[0][0] + tab.tab[1][1] + tab.tab[2][2];
            T[7] = tab.tab[0][2] + tab.tab[1][1] + tab.tab[2][0];
            
            for (int i = 0; i < T.length; i++) {
			if(T[i].equals("XXX")){
				vencedor = "X";
			}else if(T[i].equals("OOO")){
				vencedor = "O";
			}
		}
		return vencedor;
	}

    

}
