import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("1.SHOW ITEMS");
        System.out.println("2.PURCHASE ITEMS");
        System.out.println("3.SHOW EXPENSE");
        System.out.println("4.CALCULATE BUDGET");
        System.out.println("5. EXIT");

    }

    public static void show_items(HashMap <String, Integer>  map){
        map.put("potato", 60);
        map.put("tomato", 50);
        map.put("Bindhi", 120);
        map.put("Qadu", 40);
        map.put("Lokee", 150);
        System.out.println(map.entrySet());
    }

    public static void product_menu(){
        System.out.println("1.Bindhi");
        System.out.println("2.potato");
        System.out.println("3.Qadu");
        System.out.println("4.tomato");
        System.out.println("5.Lokee");
        System.out.println("6.GO BACK");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        int total_expense = 0;
        int income;
        System.out.println("enter your income :");
        income= sc.nextInt();

        int option;
        do {
            menu();
            option= sc.nextInt();
            switch (option) {
                case (1):
                    show_items(map);
                    break;
                case (2):
                    int p_option;
                    do {
                        product_menu();
                        System.out.println("enter the menu");
                        p_option = sc.nextInt();
                        switch (p_option) {
                            case (1):
                                System.out.println("please enter the quantity");
                                int quantity = sc.nextInt();
                                total_expense += quantity * 120;
                                System.out.println("you have purchase "+ quantity + "kg of bindhi");
                                System.out.println("rupees : "+ total_expense);
                                break;

                            case (2):
                                System.out.println("please enter the quantity");
                                quantity = sc.nextInt();
                                total_expense += quantity * 60;
                                System.out.println("you have purchase "+ quantity + "kg of potato");
                                System.out.println("rupees : "+ total_expense);
                                break;


                            case (3):
                                System.out.println("please enter the quantity");
                                quantity = sc.nextInt();
                                total_expense += quantity * 40;
                                System.out.println("you have purchase "+ quantity + "kg of Qadu");
                                System.out.println("rupees : "+ total_expense);
                                break;

                            case (4):
                                System.out.println("please enter the quantity");
                                quantity = sc.nextInt();
                                total_expense += quantity * 50;
                                System.out.println("you have purchase "+ quantity + "kg of tomato");
                                System.out.println("rupees : "+ total_expense);
                                break;

                            case (5):
                                System.out.println("please enter the quantity");
                                quantity = sc.nextInt();
                                total_expense += quantity * 150;
                                System.out.println("you have purchase "+ quantity + "kg of lokee");
                                System.out.println("rupees : "+ total_expense);
                                break;

                            case (6):
                                p_option = 0;

                        }
                    } while (p_option != 0);

                case (3):
                    System.out.println("After purchasing items expense :" + total_expense);
                    break;

                case (4):
                    System.out.println("your income is :"+ income);
                    System.out.println("your total expense :" + total_expense);
                    int remaining_amount=income-total_expense;

                    try {
                        if (total_expense>income){
                            throw new RuntimeException();
                        }
                        else {
                            System.out.println("remaining amount you have :" + remaining_amount);
                        }
                    }catch (Exception e){
                        System.out.println("expense exceed");
                    }
                    break;

                case (5):
                    System.exit(0);

            }

        }while (option!=0);
    }
}