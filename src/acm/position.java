package acm;
import java.util.Scanner;

public class position {
	//����չ��
	// ��ʽ����һ������Xչ����������ʽ�� X=a[n]*(n-1)!+a[n-1]*(n-2)!+...+a[i]*(i-1)!+...+a[2]*1!+a[1]*0! 
	//���У�aΪ����������0<=a[i]<i(1<=i<=n) x��ʾ�ľ������������и��������ڵ�λ�ã�����an��ʾ�Ǳȵ�һ��λ�õ���ĸ������С�ĸ�����
	//��һ�����ӣ������� 45231�ǵڼ������У� ��һ������4���о���4С�Ĳ��һ�û�г��ֹ�������3����1��2��3��
	//��ôans:=ans+ 3*(n-1)!=3*4���� �ڶ�������5����5С����û�г��ֹ�����ֻ��3����ans:=ans+ 3*(n-2)! =3*3���� ����������2�������ֻ��һ���ˣ�ans:=ans+ 1*(n-3)! =1*2���� �������ƣ����õ��Ľ������  ans:= 3*4!  +  3*3!  +  1*2!  +  1*1!  +  0*0!  +  1  =94 �ó����Ľ����Ҫ��1����Ϊ����õ��Ľ��������֮ǰ�������� 
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
		int factorial=1*2*3*4*5*6*7*8*9*10*11;//�׳�
		int i=0;
		int pos=0;
		int index=-1;
		do{
			//�ҵ�s�ﻹʣ���ַ�������������λ��ǡ���Ǳ���С���ַ�����
			index=s.indexOf(strArr[i]);
			if(index!=-1){
				pos+=index*factorial;
			}
			//ɾ�����ֹ����ַ�
			s=s.replace(String.valueOf(strArr[i]), "");
			
			i++;
			if(len-i>0)
			factorial/=len-i;
			
		}while(i<len);
		return pos+1;   //pos֮ǰ����Ե�һ�������λ��
	}
}
