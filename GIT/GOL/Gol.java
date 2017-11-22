package de.huebner.gol;
 
/**
 *
 * Conways Game of Life.
 * @version 1.0
 *
 * @author Florian HÃ¼bner {@literal <fl.huebner@ostfalia.de>} Matrikelnr.: 70458541
 *
 */
 
public class Gol {
 
	 public static final int ARENASIZE = 8;
	 
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
	 
	                        if (arena[i+k][j+l] == true) {
	                            cellCounter++;
	                            
	                        }
	 
	                    }
	                }
	                
	                
	                //Hier deine Spiellogik
	                /*
	                if (cellCounter < 3) {
	                                arenaFuture[i][j] = false;
	                            }
	                            if (cellCounter == 3 || cellCounter == 4) {
	                                arenaFuture[i][j] = true;
	                            }
	                            if (cellCounter > 4) {
	                                arenaFuture[i][j] = false;
	                            }
	 */
	            }
	        }
	 
	        return arenaFuture;
	 
	    }
	   
	    public static void consoleOut(boolean[][] arena) {
	 
	        /**
	         * Output Arena State to Console.
	         */
	 
	        for (int i = 1; i <= ARENASIZE - 2; i++) {
	            for (int j = 1; j <= ARENASIZE - 2; j++) {
	 
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
	 
	        boolean[][] arena = {{false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false},
	                            {false, false, false, true, false, false, false, false},
	                            {false, false, false, false, true, false, false, false},
	                            {false, false, true, true, true, false, false, false},
	                            {false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false},
	                            {false, false, false, false, false, false, false, false}};
	 
	        consoleOut(arena);
	        arena = roundCycle(arena);
	        consoleOut(arena);
	        arena = roundCycle(arena);
	        consoleOut(arena);
	        arena = roundCycle(arena);
	        consoleOut(arena);
	        arena = roundCycle(arena);
	        consoleOut(arena);
	        arena = roundCycle(arena);
	        consoleOut(arena);
	 
	    }
	 
	}
