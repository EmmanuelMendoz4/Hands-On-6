public class Predicts {
    private QuadraticRegression regression;

    public Predicts(DataSet dataSet) {
        regression = new QuadraticRegression(dataSet);
    }

    public void performPredictions() {
        double[] xData = {4, 5, 6, 7, 8};

        for (double inputX : xData) {
            double prediction = regression.predict(inputX);
            double[] coefficients = regression.getCoefficients();
            System.out.println("y = " + coefficients[0] + " + " +
                               coefficients[1] + "(" + inputX + ")^2 + " +
                               coefficients[2] + "(" + inputX + ") = " +
                               prediction);
        }
    }
}
