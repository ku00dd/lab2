
package org.me.mylib;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 * Клас MatrixClass описує матрицю
 * @author Ольга Бєлая, 2018
 */
public class MatrixClass { 
    int n, m;
    int[][] mainMatrix;
    /**
     * Конструктор з параметрами 
     * @param n кількість рядків матриці
     * @param m кількість стовбців матриці
     */
    public MatrixClass(int n, int m) 
    {
        this.n = n;
        this.m = m;
        this.mainMatrix = new int[this.n][this.m];
    }
    /**
     * Констуктор з параметрами
     * @param paramMatrix матриця 
     */
    public MatrixClass(int [][] paramMatrix)
    {
        this.n = paramMatrix.length;
        this.m = paramMatrix[0].length;
        this.mainMatrix = paramMatrix;
    }
    /**
     * Метод, який повертає значення вказаного елементу матриці
     * @param n рядок
     * @param m стовбець
     * @return значення елементу матриці
     */
    public int getElement(int n, int m)
    {
        return this.mainMatrix[n][m];
    }
    /**
     * Метод, який встановлює значення для вказного елемента матриці
     * @param n рядок
     * @param m стовбець
     * @param value значення елементу
     */
    public void setElement(int n, int m, int value)
    {
        this.mainMatrix[n][m] = value;
    }
    /**
     * Метод який повертає довжину рядка матриці
     * @return довжина рядка матриці
     */
    public int getVerticalLength()
    {
        return this.mainMatrix.length;
    }
    /**
     * Метод який повертає довжину стовбця матриці
     * @return довжина стовбця матриці
     */
    public int getHorizontalLength()
    {
        return this.mainMatrix[0].length;
    }
    /**
     * Метод, який заповнює матрицю рандомними значеннями
     */
    public void fillRandomValues()
    {
        Random rand = new Random();
        for(int i = 0; i < this.n; i++)
        {
            for(int j = 0; j < this.m; j++)
            {
                this.mainMatrix[i][j] = rand.nextInt(100);
            }
        }
    }
    /**
     * Метод, який виводить в консолі значення елементів матриці
     */
    public void displayMatrix()
    {
        for(int i = 0; i < this.n; i++)
        {
            for(int j = 0; j < this.m; j++)
            {
                System.out.print(this.mainMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Транспонування матриці
     * @param paramMatrix матриця
     * @return транспонована матриця
     */
    public static MatrixClass transpone(MatrixClass paramMatrix)
    {
        MatrixClass tmpMatrix = new MatrixClass(paramMatrix.m, paramMatrix.n);
        for(int i = 0; i < paramMatrix.m; i++)
        {
            for(int j = 0; j < paramMatrix.n; j++)
            {
                tmpMatrix.setElement(i, j, paramMatrix.getElement(j, i));
            }
        }
        return tmpMatrix;
    }
    /**
     * Додавання матриць
     * @param first перша матриця
     * @param second друга матриця
     * @return матриця, яка є сумою перших двохматриць
     * @throws NotEqualLengthsOfMatrixException Помилка. Довжини матриць різні
     */
    public static MatrixClass add(MatrixClass first, MatrixClass second)  {
        
            MatrixClass tmpMatrix = new MatrixClass(first.getVerticalLength(), second.getHorizontalLength());
            for (int i = 0; i < tmpMatrix.getVerticalLength(); i++) {
                for(int j = 0; j < tmpMatrix.getHorizontalLength(); j++){
                    tmpMatrix.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
                }
            }
            return tmpMatrix;
       
    }
    /**
     * Віднімання матриць
     * @param first перша матриця
     * @param second друга матриця
     * @return матриця, яка є різницею перших двох матриць
     * @throws NotEqualLengthsOfMatrixException Помилка. Довжини матриць різні
     */
    public static MatrixClass subtract (MatrixClass first, MatrixClass second)  {
        
            MatrixClass tmpMatrix = new MatrixClass(first.getVerticalLength(), second.getHorizontalLength());
            for (int i = 0; i < tmpMatrix.getVerticalLength(); i++) {
                for(int j = 0; j < tmpMatrix.getHorizontalLength(); j++){
                    tmpMatrix.setElement(i, j, first.getElement(i, j) - second.getElement(i, j));
                }
            }
            return tmpMatrix;
        
    }
    /**
     * Множення матриць
     * @param first перша матриця
     * @param second друга матриця
     * @return матриця, яка є добутком перших двох матриць
     * @throws NotEqualLengthsOfMatrixException Помилка. Довжини матриць різні
     */
    public static MatrixClass multiply (MatrixClass first, MatrixClass second) {
        
            MatrixClass tmpMatrix;
            int n = first.getVerticalLength();
            int m = second.getHorizontalLength();
            int o = second.getVerticalLength();
            int[][] tmpArr = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    for (int k = 0; k < o; k++) {
                        tmpArr[i][j] += first.getElement(i, k) * second.getElement(k, j);
                    }
                }
            }
            tmpMatrix = new MatrixClass(tmpArr);
            return tmpMatrix;
       
    }
    /**
     * Обчислення визначника матриці
     * @param paramMatrix матриця
     * @return значення визначника
     * @throws NotSquareMatrixException Помилка. Матриця не квадратна
     */
    public static int determinant (MatrixClass paramMatrix) {
       MatrixCalculation mc = new MatrixCalculation();
        int result=mc.CalculateMatrix(paramMatrix);
        return result;
       
    }
    /**
     * Збереження матриці
     * @param paramMatrix матриця
     * @param filename назва файлу
     */
    public static void save(MatrixClass paramMatrix, String filename){
         try {
             FileWriter fout = new FileWriter("dat/"+filename+".txt");
             for (int i=0; i<paramMatrix.getVerticalLength(); i++){
                for(int j=0;j<paramMatrix.getHorizontalLength();j++){
                    fout.write(paramMatrix.getElement(i, j)+" \n");
                } fout.append("\r\n");
            }
            fout.close();
            System.out.println("Запис завершено.");
         } catch (IOException ex) {
             System.out.println("Не вдалось записати файл...");
         }
    }
}
 class NotEqualLengthsOfMatrixException extends Exception {}
 class NotSquareMatrixException extends Exception {}



class MatrixCalculation {
   
    protected int CalculateMatrix(MatrixClass matrix){
        int calcResult=0;
        if (matrix.getVerticalLength()==2){
            calcResult=matrix.getElement(0, 0)*matrix.getElement(1, 1)-matrix.getElement(1, 0)*matrix.getElement(0, 1);
        }
        else{
            int koeff=1;
            for(int i=0; i<matrix.getVerticalLength(); i++){
                if(i%2==1){ 
                    koeff=-1;
                }
                else{
                    koeff=1;
                };
                   
                calcResult += koeff*matrix.getElement(0, i)*this.CalculateMatrix(this.GetMinor(matrix,0,i)); 
            }
        }
        

        return calcResult;
    }
   
    private MatrixClass GetMinor(MatrixClass matrix, int row, int column){
        int minorLength = matrix.getVerticalLength()-1;
        MatrixClass minor = new MatrixClass(minorLength,minorLength);
        int dI=0;
        int dJ=0;
        for(int i=0; i<=minorLength; i++){
            dJ=0;
            for(int j=0; j<=minorLength; j++){
                if(i==row){
                    dI=1;
                }
                else{
                    if(j==column){
                        dJ=1;
                    }
                    else{
                        minor.setElement(i-dI,j-dJ,matrix.getElement(i, j));
                    }
                }
            }
        }
        
        return minor;
        
    }}
    
   