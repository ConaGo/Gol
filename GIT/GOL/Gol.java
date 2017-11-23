package de.huebner.gol;
 
/**
 *
 * Conways Game of Life.
 * @version 1.0
 *
 * 
 *
 */
 
public class Gol {
 
	 public static final int ARENASIZE = 16;
	 
	    public static boolean[][] roundCycle(boolean[][] arena) {
	 
	        /**
	         * Play one round.
	         */
	    	int iBoundaryTop = 0;
	 	    int iBoundaryBot = 0;
	 	    int jBoundaryLeft = 0;
	 	    int jBoundaryRight = 0;
	        boolean[][] arenaFuture = new boolean[ARENASIZE][ARENASIZE];
	 
	        for (int i = 0; i < ARENASIZE ; i++) {
	            for (int j = 0; j < ARENASIZE ; j++) {
	 
	                int cellCounter = 0;
	                
	            	   iBoundaryTop = ( i == 0) ? 1 : 0;
	            	   iBoundaryBot = ( i == ARENASIZE - 1) ? 1 : 0;
	            	   jBoundaryLeft = ( j == 0) ? 1 : 0;
	            	   jBoundaryRight = ( j == ARENASIZE -1) ? 1 : 0;
	                  
	                for (int k = -1 +iBoundaryTop; k < 2 - iBoundaryBot ; k++) {
	                	
	                    for (int l = -1 +jBoundaryLeft; l < 2 - jBoundaryRight; l++) {
	                    	
	                    	if(k == 0 && l == 0){}//nicht die Zelle mitzählen um die es geht
	                    	
	                    	else if (arena[i+k][j+l] == true) {
	                            cellCounter++;
	                            
	                        }
	 
	                    }
	                }  
	               if(arena[i][j]){
	            	   if(cellCounter<4 && cellCounter > 1)
	            		   arenaFuture[i][j]=true;
	            	   else
	            		   arenaFuture[i][j]=false;
	               }else
	            	   if(cellCounter == 3)
	            		   arenaFuture[i][j]=true;
	            	   else
	            		   arenaFuture[i][j]=false;
	            }
	        }
	 
	        return arenaFuture;
	 
	    }//45
	   
	    public static void consoleOut(boolean[][] arena) {
	 
	        /**
	         * Output Arena State to Console.
	         */
	 
	        for (int i = 0; i < ARENASIZE ; i++) {
	            for (int j = 0; j < ARENASIZE ; j++) {
	 
	                if (arena[i][j] == false) {
	                    System.out.print("O");
	                } else {
	                    System.out.print("X");
	                }
	 
	            }
	            System.out.println();
	        }
	        System.out.println();
	 
	    }
	    
	 
	    public static void main(String[] args) {
	 
	        boolean[][] arena = {{false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, true, false, false, true, false,false, false, false, false, false, false, false, false},
	                            {false, false, true, false, true, true, false, true,false, false, false, false, false, false, false, false},
	                            {false, false, false, true, false, false, true, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, true, false, false, true, false,false, false, false, false, false, false, false, false},
	                            {false, false, true, false, true, true, false, true,false, false, false, false, false, false, false, false},
	                            {false, false, false, true, false, false, true, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false,false, false, false, false, false, false, false, false}};
	        for(int x = 0; x < 60; x++){
	        consoleOut(arena);
	        arena = roundCycle(arena);}
	        
	 
	    }
	 
	}