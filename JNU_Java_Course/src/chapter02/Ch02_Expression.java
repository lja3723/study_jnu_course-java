package chapter02;

public class Ch02_Expression {
	public static void p07_ExpressionType() {
		byte b1 = 3;
		byte b2 = 5;
		//byte b3 = b1 + b2; // invalid 
		//식 b1 + b2의 타입이 int이므로 이를 byte형 변수 b3에 대입할 수 없다
		byte b3 = (byte)(b1 + b2); // 바른 처리 
		//그러나 식이 리터럴로 이루어진 경우에는 다르다
		byte b = 7 + 20 * 6; // OK
		//식의 타입이 int이더라도 값이 127이하이면 대입 가능
		char ch = 'A' + 0; // OK
		//byte b = 7 + 20 * 7; // invalid
		//식의 값이 127 상회
		//"Type mismatch, cannot convert from int to byte"
	}
}
