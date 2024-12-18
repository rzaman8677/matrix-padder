public class MatrixPadder {
	public static int[][] createPaddedMatrix(int[] arr, int columns, int pad) {
		int[][] newMatrix = new int[(int)Math.ceil((double)arr.length/columns)][columns];
		int matrixCounter = 0;
		for (int i = 0; i < newMatrix.length; i++) {
			for (int i2 = 0; i2 < columns; i2++) {
				if (i + i2 < arr.length && matrixCounter < arr.length) {
					newMatrix[i][i2] = arr[matrixCounter];
					matrixCounter++;
				} else {
					newMatrix[i][i2] = pad;
				}
			}
		}
		return newMatrix;
	}
	// Do not run this until you are sure it works!!!
	public static void runMatrixPadderAcceptanceTest() {
		(new MatrixPadderTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runMatrixPadderAcceptanceTest();
	}
}
