package ip94.dolgova;

public class Lab2 {

    public static void main(String[] args) {
	short a = 3;
	short[][] B = new short[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	short[][] C = new short[3][3];

	short sumEven = 0;
	short sumOdd = 0;

	// First task
	System.out.println("First task");

	for (short i = 0; i < B.length; i++) {
	    for (short j = 0; j < B[i].length; j++) {
		C[i][j] = (short) (a * B[i][j]);
		System.out.print(C[i][j] + "\t");
	    }
	    System.out.println();
	}

	// Second task
	for (short i = 0; i < C.length; i++) {

	    if (i % 2 == 1) {
		// Odd
		short max = C[i][0];
		for (short j = 0; j < C[i].length; j++) {
		    if (C[i][j] > max)
			max = C[i][j];
		}
		sumOdd += max;

	    } else {
		// Even
		short min = C[i][0];

		for (short j = 0; j < C[i].length; j++) {
		    if (C[i][j] < min)
			min = C[i][j];
		}

		sumEven += min;
	    }

	}
	System.out.println("Second task");
	System.out.println("Sum of max in odd rows: " + sumOdd);
	System.out.println("Sum of min even rows: " + sumEven);
    }
}
