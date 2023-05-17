package chapter05.classes_abstract;

public class Loop extends TemplateClass {

	@Override
	int questionedMethod(int n) {
	      int tot = 0;
	      for(int i = 0;i < n; i++)
	         tot = tot + 1;
	      return tot;
	}

}
