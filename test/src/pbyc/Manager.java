package pbyc;

public class Manager extends Account{
@Override
public double calsal(double sal, double bonus) {
	// TODO Auto-generated method stub
	return calsal(sal+bonus);
}
@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return calsal(sal + bonus - tax);
	}
}
