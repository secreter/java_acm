package acm;
import java.util.Scanner;

public class position {
	//康托展开
	// 公式：把一个整数X展开成如下形式： X=a[n]*(n-1)!+a[n-1]*(n-2)!+...+a[i]*(i-1)!+...+a[2]*1!+a[1]*0! 
	//其中，a为整数，并且0<=a[i]<i(1<=i<=n) x表示的就是所有序列中该序列所在的位置，其中an表示是比第一个位置的字母或数字小的个数。
	//举一个例子，比如问 45231是第几个排列？ 第一个数是4，研究比4小的并且还没有出现过的数有3个：1，2，3。
	//那么ans:=ans+ 3*(n-1)!=3*4！； 第二个数是5，比5小并且没有出现过的数只有3个，ans:=ans+ 3*(n-2)! =3*3！； 第三个数是2，这里就只有一个了，ans:=ans+ 1*(n-3)! =1*2！； 依次类推：最后得到的结果就是  ans:= 3*4!  +  3*3!  +  1*2!  +  1*1!  +  0*0!  +  1  =94 得出来的结果还要加1，因为这里得到的结果是在他之前的排列数 
	public static String s="abcdefghijkl";
	public static void main(String[] args){
		int n;
		String str;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		Scanner scanner2=new Scanner(System.in);
		for(int i=0;i<n;i++){
			str=scanner2.nextLine();
			System.out.println(pos(str));;
		}
		
	}
	public static int pos(String str){
		char[] arr=s.toCharArray();
		StringBuffer sb=new StringBuffer(s);
		char[] strArr=str.toCharArray();
		int len=arr.length;
		int factorial=1*2*3*4*5*6*7*8*9*10*11;//阶乘
		int i=0;
		int pos=0;
		int index=-1;
		do{
			//找到s里还剩的字符，并且索引的位置恰好是比他小的字符个数
			index=s.indexOf(strArr[i]);
			if(index!=-1){
				pos+=index*factorial;
			}
			//删除出现过的字符
			s=s.replace(String.valueOf(strArr[i]), "");
			
			i++;
			if(len-i>0)
			factorial/=len-i;
			
		}while(i<len);
		return pos+1;   //pos之前是相对第一个的相对位置
	}
}
