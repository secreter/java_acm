package acm;
 
/**
 * 矩阵   测试
 * @author ronaldoGT
 *
 */
public class Matrix {
 
    private static int[][] matrix ;
     
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Matrix objMatrix = new Matrix();
//        objMatrix.loopMatrix(7);
//        for(int i=0;i<7;i++){
//            for(int j=0;j<7;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
     
    /**
     * 蛇形矩阵
     * @param n
     */
    public void snakeMatrix(int n){
        matrix = new int[n][n]; 
        int x = 0, y = 0,m = 1;
        boolean isRow = false;
        for(int i = 0;i < (2*n-1);i++){
            x = i;
            while(x >= ((i < n) ? 0 : i-n+1)){
                if(x > (n-1))
                    x = n-1;
                    y = i-x;
                if(isRow)
                    matrix[x][y] = m;
                else{
                    matrix[y][x] = m;}
                m++;
                x--;
            }
            isRow = !isRow;
        }
    }
     
    /**
     * 大回环矩阵
     * @param n
     */
    public void loopMatrix(int n){
        matrix = new int[n][n];  
        for (int num = 1, x = 0, y = 0, xDir = 1, yDir = 0; num <= n * n; num++) {  
             matrix[x][y] = num;  
             if (x + xDir < 0 || y + yDir < 0 || x + xDir == n || y + yDir == n || matrix[x + xDir][y + yDir] != 0) {//如果到边界了就换方向  
                 if (xDir != 0) {  
                     yDir = xDir;  
                     xDir = 0;  
                 } else {  
                     xDir = -yDir;  
                     yDir = 0;  
                 }  
             }  
             x += xDir;  
             y += yDir;  
        } 
    }
}