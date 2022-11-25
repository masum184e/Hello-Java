//same nam er multiple method use korake method oveloading bole
//method gular nam same hoileu, parameter gula must be different hote hobe
//parameter gula different hote hobe means number of parameter different hobe or type of parameter different hobe
//method gular nam same hoi,but return type same hoteu pare nau pare
class Method{
    void MethodOverloading(){
      System.out.println("No Parameter");
    }
    void MethodOverloading(int x){
      System.out.println("One Parameter-Integer : "+x);
    }
    void MethodOverloading(int x,int y){
      System.out.println("Two Parameter         : "+x+" "+y);
    }
    void MethodOverloading(double x){
      System.out.println("One Parameter-Double  : "+x);
    }
}
class Overloading{
  public static void main(String[] args){
    Method obj=new Method();
    obj.MethodOverloading();//kno parameter nai,java khujbe MethodOverloading nam er kon function e kno parameter accept kore nai,seita execute korbe
    obj.MethodOverloading(1);//akta integer parameter, tai methodOverloading nam er jei function akta integer type er parameter accept kore seta execute korbe
    obj.MethodOverloading(1,2);//2 ta integer parameter, tai methodOverloading nam er jei function 2 integer type er parameter accept kore seta execute korbe
    obj.MethodOverloading(1.2);//akta double parameter, tai methodOverloading nam er jei function akta double type er parameter accept kre seta execute korbe
  }
}
