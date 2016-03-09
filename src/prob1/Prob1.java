package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		if(inputNumber%2==0){
            System.out.println("결과 값:  " + (inputNumber/2)*(inputNumber/2+1));
        }
        else if(inputNumber%2==1){
            System.out.println("결과 값:  " + ((inputNumber+1)/2)*(inputNumber+1)/2);
        }
        else{
            System.out.println("입력 오류");
        }
		scanner.close();
	}

}
