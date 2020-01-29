package Creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Tyre r15 = TyreFactory.createTyre(TyreType.R15);
        Tyre r17 = TyreFactory.createTyre(TyreType.R17);
        Tyre r19 = TyreFactory.createTyre(TyreType.R19);

        System.out.println(r15.toString());
        System.out.println(r17.toString());
        System.out.println(r19.toString());
    }
}
