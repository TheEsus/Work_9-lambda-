/*
Разбор такой вещи, как лямбда "->"
Лямбда позовляет сократить запись анонимного класса с его функционалом - пример
* */

public class Example3_Lambda {
    public static void main(String[] args){
        Cleaner cleaner = (String user) -> user.length();//создали объект cleaner и, вместо большого
                                                         // конструктора, пишем, что передаем (String user)
                                                        // удобно если нет подобных методов

        int ans = cleaner.clean("Ivan");
        System.out.println(ans);
    }
}
