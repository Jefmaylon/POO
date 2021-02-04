package igreja;

import java.util.Random;

public class Igreja {

	public int DDD;
	public int[] number;
	
	public Igreja(int DDD, int qtde) {
		this.number = new int [qtde];
		for (qtde = 0; qtde <= number.length; qtde++) {
			number[qtde] = new Random().nextInt(99999999) + 11111111;}
		}
		
	
	


	
	
	
}
