package chapter05.classes_abstract;


import java.util.Scanner;

public class FigureTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Figure figure = null; // ��� ������ Shape�� upcast �� �� �ִ�
        System.out.print("��ȣ  �Է� 0: ����, 1: �簢��, 2: �����ﰢ��, 3: �̵�ﰢ��");
        
        int shapeNumber = input.nextInt();
        while (shapeNumber != 0) {
            switch (shapeNumber) {
                case 1:
                    figure = new Square(5, 5);
                    figure.setNameChar('*'); // *�� �̿��Ͽ� �׸��� 
                    break;
                    
                case 2:
                    figure = new RightTriangle(3, 4); // ���� ���� ������
                    break;
                    
                case 3:
                    figure = new Triangle(5, 4);
                    figure.setNameChar('+'); // + �̿��Ͽ� �׸�
                    break;
                    
                default:
                    System.out.println("Invalid entry"); // ������ȣ�� 1, 2, 3�� �ƴϸ�
                    System.exit(0); // ����, ���α׷� ����
            }
            
            figure.draw();
            System.out.print("���� = " + figure.area() );

            System.out.print("\n��ȣ �Է� 0: ����, 1: �簢��, 2: �����ﰢ��, 3: �̵�ﰢ��");
            shapeNumber = input.nextInt();
        } // while
        System.out.println("���α׷� ����˴ϴ�.");
    } // main
} // class
