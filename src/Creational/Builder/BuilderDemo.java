package Creational.Builder;


public class BuilderDemo {
    public static void main(String[] args) {
        Server.Builder builder = new Server.Builder();

        Server obj = builder
                .addCountry("India")
                .addHostName("AthTest")
                .addIPAddress("198.0.0.1")
                .build();

        System.out.println(obj.getCountry());
        System.out.println(obj.getHostName());
        System.out.println(obj.getIpAddress());
    }
}
