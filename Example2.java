// Пример использования анонимного класса
public class Example2 {
    public static void main(String[] args){
        A cleaner = new A();
        System.out.println(cleaner.clean("Ivan"));
    }
}

class A implements Cleaner{

    @Override
    public int clean(String user) {
        return user.length();
    }
}
