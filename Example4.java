public class Example4 {
    public static void main(String[] args){
        Cleaner cleaner = String::length;
        int ans = cleaner.clean("Ivan");
        System.out.println(ans);
    }
}
