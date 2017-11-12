import java.util.Scanner;

public class Driver {

    private static Scanner sc = new Scanner(System.in);
    private static Book book = null;
    private static InformBook inform = new InformBook();

    private static Sales sales;
    private static Admin admin ;
    private static StockSupplies stock;

    public static void main(String[] args) {
//        InformBook inform = new InformBook();
//        inform.register(new Sales());
//        inform.register(new Admin());
//        inform.register(new StockSupplies());
//
//        Book book = new Book();
//        book.setTile("Java 8 Lambda functions");
//        book.setCondition(BookCondition.DAMAGED);
//
//        Library library = new Library();
//        library.returnBook(book);

        startCommandLineApp();

    }

    private static void startCommandLineApp(){
        System.out.println("Notice: This example simulates a library where each time a reader returns a book the\n" +
                "returnBook() method is executed. If the reader returns a book that is damaged then the application warns\n" +
                "the observers that are suscribed\n");
        int option ;
        printInitialMenu();
        do {

            option = sc.nextInt();

            switch (option) {
                case 1:
                    rentBook();
                    break;

                case 2:
                    returnBook();
                    break;

                case 3:
                    addObserver();
                    break;

                case 4:
                    removeObserver();
                    break;

                case 0:
                    // do nothing
                    break;

                default:
                    System.out.println("Please select another option from the menu");
                    break;
            }
        }while(option != 0);

        System.out.println("Thanks for using the app");
    }

    private static void removeObserver(){
        System.out.println("Who would you like to un-suscribe");
        printObserverMenu();
        int observerOption = 0;

        do {
            observerOption = sc.nextInt();
            switch (observerOption) {
                case 1:
                    inform.unregister(sales);
                    System.out.println("Sales removed");
                    break;

                case 2:
                    inform.unregister(admin);
                    System.out.println("Admin removed");
                    break;

                case 3:
                    inform.unregister(stock);
                    System.out.println("Stock removed");
                    break;

                case 0:
                    printInitialMenu();
                    break;

                default:
                    printObserverMenu();
                    break;
            }
        }while(observerOption != 0);
    }

    private static void addObserver(){
        System.out.println("Who would you like to notify");
        printObserverMenu();
        int observerOption = 0;

        do {
            observerOption = sc.nextInt();
            switch (observerOption) {
                case 1:
                    sales = new Sales();
                    inform.register(sales);
                    System.out.println("Added Sales");
                    break;

                case 2:
                    admin = new Admin();
                    inform.register(admin);
                    System.out.println("Added Admin");
                    break;

                case 3:
                    stock = new StockSupplies();
                    inform.register(stock);
                    System.out.println("Added Stock Supplies");
                    break;

                case 0:
                    // do nothing
                    printInitialMenu();
                    break;

                default:
                    System.out.println("Try again");
                    break;


            }
        }while(observerOption != 0);
    }

    private static void printObserverMenu(){
        System.out.println("***************************");
        System.out.println("* Choose an observer:     *");
        System.out.println("* 1. Sales                *");
        System.out.println("* 2. Admin                *");
        System.out.println("* 3. Stock                *");
        System.out.println("* 0. Go Back              *");
        System.out.println("***************************");
    }

    private static void returnBook(){
        if(book == null){
            System.out.println("Nothing to return.");
        }else{
            System.out.println("What's the condition of the book you are returning");
            printBookConditionMenu();
            int bookCondition = sc.nextInt();

            do{
                switch(bookCondition) {
                    case 1:
                        book.setCondition(BookCondition.DAMAGED);
                        bookCondition = 0;
                        break;

                    case 2:
                        book.setCondition(BookCondition.NEW);
                        bookCondition = 0;
                        break;

                    case 3:
                        book.setCondition(BookCondition.USED);
                        bookCondition = 0;
                        break;

                    case 4:
                        book.setCondition(BookCondition.GOOD);
                        bookCondition = 0;
                        break;
                    case 5:
                        book.setCondition(BookCondition.VERYGOOD);
                        bookCondition = 0;
                        break;
                    default:
                        System.out.println("Choose on the conditions listed below");
                        break;
                }

            }while(bookCondition != 0);

            Library library = new Library();
            library.returnBook(book);
            book = null;
            System.out.println("\nPress 0 to exit or choose another option");
        }
    }

    private static void printBookConditionMenu(){
        System.out.println("****************************");
        System.out.println("* Select book's condition: *");
        System.out.println("* 1. Damaged               *");
        System.out.println("* 2. As New                *");
        System.out.println("* 3. Used                  *");
        System.out.println("* 4. Good                  *");
        System.out.println("* 5. Very good             *");
        System.out.println("****************************");
    }

    private static void rentBook(){
        if(book != null){
            System.out.println("You already rented a book");
        }else{
            book = new Book();

            System.out.println("Enter the title of the book:");
            String title = sc.next();
            book.setTile(title);
        }

    }

    private static void printInitialMenu(){
        System.out.println("***************************");
        System.out.println("* Choose an option:       *");
        System.out.println("* 1. Rent a book          *");
        System.out.println("* 2. Return book          *");
        System.out.println("* 3. Add observer         *");
        System.out.println("* 4. Remove observer      *");
        System.out.println("* 0. Exit                 *");
        System.out.println("***************************");
    }
}
