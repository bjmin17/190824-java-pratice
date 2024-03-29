package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		int n = 10;	//int형 변수 n에 정수 값 10을 대입
		double dnum = n;	//int형 변수 n의 값을 double형 변수 dnum에 대입
		
		
		//묵시적 형 변환, 자동 형 변환
		//		바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
		byte bNum = 10;
		int iNum = bNum;	//byte형 변수 bNum 값을 int형 변수 iNum에 대입함
		
		//		덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
		int iNum2 = 20;
		float fNum = iNum2;
		
		//		연산 중에 자동 변환되는 경우
		int iNum1 = 20;
		float fNum1 = iNum;
		double dNum;
		dNum = fNum1 + iNum1;
		
		//예제
		 bNum = 10;
		 iNum = bNum;
		
		 
		System.out.println(bNum);
		System.out.println(iNum);
	
		iNum2 = 20;
		fNum = iNum2;
		 
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum3;
		dNum3 = fNum + iNum;
		System.out.println(dNum3);
		
		
	
	}

}
