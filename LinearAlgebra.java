public class LinearAlgebra {
    public static double[] solveSystemOfEquations(double[][] A, double[] B) {
        int n = A.length;
        if (n == 0 || A[0].length != n || B.length != n) {
            throw new IllegalArgumentException("Invalid matrix dimensions.");
        }

        // Realiza la eliminación de Gauss para resolver el sistema de ecuaciones
        for (int i = 0; i < n; i++) {
            // Busca el elemento máximo en la columna actual
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(A[k][i]) > Math.abs(A[maxRow][i])) {
                    maxRow = k;
                }
            }

            // Intercambia filas para llevar el elemento máximo a la fila actual
            double[] temp = A[i];
            A[i] = A[maxRow];
            A[maxRow] = temp;
            double tempB = B[i];
            B[i] = B[maxRow];
            B[maxRow] = tempB;

            // Realiza eliminación hacia adelante
            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                B[k] -= factor * B[i];
                for (int j = i; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
            }
        }

        // Realiza sustitución hacia atrás para obtener la solución
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * solution[j];
            }
            solution[i] = (B[i] - sum) / A[i][i];
        }

        return solution;
    }
}
