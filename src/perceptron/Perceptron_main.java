package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nu[] = {0.25,0.25};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.8);
		
		//学習データ
		double input[][] = {{1,1},{1,0},{0,1},{0,0}};
		double output[] = {0,1,1,1};
		
		//学習
		int index;
		for(int i = 0; i < 150; i++){		
			index = (int)(Math.random()*4); 
		    plib.getParameter(input[index], output[index]);
		    System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}
		//結果確認
		for(int i = 0; i < output.length; i++){
		    if(plib.getOutput(input[i]) == output[i])
		    System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		    else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
	}

}
//AND演算で、17行目の桁、nuの数値、θの値をAND演算になるように調整した。私ができる最大の力はそこまでであった...
