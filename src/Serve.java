public class Serve {

    public static void main(String[] args){
        System.out.println("Server logic");

        System.out.println(Add.sum(5,6));
    }
}

class Add{
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}
