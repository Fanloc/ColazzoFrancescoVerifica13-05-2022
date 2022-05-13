/**
 * 
 * Classe ColazzoFrancescoClass
 * @author 6<b>Colazzo Francesco</b>
 * <U> 	4BI </U>
 * <i> 13/05/2022</i>
 *
 */
public class ColazzoFrancescoClass {
	/**
	 * Costruttore vuoto
	 */
	public ColazzoFrancescoClass() {}
	/**
	 * Metodo colazzoMet
	 * Questo metodo restituisce la somma di tutti i numeri interi 
	 * compresi tra 0 e l'indice inserito 
	 * @param f indice
	 * @return somma
	 */
	public int colazzoMet(int f) {
		int r = 1;
		for(int i=f;i<0;i++) {
			r = r*i;
		}
		return r;
	}
	
	public static void main(String[] args) {
	
		ColazzoFrancescoClass c = new ColazzoFrancescoClass();
		System.out.println(c.colazzoMet(5));
	}

}
