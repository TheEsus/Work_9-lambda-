package Primenenie_Izuchennogo;

// Из массива найти только четные элементы и возвести в квадрат
public class Example1 {
    public static void main(String[] args){
        Integer[] data = new Integer[] {1,2,3,4,5,6,7,8,9,10};

        //Solver func = (int el) -> el % 2; // таким способом через лямбду можно получить остатки деления на 2
        Solver func = (int el) ->{
            if(el % 2 == 0) {
                System.out.println(el + " - четный ");
                return el * el;
            }
            else {
                System.out.println(el + " - нечетный ");
                return 0;
            }
        };
        map(data,func);
        //Как бы сделал раньше
        /*for(int i = 0; i< data.length; i ++){
            if(data[i] % 2 == 0) {
                System.out.println(data[i] * data[i]);
            }
        }*/
    }

    public static void map(Integer[] param, Solver f){
        for(int num:param){
            f.solve(num);
        }
    }
}
