package calcu;

public class Polynomial {

	private int expo;
	private int coef;
	
	public Polynomial(int expo, int coef) {
		super();
		this.expo = expo;
		this.coef = coef;
	}
	
	public int getExpo() {
		return expo;
	}
	public int getCoef() {
		return coef;
	}
	public void setExpo(int expo) {
		this.expo = expo;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	
}
