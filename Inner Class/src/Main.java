import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    private static Button btnPrint2 = new Button("Print2");
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));


        System.out.println("===================================");

        //Local inner class
        class ClickListener implements Button.OnClickListener {
            public ClickListener(){
                System.out.println("I've been atached!");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        }

        //Anonymous inner class, används ofta när man behöver den klassen endast en gång och den har inget namn.
        btnPrint.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(String title) {
                System.out.println("Title was clicked from anonymous innerClass");
            }
        });





    }
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
