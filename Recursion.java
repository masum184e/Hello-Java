import java.util.Scanner;
class Recursion{
  int sum(int n){
    if(n>0){
      return n+sum(n-1);
    }
    else{
      return 0;
    }
    //initialy n=5(suppose)
    //after calling sum if(n>0)return n+sum(n-1) will execute because 5>0
    //thats mean it will return 5+sum(5-1 ba 4) - sum(4) sum er vitor e call hoice,taile control abar sum er prothom e chole jabe
    //here n=4
    //after calling sum if(n>0)return n+sum(n-1) will execute because 4>0
    //that mean it will return 4+sum(4-1 ba 3) - sum(3) sum er vitor sum e call hobe,and control again sum er prothom e chole jabe

    //sum(5) return 5+sum(4)
    //sum(4) return 4+sum(3)
    //same vabe sum(3) return 3+sum(2);
    //sum(2) return 2+sum(1)
    //sum(1) return 1+sum(0)
    //sum(0) retrurn 0     -> 0>0 condtion false tai else er part tuku execute kobe

    //bujhar subhidharte math er equation er moto chinta kori
    //sum(5) = 5+sum(4)
    //sum(4) = 4+sum(3)
    //sum(3) = 3+sum(2)
    //sum(2) = 2+sum(1)
    //sum(1) = 1+sum(0)
    //sum(0) = 0
    //sum(0) er man sum(1) er equation e bosai sum(1)=1+0
    //sum(1) er man sum(2) er equation e bosai sum(2)=2+1+0
    //sum(2) er man sum(3) er equation e bosai sum(3)=3+2+1+0
    //sum(3) er man sum(4) er equation e bosai sum(4)=4+3+2+1+0
    //sum(4) er man sum(5) er equation e bosai sum(5)=5+4+3+2+1+0
    //finaly output will 15
  }
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter Last Number: ");
    int n=obj.nextInt();

    Recursion rec=new Recursion();
    System.out.println("Sum of 1 to "+n+": "+ rec.sum(n));
  }
}
