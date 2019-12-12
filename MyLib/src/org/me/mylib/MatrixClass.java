
package org.me.mylib;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 * ���� MatrixClass ����� �������
 * @author ����� �����, 2018
 */
public class MatrixClass { 
    int n, m;
    int[][] mainMatrix;
    /**
     * ����������� � ����������� 
     * @param n ������� ����� �������
     * @param m ������� �������� �������
     */
    public MatrixClass(int n, int m) 
    {
        this.n = n;
        this.m = m;
        this.mainMatrix = new int[this.n][this.m];
    }
    /**
     * ���������� � �����������
     * @param paramMatrix ������� 
     */
    public MatrixClass(int [][] paramMatrix)
    {
        this.n = paramMatrix.length;
        this.m = paramMatrix[0].length;
        this.mainMatrix = paramMatrix;
    }
    /**
     * �����, ���� ������� �������� ��������� �������� �������
     * @param n �����
     * @param m ��������
     * @return �������� �������� �������
     */
    public int getElement(int n, int m)
    {
        return this.mainMatrix[n][m];
    }
    /**
     * �����, ���� ���������� �������� ��� �������� �������� �������
     * @param n �����
     * @param m ��������
     * @param value �������� ��������
     */
    public void setElement(int n, int m, int value)
    {
        this.mainMatrix[n][m] = value;
    }
    /**
     * ����� ���� ������� ������� ����� �������
     * @return ������� ����� �������
     */
    public int getVerticalLength()
    {
        return this.mainMatrix.length;
    }
    /**
     * ����� ���� ������� ������� ������� �������
     * @return ������� ������� �������
     */
    public int getHorizontalLength()
    {
        return this.mainMatrix[0].length;
    }
    /**
     * �����, ���� �������� ������� ���������� ����������
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
     * �����, ���� �������� � ������ �������� �������� �������
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
     * �������������� �������
     * @param paramMatrix �������
     * @return ������������� �������
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
     * ��������� �������
     * @param first ����� �������
     * @param second ����� �������
     * @return �������, ��� � ����� ������ �����������
     * @throws NotEqualLengthsOfMatrixException �������. ������� ������� ���
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
     * ³������� �������
     * @param first ����� �������
     * @param second ����� �������
     * @return �������, ��� � ������� ������ ���� �������
     * @throws NotEqualLengthsOfMatrixException �������. ������� ������� ���
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
     * �������� �������
     * @param first ����� �������
     * @param second ����� �������
     * @return �������, ��� � �������� ������ ���� �������
     * @throws NotEqualLengthsOfMatrixException �������. ������� ������� ���
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
     * ���������� ���������� �������
     * @param paramMatrix �������
     * @return �������� ����������
     * @throws NotSquareMatrixException �������. ������� �� ���������
     */
    public static int determinant (MatrixClass paramMatrix) {
       MatrixCalculation mc = new MatrixCalculation();
        int result=mc.CalculateMatrix(paramMatrix);
        return result;
       
    }
    /**
     * ���������� �������
     * @param paramMatrix �������
     * @param filename ����� �����
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
            System.out.println("����� ���������.");
         } catch (IOException ex) {
             System.out.println("�� ������� �������� ����...");
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
    
   