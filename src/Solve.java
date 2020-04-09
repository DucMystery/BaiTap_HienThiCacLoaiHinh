import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice=-1;

        while (choice!=0){
            System.out.println("Menu :");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter the choice:");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Print the rectangle :");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    for (int i=0;i<5;i++){
                        for (int j=0;j<=i;j++){
                            System.out.print("*"+"\t");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i= 0;i<5;i++){
                        for (int j= 0;j<=5-i;j++) {
                            System.out.print(" ");
                        }
                        for (int k=0;k<2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }

    }
}
