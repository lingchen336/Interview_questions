package com.test.algorithm.jianzhi;

/*
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 */

class O_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)return false;
        int rows= matrix.length,columns=matrix[0].length;
        int row=0,colum=columns-1;
        while(row<rows&&colum>=0){
            int num=matrix[row][colum];
            if(num==target){
                return true;
            }else if(num>target){
                colum--;
            }else{
                row++;
            }
        }

        return false;
    }
}