package cw4;

public class Matrix {
    private static int[][] tempMatrix;
    private int[][] matrix;

    private Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    static void setUpMatrix(int rowCount, int columnCount) {
        if (rowCount <= 0 || columnCount <= 0) {
            System.out.println("Liczba kolumn oraz liczba wierszy nie może być mniejsza od 0.");
            return;
        }
        tempMatrix = new int[rowCount][columnCount];
    }

    static void insertRow(int[] row) {
        if (tempMatrix == null || row.length != tempMatrix.length) {
            System.out.println("Nieudana próba dodania wiersza do macierzy.");
            return;
        }
        for (int i = 0; i < tempMatrix.length; i++) {
            if (tempMatrix[i][0] == 0) {
                tempMatrix[i] = row;
                break;
            }
        }
    }

    static Matrix create() {
        if (tempMatrix == null) {
            System.out.println("Nieudana próba stworzenia macierzy.");
            return null;
        }
        Matrix matrix = new Matrix(tempMatrix);
        tempMatrix = null;
        return matrix;
    }

    void print() {
        if (matrix == null) {
            System.out.println("Macierz nie została określona.");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    Matrix add(Matrix m) {
        if (!areMatrixCanBeAddOrSubtract(this, m)) {
            System.out.println("Nieudana próba dodawania macierzy.");
            return this;
        }
        Matrix.setUpMatrix(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = matrix[i][j] + m.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        matrix = Matrix.create().matrix;
        return this;
    }

    static Matrix add(Matrix m1, Matrix m2) {
        if (!areMatrixCanBeAddOrSubtract(m1, m2)) {
            System.out.println("Nieudana próba dodawania macierzy.");
            return m1;
        }
        Matrix.setUpMatrix(m1.matrix.length, m1.matrix[0].length);
        for (int i = 0; i < m1.matrix.length; i++) {
            int[] row = new int[m1.matrix[0].length];
            for (int j = 0; j < m1.matrix[0].length; j++) {
                row[j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }

    Matrix subtract(Matrix m) {
        if (!areMatrixCanBeAddOrSubtract(this, m)) {
            System.out.println("Nieudana próba odejmowania macierzy.");
            return this;
        }
        Matrix.setUpMatrix(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = matrix[i][j] - m.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        matrix = Matrix.create().matrix;
        return this;
    }

    static Matrix subtract(Matrix m1, Matrix m2) {
        if (!areMatrixCanBeAddOrSubtract(m1, m2)) {
            System.out.println("Nieudana próba odejmowania macierzy.");
            return m1;
        }
        Matrix.setUpMatrix(m1.matrix.length, m1.matrix[0].length);
        for (int i = 0; i < m1.matrix.length; i++) {
            int[] row = new int[m1.matrix[0].length];
            for (int j = 0; j < m1.matrix[0].length; j++) {
                row[j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }

    static boolean areMatrixCanBeAddOrSubtract(Matrix m1, Matrix m2) {
        return !(m1 == null || m2 == null
                || m1.matrix == null || m2.matrix == null
                || m1.matrix.length != m2.matrix.length
                || m1.matrix[0].length != m2.matrix[0].length);
    }

    Matrix multiply(Matrix m) {
        if (matrix == null || m == null || m.matrix == null
                || matrix[0].length != m.matrix.length) {
            System.out.println("Nieudana próba mnożenia macierzy.");
            return this;
        }
        Matrix.setUpMatrix(matrix.length, m.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[m.matrix[0].length];
            for (int j = 0; j < m.matrix[0].length; j++) {
                int result = 0;
                for (int k = 0; k < m.matrix.length; k++) {
                    result = result + matrix[i][k] * m.matrix[k][j];
                }
                row[j] = result;
            }
            Matrix.insertRow(row);
        }
        matrix = Matrix.create().matrix;
        return this;
    }

    static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1 == null || m2 == null
                || m1.matrix == null || m2.matrix == null
                || m1.matrix[0].length != m2.matrix.length) {
            System.out.println("Nieudana próba mnożenia macierzy.");
            return m1;
        }
        Matrix.setUpMatrix(m1.matrix.length, m2.matrix[0].length);
        for (int i = 0; i < m1.matrix.length; i++) {
            int[] row = new int[m2.matrix[0].length];
            for (int j = 0; j < m2.matrix[0].length; j++) {
                int result = 0;
                for (int k = 0; k < m2.matrix.length; k++) {
                    result = result + m1.matrix[i][k] * m2.matrix[k][j];
                }
                row[j] = result;
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }
}