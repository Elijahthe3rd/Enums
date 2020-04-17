import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {

        Levels rif[]= Levels.values();//assigning enum array values to local Levelsand array
        Scanner userInput=new Scanner(System.in);
        String userType;
        int count = 1;

        System.out.println("User-Type:");
        System.out.println(".........................................................................................................................................................");

        System.out.println("USER PRIVILLAGES AVAILABLE:");
        System.out.println(".........................................................................................................................................................");

        for (Levels i:  rif  ) {
            Test t1=new Test(i);
            System.out.println(t1.checkUserRightsLevel());
        }

        System.out.println(".........................................................................................................................................................\n");
        for (Levels i:  rif  ) {

            if(count == rif.length){
                System.out.println(count + ". " + i+"\n");
            }else{
                System.out.println(count + ". " + i+"");
            }
            count++;
        }

        System.out.println("Enter your choice as is:");
        userType= userInput.nextLine();

        System.out.println("............................................................................................................................................................\n");

        Test t0=new Test(Levels.valueOf(userType));
        System.out.println("you selected " + userType +"!!!\n...please wait");
        System.out.println(t0.checkUserRightsLevel());


        }
}

