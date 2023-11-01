# Aplicaciones del Cálculo Diferencial al ML.
## Hand-On 6.
### Instrucciones:
- Dado el DataSet de  Varsity Tutors, calcular los valores óptimos para los parámetros del Modelo Predictivo no Lineal.
- Simular el comportamiento del Sistema no Lineal a partir de predecir valores para la variable endógena en función a la variable exógena.

### Inputs:
- Varsity Tutors Data Set
- El DataSet estará predefinido a través de un constructor de clase.
- No se capturan datos.

### Outputs:
- Imprimir:
    - Ecuación de Regresión Cuadrática sustituyendo los valores de los parámetros del modelo.
    - Al menos cinco predicciones en función a valores conocidos y desconocidos de la variable exógena. 

### Diagrama UML:
```plantuml
@startuml
class DataSet {
    - static double[] y
    - static double[] x
    + double[] getX()
    + double[] getY()
    + int getSize()
}

class QuadraticRegression {
    - double[] y;
    - double[] x;
    - double[] coefficients;
    + QuadraticRegression(dataSet: DataSet)
    - void fit()
    + double predict(inputX: double)
    + double[] getCoefficients()
}

class LinearAlgebra {
    + static double[] solveSystemOfEquations(A: double[][], B: double[])
}

class DiscrethsMaths {
    + static double sum(data: double[])
    + static double SumOfSquaredValues(data: double[])
    + static double sumOfCubedValues(data: double[])
    + static double sumOfFourthPower(data: double[])
    + static double[] multiplyArrays(data1: double[], data2: double[])
    + static double sumOfProducts(data1: double[], data2: double[])
}

@enduml