package cn.zhen77;

public class Log4jTest {

    public static void main(String[] args) {
        try {
            Class.forName("org.slf4j.impl.Log4jLoggerFactory");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Class.forName("org.apache.log4j.Log4jLoggerFactory");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

