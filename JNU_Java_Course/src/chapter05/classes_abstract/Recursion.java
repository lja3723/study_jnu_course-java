package chapter05.classes_abstract;

public class Recursion extends TemplateClass {

	@Override
	int questionedMethod(int n) {
	      if(n < 1)
	          return n;
	       else 
	         return n + questionedMethod(n-1);
	}

}
