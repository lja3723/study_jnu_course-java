package chapter05.classes_interface;

public class SamsungPhone implements Phone {

	// �������̽� ����
   public void sendCall() {
      System.out.println("�츮������");
   }
   public void receiveCall() {
      System.out.println("��ȭ�� �Խ��ϴ�.");
   }

   // �޼ҵ� �߰� �ۼ�
   public void flash() { 
      System.out.println("��ȭ�⿡ ���� �������ϴ�."); 
   }


}
