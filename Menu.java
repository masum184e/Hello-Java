/*====================================MENU PRGRAM - SWITCH & WHILE====================================*/
import java.util.Scanner;//Scanner is a build-in class,jeta user input nite use hoi,r built-in jekono kicu(function/method/class/package) jokhon use korte hole import kore nite hoi
class Menu{
  public static void main(String[] args){

    //Scanner class import kora hoice,but class ta use kora hoi nai,class use korar jonno object create korte hoi
    Scanner obj=new Scanner(System.in);

    char again;
    do{
      //GETTING TWO NUMBER FROM USER
      System.out.print("Enter First Number: ");
      int first_number=obj.nextInt();
      System.out.print("Enter Second Number: ");
      int second_number=obj.nextInt();

      System.out.println();//NEW LINE FOR FORMATING OUTPUT

      //SHOWING USER OPTION
      System.out.println("1.Addition");
      System.out.println("2.Substraction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");

      System.out.println();//NEW LINE FOR FORMATING OUTPUT

      //GETTING USER CHOICE FROM OPTION
      System.out.print("Choose An Option: ");
      int choice=obj.nextInt();

      //MENU OPERATION USING IF ELSE
      // if(choice==1){
      //   System.out.println("Your Output Is: "+first_number+" + "+second_number+" = "+(first_number+second_number));
      // }else if(choice==2){
      //   System.out.println("Your Output Is: "+first_number+" - "+second_number+" = "+(first_number-second_number));
      // }else if(choice==3){
      //     System.out.println("Your Output Is: "+first_number+" * "+second_number+" = "+(first_number*second_number));
      // }else if(choice==4){
      //     System.out.println("Your Output Is: "+first_number+" / "+second_number+" = "+(first_number/second_number));
      //     // System.out.println("Your Output Is: "+first_number+" / "+second_number+" = "+((double)first_number/second_number));
      // }else{
      //   System.out.print("You Choose Wrong Option");
      // }

      //MENU OPERATIN USING SWITCH
      switch(choice){
        //if else e if(choice==1) likhcilam
        //ekhane choice cilo variable r 1 cilo value
        //if er vitor j variable likha hoi,switch er vitor same variable likhte hoi
        //if er viotr j value    likha hoi,switch er case e sei value likhte hoi
        case 1:
          System.out.println("Your Output Is: "+first_number+" + "+second_number+" = "+(first_number+second_number));
          break;
        case 2:
          System.out.println("Your Output Is: "+first_number+" - "+second_number+" = "+(first_number-second_number));
          break;
        case 3:
          System.out.println("Your Output Is: "+first_number+" * "+second_number+" = "+(first_number*second_number));
          break;
        case 4:
          System.out.println("Your Output Is: "+first_number+" / "+second_number+" = "+(first_number/second_number));
          // System.out.println("Your Output Is: "+first_number+" / "+second_number+" = "+((double)first_number/second_number));
          break;
        default:
          System.out.print("You Choose Wrong Option");
      }

      System.out.print("Do You Want Again(Y/N): ");
      again=obj.next().charAt(0);
      //just akta character input neua dorkar
      //java te charcter inut neur jonno kno built-in function nai jamon integer er jonno nextInt,string er jonno nextLine/next
      //tai obj.next() diey akta string neua hoi
      //then obj.next() diey j string input nici tar 0 index er character er access paite charAt(0) likha hoi
      //"Hello".charAt(0) -> H return kore,karon 0 index e H ace
      //"Hello".charAt(4) -> o return kore,karon 4 index e o ace
      //jehetu akta charecter dorkar,tai akta string input niey tar first character tar access neuar jonno obj.next().charAt(0) neua hoice
    }while(again=='Y');
    //jodi user N enter kore tar mane se r operation korte chasse nah,taile N==Y condition false hobe,loop r cholbe nah
    //jodi user Y enter kore tar mane se operation chasse, taile Y==Y condition true hobe & loop cholbe
  }
}