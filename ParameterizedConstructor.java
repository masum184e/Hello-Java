//Let's set value using constructor
//constructor method is a special type of method
//constructor method er nam,or class er nam same hote hoi
class Car{
  int price;
  String model;
  Car(int price_argument,String model_argument){//eta constructor method -> kno return type nai,class er nam Car,method er nam o Car
    this.price=price_argument;
    this.model=model_argument;
  }
  void display(){
    System.out.println("Car Price: "+price);
    System.out.println("Car Model: "+model);
  }
}
class ParameterizedConstructor{
  public static void main(String[] args){
    Car Mercedes=new Car(500,"GLE");
    //method e value pass korte hoi method call korar somoi,but constructor method to call kora jai nah,taile value pass korbo kemne?
    //constructor method call kora jai nah,but automatically call to hoi,taile jokhon automatically call hoi tokhon value pass korbo
    //constructor automatically call hoi jokno object create hoi, tai object create korar somoi value pass kor hoece -> new Car(500,"GLE")
    Mercedes.display();

    System.out.println();

    Car Tesla=new Car(600,"Model Y");
    Tesla.display();
  }
}
