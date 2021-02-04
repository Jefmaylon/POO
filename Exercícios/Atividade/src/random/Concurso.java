package random;

import java.util.Random;

public class Concurso {

	
	private Concurso() {};
	
	private static int[] vetResultado;
	
	while ( )
	
	public static int[] resultado() {
		if (vetResultado == null);
			vetResultado = new int[6];
			Random rd = new Random();
			int num;
			for(int i=0; i < vetResultado.length; i++) {
				do {
					num = 1 + rd.nextInt(60);
				} while (jaTem(num));
				vetResultado[i] = num;		
			}
			return vetResultado;
		}
		
		private static boolean jaTem (int n) {
			for (int x : vetResultado) {
				if (x == n) {
					return true;
				}
			}
			return false;
		}
		
		public static int acertos(MegaSena aposta, int[] resultado) {
			int ac = 0;
			for (int res : resultado) {
				int[] numeros = aposta.getNumeros();
				for (int n : numeros) {
					if (n == res) {
						ac++;
						break;
					}
				}
			}
			return ac;
		}
		
	}

