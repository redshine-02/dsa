import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			printMazePaths( 0 , 0 , n-1 , m-1 , "");

	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    // public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        // if(sr==dr && sc==dc){
			// 	System.out.println(psf);
			// 	return;
			// }
		// 	for(int jump = 1; sc+jump<=dc;jump++){
		// 		printMazePaths( sr , sc+jump , dr , dc , psf+"h"+jump);
		// 	}
		// 	for(int jump = 1; sr+jump<=dr;jump++){
		// 		printMazePaths( sr+jump , sc , dr , dc , psf+"v"+jump);
		// 	}
        //     for(int jump =1;sr+jump<=dr && sc+jump<=dc;jump++){
		// 		printMazePaths( sr+jump , sc+jump , dr , dc , psf+"d"+jump);
		// 	}

	    // }

        //DIRECTIONAL ARRAY === GREAT APPLICATION IN BACKTRACKING

        static int[][] dir = {{1,0},{0,1},{1,1}};
        static char[] dirN = {'h','v','d'};
        
        public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){
            if(sr==dr && sc==dc){
				System.out.println(psf);
				return;
			}

            for(int d=0;d<dir.length;d++){
                for(int jump=1;jump<=Math.max(dr,dc);jump++){
                    int r = sr + (jump*dir[d][0]);
                    int c = sc + (jump*dir[d][1]);

                    if(r>=0 && c>=0 && r<=dr && c<=dc){
                        printMazePaths(r, c, dr, dc, psf+dirN[d]+jump);
                    }
                }
            }

        }
	}