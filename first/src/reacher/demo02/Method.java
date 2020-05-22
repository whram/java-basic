package reacher.demo02;

public class Method {
    public static void main(String[] args) {
        curb();
    }

    public static void curb(){
        for (int j = 0; j < 5; j++) {
            for(int i = 1; i <= 20; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
