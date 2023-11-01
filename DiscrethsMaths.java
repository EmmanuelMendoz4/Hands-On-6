public class DiscrethsMaths {
    public static double sum(double[] data) {
        double total = 0;
        for (double value : data) {
            total += value;
        }
        return total;
    }

    public static double sumOfSquaredValues(double[] data) {
        double result = 0;
        for (double value : data) {
            result += value * value;
        }
        return result;
    }

    public static double sumOfCubedValues(double[] data) {
        double result = 0;
        for (double value : data) {
            result += value * value * value;
        }
        return result;
    }

    public static double sumOfFourthPowers(double[] data) {
        double result = 0;
        for (double value : data) {
            result += value * value * value * value;
        }
        return result;
    }

    public static double[] multiplyArrays(double[] data1, double[] data2) {
        if (data1.length != data2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        double[] result = new double[data1.length];
        for (int i = 0; i < data1.length; i++) {
            result[i] = data1[i] * data2[i];
        }
        return result;
    }

    public static double sumOfProducts(double[] data1, double[] data2) {
        if (data1.length != data2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        double result = 0;
        for (int i = 0; i < data1.length; i++) {
            result += data1[i] * data2[i];
        }
        return result;
    }
}
