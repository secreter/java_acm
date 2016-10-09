package acm;

public class ZeroOnePack {
	//参考http://www.nowcoder.com/discuss/3574
	//（1）i=0  当j<w[0]时，m[0][j]=0；当j>=w[0]时，m[0][j]=v[0]。
    //（2）i>0  当j<w[i]，m[i][j]=m[i-1][j]；当j>=w[i]，m[i][j]=max{m[i-1][j-w[i]]+v[i]，m[i-1][j]}。
//	public static void main(String[] args){
//		int []w={2,2,6,5,4}; //物品重量
//        int []v={6,3,5,4,6}; //物品价值
//        int c=10;            //背包容量
//        int []x=new int[5];  //记录物品装入情况，0表示不转入，1表示装入
//        x[0]=1; //初始值表示第一个物品已装入背包
//        int[][] m=new int[5][c+1];//需要维护的二维表，为了方便计算加入一列，其中第0列表示背包容量为0时背包的最大价值为0
//        /*
//         * 初始化第一行，即背包中装入第一件物品
//         * 注意，m[0][]没有初始化是因为默认int数组就初始化为0
//         * */
//        for(int j=1;j<=c;j++){
//        	if(w[0]<j) m[0][j]=v[0];
//        }
//        /*
//         * 背包中依次装入其他的物品
//         * */
//        for(int i=1;i<5;i++){
//        	for(int j=0;j<=c;j++){
//        		if(w[i]<j){
//        			if(m[i-1][j-w[i]]+v[i]>m[i-1][j]){
//        				m[i][j]=m[i-1][j-w[i]]+v[i]; //选择价值较大者
//        			}else{
//        				m[i][j]=m[i-1][j]; //装得下，但为了装入它，放弃的空间可以装更有价值的，所以不装
//        			}
//        		}else{
//        			m[i][j]=m[i-1][j];  //装不下
//        		}
//        	}
//        }
//        System.out.print("背包的最大价值为："+m[w.length-1][c]);
//        for(int i=4;i>0;i--){
//        	if(m[i][c]>m[i-1][c]){
//        		//说明i被装进去了
//        		x[i]=1;//标记有它
//        		c-=w[i];//当前背包容量减小
//        	}
//        	else x[i]=0; //没有装入背包，其实默认为0
//        }
//        System.out.print("装入背包的物品编号是：");
//        for(int i=0;i<5;i++){
//            if(x[i]==1) System.out.printf("%2d",(i+1));
//        }
//	}
}
