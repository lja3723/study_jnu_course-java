package chapter05.classes_exception;

public class P26_Ex {
	   public static void a() {
		   try {
		        b();
			} catch (Exception e) {
				System.out.println(e.getMessage() + "caught in main");
				e.printStackTrace();
			}
	   }
	   static void b() throws Exception {
	        c();
	   } 
	   static void c() throws Exception {
	        throw new Exception("Exception generated in c()");
	   }
	}