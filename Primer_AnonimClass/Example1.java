package Primer_AnonimClass;
/*
* Пример работы с анонимными классами для обычных интерфесов
* */
public class Example1 {
    public static void main(String[] args){
        Run ferrari = new Run() {
            @Override
            public void run() {
                System.out.println("Ferrari run");
            }

            @Override
            public void stop() {
                System.out.println("Ferrari stop");
            }
        };
        Run zaz = new Run() {
            @Override
            public void run() {
                System.out.println("Zaz run");
            }

            @Override
            public void stop() {
                System.out.println("Zaz stop");
            }
        };

        ferrari.run();
        ferrari.stop();
        zaz.run();
        zaz.stop();
    }
}
