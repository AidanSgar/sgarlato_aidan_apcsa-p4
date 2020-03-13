//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	
	private int num;
	private int den;
	public Rational() {
		this(1,1);
	}
	public Rational(int a, int b) {
		setRational(a,b);
	}
	public void setRational(int a, int b) {
		num = a;
		den = b;
	}
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	public void add(Rational  other)
	{
		num = num*other.getDen()+other.getNum()*den;
		den *= other.getDen();
		reduce();
	}

	private void reduce()
	{
		den = gcd(den,num);
		num /= den;

	}

	private int gcd(int a, int b)
	{
	    while (b != 0) {
	        int tmp = a;
	        a = b;
	        b = tmp % b;
	    }
	    return a;
	}

	public Rational clone ()
	{
		return new Rational(num,den);
	}
	
	public boolean equals( Rational obj)
	{
		if(num == obj.getNum() && den == obj.getDen()) return true;
		else return false;
	}

	public int compareTo(Rational other)
	{
		if(((double)num)/((double)den) <  ((double)other.getNum())/((double)other.getDen()))return -1;
		else if(((double)num)/((double)den) >  ((double)other.getNum())/((double)other.getDen()))return 1;
		else return 0;
	}
	
	public String toString() {
		return num + "/" + den;
	}
	
	
}