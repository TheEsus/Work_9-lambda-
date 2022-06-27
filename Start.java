public class Start {

    public static void main(String[] args){

        int[] mas = new int[]{1, 2, 3, 4, 5};
        Operation operation = (x ,y ) -> x + y;

        int result = summa(mas, operation);
        System.out.println(result);
    }

    public static int summa (int[] mas, Operation f){
        int result = 0;
        for(int i = 0; i< mas.length; i++){
            result = f.calculated(result, mas[i]);
        }
        return result;
    }
}
