package szymon.scjp.examexample._13;

public class LabeledFor {

	
	
	public static void main(String[] args) {
		
		free:
			for(int j = 3; j > 0; j--) {
				for(int k = 0; k < 4; k++) {
					if (j == 1) break free;
						if(k == 2) break;
						System.out.print(" " + j + k);
				}
			}

	}

}
