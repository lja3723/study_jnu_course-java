package chapter06.classes.nested;

interface Dog{
   String getName();
}

public class AnimalTest {
   public Dog getDog() {
      return new Dog() {
         // class definition start
         String name = "Boston Terrier";
         public String getName() {
            return name;
         }
      }; // class definition end �����ݷ� �ʿ�
   }
   
   public static void main(String[] args) {
	   AnimalTest a = new AnimalTest();
      System.out.println(a.getDog().getName());
   }
}
