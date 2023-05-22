package chapter05.classes_interface;

public class SamsungPhone implements Phone {

	// 인터페이스 구현
   public void sendCall() {
      System.out.println("띠리리리링");
   }
   public void receiveCall() {
      System.out.println("전화가 왔습니다.");
   }

   // 메소드 추가 작성
   public void flash() { 
      System.out.println("전화기에 불이 켜졌습니다."); 
   }


}
