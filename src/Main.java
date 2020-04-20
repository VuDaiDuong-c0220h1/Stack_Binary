import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BinaryStack stack = new BinaryStack(50);
        System.out.println("Nhập số cần chuyển đổi:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0){
            int surplus = number % 2;
            stack.push(surplus);
            number = number / 2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
        stack.display();
        System.out.println();
        System.out.println(Integer.toBinaryString(111));
    }
}
