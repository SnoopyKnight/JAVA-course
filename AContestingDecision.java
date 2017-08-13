package contestingDecision;

import java.util.Scanner;

public class ContestingDecision {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		String[] team; team = new String[n];
		int[][] sub; sub = new int[n][4];
		int[][] time; time = new int[n][4];
		String winTeam="";
		int sol = 0, pena = 0;
		int i = 0,j =0;
		int nextTeamSol = 0,nextTeamPena = 0;
		while(i<n){
			keyboard = new Scanner(System.in);
			team[i]= keyboard.next();
			for(j = 0;j < 4; j++){
				sub[i][j] = keyboard.nextInt();
				time[i][j] = keyboard.nextInt();
			}
			
			if(i == 0){
				winTeam = team[i];
				for(j = 0;j < sub[i].length; j++){
					if(time[i][j] > 0){
						sol++;
						pena += (sub[i][j] - 1) * 20 + time[i][j];
					}
				}
			}
			else{
				for(j = 0;j < sub[i].length; j++){
					if(time[i][j] > 0){
						nextTeamSol++;
						nextTeamPena += (sub[i][j] - 1) * 20 + time[i][j];
					}
				}
			}
			
			if(nextTeamSol > sol || ((nextTeamSol == sol)&&(nextTeamPena < pena)) ){
				winTeam = team[i];
				sol = nextTeamSol;
				pena = nextTeamPena;
			}
			i++;
		}		
		System.out.println(winTeam + " " + sol + " " + pena);
	}

}
