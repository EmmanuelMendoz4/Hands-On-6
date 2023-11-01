public class DataSet {
    // Valores preestablecidos para el conjunto de datos
    private static double[] x = {-3, -2, -1, 0, 1, 2, 3};
    private static double[] y = {7.5, 3, 0.5, 1, 3, 6, 14};
    
    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }

    public int getSize() {
        return getY().length;
    }
}