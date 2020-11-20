package pr21;

import java.util.Scanner;

class ExceptionsTest {

    public static void main(String[] args) {

        //������� 1
        //System.out.println(2 / 0);
        //������� 1.1
        //System.out.println(2.0 / 0.0); ��������� Infinity;
        //������� 1.2
        //exceptionDemo(); ������ ����� �� ������� ����� ��������, ���� ������� 0 �� ������� ������ ArithmeticException: / by zero

        //������� 2
        //exception1Demo();
        /*��� ���������� catch (Exception e) �������� �� ������
        ���������� ����������� �� ����� (����� Exception - �������� ���� ��������� ����� ����������)*/
        //������� 3
        /* ���������� �������� ������ � ����� "���������� �������� �� 0"*/

        // ������� 4
        //exception2Demo();
        /*���� finally - ��������� ����� ��������� ���, ����������� � ���� �����,
        � ����� ������, ���� �� ���������� ��� ���*/


    }

    public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
    }
    public static void exception1Demo() {
        try {
            System.out.println(2 / 0);
        }catch (Exception e){
            System.out.println("����� ���������� ������ Exception");
        }
    }
    public static void exception2Demo() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an int");
        try {
            int i = Integer.parseInt(myScanner.next());
            System.out.println(2 / i);
        }catch (ArithmeticException e){
            System.out.println("���������� �������� �� 0");
        }catch (NumberFormatException e){
            System.out.println("������������ ����");
        }finally{
            System.out.println("Finally");
        }
    }


}