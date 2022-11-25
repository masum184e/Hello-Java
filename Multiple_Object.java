class Car{
  int price=500;
  String model="GLE";
  void display(){
    System.out.println("Car Price: "+price);
    System.out.println("Car Model: "+model);
  }
}
class Multiple_Object{
  public static void main(String[] args){
    Car Mercedes=new Car();
    System.out.println(Mercedes.price);
    System.out.println(Mercedes.model);
    Mercedes.display();

    System.out.println();

    Car Tesla=new Car();
    System.out.println(Tesla.price);
    System.out.println(Tesla.model);
    Tesla.display();

    //prottek car different,but eikhane different car(object-Mercedes,Tesla) er jonno same attribute return kortece
    //different object(Mercedes,Tesla) er jonno different value set korte hobe
  }
}
