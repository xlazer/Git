package lab03;
public class RationalNumber {
//ініціалізація змінних
	int numerator, denominator;
//конструктори
	public RationalNumber() {
		this.numerator=1;
		this.denominator=1;
	}
	public RationalNumber(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
//знаходдження найбільшого спільного дільника
	public static int gcd(int a, int b) {
		while (a!=0 && b!=0){
		    if (a>b)
		        a=a%b;
		    else
		        b=b%a;
		}
		if(a>b) return a;
		else return b;
	}
//додавання двох дробів	
	public static RationalNumber add(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();
		//якщо знаменники рівні
		if(first.denominator==second.denominator){
			result.denominator=first.denominator;
			result.numerator=first.numerator+second.numerator;
		}else {
			result.denominator=first.denominator*second.denominator;
			result.numerator=first.numerator*second.denominator+second.numerator*first.denominator;
		}
		//скорочення дробу
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//віднімання двох дробів
	public static RationalNumber sub(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();
		//якщо перший дріб більший
		if (compare(first, second)) {
			//якщо знаменники рівні
			if(first.denominator==second.denominator){
				result.denominator=first.denominator;
				result.numerator=first.numerator-second.numerator;
			}else {
				result.denominator=first.denominator*second.denominator;
				result.numerator=first.numerator*second.denominator-second.numerator*first.denominator;
			}
		}else{
			//якщо знаменники рівні
			if(first.denominator==second.denominator){
				result.denominator=first.denominator;
				result.numerator=second.numerator-first.numerator;
			}else {
				result.denominator=first.denominator*second.denominator;
				result.numerator=second.numerator*first.denominator-first.numerator*second.denominator;
			}
		}
		//скорочення дробу
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//множення двох дробів
	public static RationalNumber mul(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();		
		result.numerator=first.numerator*second.numerator;
		result.denominator=first.denominator*second.denominator;
		//скорочення дробу
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//ділення двох дробів
	public static RationalNumber div(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();	
		result.numerator=first.numerator*second.denominator;
		result.denominator=first.denominator*second.numerator;
		//скорочення дробу
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
}
//порівняння двох дробів
	public static boolean compare(RationalNumber first, RationalNumber second){
		boolean result;
		if(first.numerator*second.denominator>=second.numerator*first.denominator) result=true;
		else result=false;
		return result;
	}
//вивід
	public static void out(RationalNumber drib){
		System.out.println(drib.numerator+"/"+drib.denominator);
	}
}
