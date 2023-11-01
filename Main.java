public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        QuadraticRegression regression = new QuadraticRegression(dataSet);
        double[] coefficients = regression.getCoefficients();

        // Imprimir la fórmula de regresión cuadrática
        System.out.println("\nEcuación de regresión cuadrática:");
        System.out.println("\ny = " + coefficients[0] + "(x^2) + " + coefficients[1] + "(x) + " + coefficients[2]);
        
        // Realizar una predicción
        System.out.println("\nPredicciones: ");
        Predicts predictor = new Predicts(dataSet);
        predictor.performPredictions();
    }
}
