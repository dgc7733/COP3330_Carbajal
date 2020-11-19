import java.util.Scanner;

public class App {
    public static void main(String[] args){

         displayMainMenu();


        }



        public static void displayMainMenu()//displays the main menu
        {
            System.out.print("Main Menu%n---------");
            System.out.print("1) create a new list");
            System.out.print("2) load an existing list");
            System.out.print("3) quit");

        }



        public void mainMenuTaskChoice(){
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice != 3) {

                if (choice == 1) {

                    TaskList myList = new TaskList();
                    System.out.print("new task list has been created");
                }
                else if (choice == 2) {
                    ;
                }
            }

            else if (choice == 3){
                ;
            }

            else{
                System.out.print("Invalid choice. Try again");
            }

        }


        public void ListOperationMenu(){
            System.out.println("List Operation Menu");
            System.out.println("---------");
            System.out.println("1) view the list");
            System.out.println("2) add an item");
            System.out.println("3) edit an item");
            System.out.println("4) remove an item");
            System.out.println("5) mark an item as completed");
            System.out.println("6) unmark an item as completed");
            System.out.println("7) save the current list");
            System.out.println("8) quit to the main menu");
        }

        public void ListOperationMenuChoice(){
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1){
                ;
            }


            else if (choice == 2){
                ;
            }
        }

        public void viewList(){


        }


        public void addItem(){

        }

        public void editItem(){

        }

        public void removeItem(){

        }

    }

}

