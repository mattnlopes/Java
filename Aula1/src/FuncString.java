public class FuncString {

    public static void main(String[] args) {
        String str = "Curso de Java!";

        str.charAt(2);

        System.out.println(str.equals("Curso de Java!"));

        System.out.println(str.startsWith("Curs"));

        System.out.println(str.endsWith("java!"));

        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));

        System.out.println(str.replace("Java", "Javaaaaaaa"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.trim());

        System.out.println(str.length());
    }
}
