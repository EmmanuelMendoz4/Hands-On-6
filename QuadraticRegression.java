public class QuadraticRegression {
    private double[] x;
    private double[] y;
    private double[] coefficients;

    public QuadraticRegression(DataSet dataSet) {
        this.x = dataSet.getX();
        this.y = dataSet.getY();
        fit();
    }

    private void fit() {
        int n = x.length;
        if (n != y.length) {
            throw new IllegalArgumentException("Input arrays must have the same length.");
        }

        double sumX = DiscrethsMaths.sum(x);
        double sumX2 = DiscrethsMaths.sumOfSquaredValues(x);
        double sumX3 = DiscrethsMaths.sumOfCubedValues(x);
        double sumX4 = DiscrethsMaths.sumOfFourthPowers(x);
        double sumXY = DiscrethsMaths.sumOfProducts(x, y);
        double sumX2Y = DiscrethsMaths.sumOfProducts(DiscrethsMaths.multiplyArrays(x, x), y);

        double[][] A = {
            {sumX4, sumX3, sumX2},
            {sumX3, sumX2, sumX},
            {sumX2, sumX, n}
        };

        double[] B = {sumX2Y, sumXY, DiscrethsMaths.sum(y)};

        // Resuelve el sistema de ecuaciones para encontrar los coeficientes
        coefficients = LinearAlgebra.solveSystemOfEquations(A, B);
    }

    public double predict(double inputX) {
        double beta0 = coefficients[0];
        double beta1 = coefficients[1];
        double beta2 = coefficients[2];
        return beta0 + beta1 * inputX + beta2 * (inputX * inputX);
    }

    public double[] getCoefficients() {
        return coefficients;
    }
}
