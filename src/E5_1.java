//统计正数和负数的数量
import java.util.Scanner;
public class E5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入数字，空格结束");
		int in=0,sum=0,numOfP=0,numOfN=0;
		do {
			in=input.nextInt();
			sum+=in;
			if(in>0){
				numOfP+=1;
			}else if(in<0) {
				numOfN+=1;
			}
		}while(in!=0);
		System.out.println("number of postives:"+numOfP);
		System.out.println("number of negatives:"+numOfN);
		System.out.println("total:"+sum);
		System.out.println("average:"+sum/(double)(numOfP+numOfN));
	}
}
