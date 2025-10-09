import java.util.Scanner;

class Lab2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Length: " + str.length());

        if (args.length > 0) {
            System.out.println("Command line input:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line input provided.");
        }

        sc.close();
    }
}