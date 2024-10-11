package strings;

public class TrimStringDemo {
    public static void main(String[] args) {
        String str=" Data Structure with Java ";
        String str1=str.trim();
        String str2=str.toUpperCase();
        String str3=str.replace("Data","Java");
        char ch=str.charAt(2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(ch);

        String d="Data Structures with Java";
        System.out.print(d);


    }
}
