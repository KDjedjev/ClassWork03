import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Chisloto e: ");
		int a = input.nextInt();
		if(a<0 && a%2==0){
			System.out.print("Negative even ");
		}else if(a<0 && a%2==1){
			System.out.print("Negative odd");
		}else if(a>0 && a%2==0){
			System.out.print("Positive Even");
		}else if(a>0 && a%2==1){
			System.out.print("Positive Odd");
		}else{
			System.out.print("Nula");
		}
		input.close();		
	}

}
