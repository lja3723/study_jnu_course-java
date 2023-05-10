package chapter05.classes_exception;

public class P25_Ex {
   public static void a() throws Exception {
        b();
   }
   static void b() throws Exception {
        c();
   } 
   static void c() throws Exception {
        throw new Exception("Exception generated in c()");
   }
}
