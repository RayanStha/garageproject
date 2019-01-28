package garageproj;

import java.util.Scanner;
public class garage {

    /**     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input=new Scanner(System.in);

        char slots[]=new char [9];
        int i;
        int command;
        int spot;

        //filling the array
        for (i=0;i<slots.length;i++)
        {
            slots[i]= 'E';

        }

        //prompt the user for input

        do
        {
            System.out.println("What would you like to do?");
            System.out.println("Enter 1 to display garage status");
            System.out.println("Enter 2 to park a car");
            System.out.println("Enter 3 to remove a car");
            System.out.println("Enter 4 to close the garage");
            // System.out.println("Enter 5 to terminate the program.");
            command=input.nextInt();

         /*   if(command == 5){
                System.out.println("The program is about to terminate. Good Bye!");
                System.exit(0);
            }*/


            if(command <1 || command >4){
                System.out.println("ERROR!" + " Please enter a number from 1 to 4!");
            }
            if (command==1)
            {
                System.out.println(slots);
            }

            else if (command==2)
            {
                System.out.println("Where would you like to park the car");
                spot=input.nextInt();


                if (slots[spot]=='o')
                {
                    System.out.println("ERROR! Spot is occupied");
                } else{
                    slots[spot]='o';

                    System.out.println(slots);
                }

            }


            else if (command==3)
            {
                System.out.println("What car would you like to remove");
                spot=input.nextInt();

                if (slots[spot]=='E')
                {
                    System.out.println("Error! spot is empty!");
                }
                else{
                    slots[spot]='E';
                    System.out.println(slots);
                }
            }
            else if (command==4)
            {
                for (i=0;i<slots.length;i++)
                    if (slots[i]=='o')
                    {
                        System.out.println("Error! there are still cars in the garage");
                        command=6;
                    }


            }


        }while(command!=4);
        System.out.println("Garage is closing have a nice day.");








    }
}



