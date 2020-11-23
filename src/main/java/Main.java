import java.util.Scanner;

public class Main {

    private static final int STOP_PROGRAM = 0;
    private static final int ADD = 1;
    private static final int SERVE = 2;
    private static final int VIEW = 3;
    private static final int EVOKE = 4;



    public static void main(String[] args) {

        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - add person to queue");
            System.out.println("2 - serve person from first or second queue");
            System.out.println("3 - view queue");
            System.out.println("4 - evoke from one queue");



            option = sc.nextInt();

            switch (option) {
                case ADD:
                    System.out.println("Your'e adding a person........");
                    addPerson(queue);
                    System.out.println(queue.toString());
                    break;
                case SERVE:
                    System.out.println("You are serving persons.........");
                    System.out.println("1 - first queue");
                    System.out.println("2 - second queue");
                    Scanner sc1 = new Scanner(System.in);
                    queue.removeFromQueue(sc1.nextInt());
                    System.out.println(queue.toString());
                    break;
                case VIEW:
                    System.out.println("View of queues.........");
                    System.out.println(queue.toString());
                    break;
                case EVOKE:
                    System.out.println("Evoking from one queue.........");
                    evoke(queue);

            }

        }
        while (option != STOP_PROGRAM);
    }

    private static void evoke(Queue queue) {
        System.out.println("1 - first queue");
        System.out.println("2 - second queue");
        Scanner sc2 = new Scanner(System.in);
        int number = sc2.nextInt();
        System.out.println("Enter name:");
        String name = sc2.nextLine();
        System.out.println("Enter surname:");
        String surname = sc2.nextLine();
        queue.evokeFromOne(number, name, surname);
    }


    private static void addPerson(Queue queue) {
        Scanner scqueue = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scqueue.nextLine();
        System.out.println("Enter surname:");
        String surname = scqueue.nextLine();
        queue.addToQueue(new Person(name, surname));
    }


}

