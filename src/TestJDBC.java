public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("������ʼ���ɹ���");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}