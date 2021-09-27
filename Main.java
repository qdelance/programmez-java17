public class Main {
    public static void main(String[] args) {

        System.out.println(formatValue(10d));
        System.out.println(formatValue(10));
        System.out.println(formatValue(10l));
        System.out.println(formatValue("dix"));
    }

    static String formatValue(Object o) {
        return switch (o) {
            case Double d -> String.format("Double value is %f", d);
            case Integer i -> String.format("Integer value is %d", i);
            case Long l -> String.format("Long value is %d", l);
            case String s -> String.format("String value is %s", s);
            default -> o.toString();
        };
    }
}
