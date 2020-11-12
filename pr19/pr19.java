package pr19;
import java.io.*;


public class pr19 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    pr19() throws IOException {
        System.out.println("-----����������� ������ � ���� �������� � ���������� ����������!-----");
        System.out.println("������� �������� �����!");
        Write();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("-----����������� ����� ���������� �� ����� �� �����!-----");
        OutPut();
        System.out.println("---------------------------------------------------------");
        System.out.println("-----�������� ���������� � ����� �� ����������, �������� � ����������!-----");
        Rewritting();
        System.out.println("��������� ����������!");
        OutPut();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("-----�������� � ����� ��������� ����� �����!-----");
        AddLast();
        System.out.println("��������� ����������!");
        OutPut();
        System.out.println("\n-------------------------------------------------");


    }

    void Write() throws IOException {
        OutputStream outputStream = new FileOutputStream("C://Users//pypki//IdeaProjects//pr9//src//pr19//" + reader.readLine());
        System.out.println("������� ����������, ������� ������ ��������! ����� ����� exit");
        while (true) {
            String data = reader.readLine();
            if (data.equals("exit")) {
                break;
            } else {
                outputStream.write((data + "\r\n").getBytes());
            }
        }
        System.out.println("���������� ��������!");
        outputStream.close();
    }

    void OutPut() {
        try (FileReader reader2 = new FileReader("C://Users//pypki//IdeaProjects//pr9//src//pr19//txtx")) {
            int c;
            while ((c = reader2.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void Rewritting()
    {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� ����������,�� ������� ������ ��������! ����� ����� exit");
        try (FileWriter writer = new FileWriter("C://Users//pypki//IdeaProjects//pr9//src//pr19//txtx", false)) {
            while (true) {
                String text = reader2.readLine();
                if (text.equals("exit")) {
                    break;
                } else {
                    writer.write(text + "\n");
                    writer.flush();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void AddLast()

    {
        try (FileWriter writer = new FileWriter("C://Users//pypki//IdeaProjects//pr9//src//pr19//txtx", true)) {
            String text = "Hello World!";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        pr19 Test = new pr19();
    }
}


