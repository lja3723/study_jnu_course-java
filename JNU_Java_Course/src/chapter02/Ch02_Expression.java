package chapter02;

public class Ch02_Expression {
	public static void p07_ExpressionType() {
		byte b1 = 3;
		byte b2 = 5;
		//byte b3 = b1 + b2; // invalid 
		//�� b1 + b2�� Ÿ���� int�̹Ƿ� �̸� byte�� ���� b3�� ������ �� ����
		byte b3 = (byte)(b1 + b2); // �ٸ� ó�� 
		//�׷��� ���� ���ͷ��� �̷���� ��쿡�� �ٸ���
		byte b = 7 + 20 * 6; // OK
		//���� Ÿ���� int�̴��� ���� 127�����̸� ���� ����
		char ch = 'A' + 0; // OK
		//byte b = 7 + 20 * 7; // invalid
		//���� ���� 127 ��ȸ
		//"Type mismatch, cannot convert from int to byte"
	}
}
