public abstract class GenericMatrix<T extends Number> {
    protected abstract T add(T x1,T x2);
    protected abstract T multiply(T x1,T x2);
    protected abstract T zero();
    public T[][] addMatrix(T[][] matrix1,T[][] matrix2){
        if ((matrix1.length != matrix2.length)||(matrix1[0].length!=matrix2[0].length)) {
            throw new RuntimeException("数组大小不同！");
        }
        T[][] result = (T[][]) new Number[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[1].length; j++){
                result[i][j]=add(matrix1[i][j],matrix2[i][j]);            }
        }
        return result;
    }
    public T[][] multiplyMatrix(T[][] matrix1,T[][] matrix2){
        if ((matrix1[0].length != matrix2.length)) {
            throw new RuntimeException("数组大小不正确！");
        }
        T[][] result = (T[][]) new Number[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j],multiply(matrix1[i][k],matrix2[k][j]));
                }
            }
        }
        return result;
    }
}
