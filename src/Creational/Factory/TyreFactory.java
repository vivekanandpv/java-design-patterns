package Creational.Factory;

public class TyreFactory {
    public static Tyre createTyre(TyreType type) {
        switch (type) {
            case R15:
                return new R15Tyre();

            case R17:
                return new R17Tyre();

            case R19:
                return new R19Tyre();

            default:
                return null;
        }
    }
}
