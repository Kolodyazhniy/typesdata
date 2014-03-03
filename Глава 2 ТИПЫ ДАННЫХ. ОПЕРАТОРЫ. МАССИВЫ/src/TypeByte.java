
public class TypeByte {

	
	public static void main(String[] args) {
		int i = 3;
		byte b = 1, b1 = 1 + 2;
		//b = b1 + 1; //ошибка приведения типов
		//b = (byte)(b1 + 1);//0 wrong 4
		
		//b = (byte)-b;//-1     -4
 		
		b = (byte) + b1; //2 wrong 3
		b1 *= 2; //3
		b1++; //4
		
		b = (byte)i; //5
		b += i++; //работает!!! //6
		float f = 1.1f;
		b /= f; //работает!!! //7
		
		
		System.out.println(+ b);
		
		}
	
	
}
