public class Example1 {
/*Анонимные классы позволяют создавать реализации функциональных интерфейсоф в виде объектов
* Эту запись позволяет сократить лямбда выражение
* */
    public static void main(String[] args){
        // Так(ниже) создается объект анонимного класса.
        // Сам класс Cleaner не существует, т к Cleaner - интерфейс
        //cleaner - объект анонимного класса

        Cleaner cleaner = new Cleaner() {
            @Override
            public int clean(String user) {
                return user.length();
            }
        };

        System.out.println(cleaner.clean("Tom"));
    }
}
