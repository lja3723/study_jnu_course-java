package chapter05.classes_abstract;


import java.util.Scanner;

public class FigureTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Figure figure = null; // 모든 참조는 Shape에 upcast 될 수 있다
        System.out.print("번호  입력 0: 종료, 1: 사각형, 2: 직각삼각형, 3: 이등변삼각형");
        
        int shapeNumber = input.nextInt();
        while (shapeNumber != 0) {
            switch (shapeNumber) {
                case 1:
                    figure = new Square(5, 5);
                    figure.setNameChar('*'); // *을 이용하여 그린다 
                    break;
                    
                case 2:
                    figure = new RightTriangle(3, 4); // 별도 문자 미지정
                    break;
                    
                case 3:
                    figure = new Triangle(5, 4);
                    figure.setNameChar('+'); // + 이용하여 그림
                    break;
                    
                default:
                    System.out.println("Invalid entry"); // 도형번호가 1, 2, 3이 아니면
                    System.exit(0); // 착오, 프로그램 종료
            }
            
            figure.draw();
            System.out.print("면적 = " + figure.area() );

            System.out.print("\n번호 입력 0: 종료, 1: 사각형, 2: 직각삼각형, 3: 이등변삼각형");
            shapeNumber = input.nextInt();
        } // while
        System.out.println("프로그램 종료됩니다.");
    } // main
} // class
