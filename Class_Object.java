//class er maddhome object er attribute/property define kore
//akta car er price thake,color thake,model thak, ei gula attribute akare class e define korte hoi
//prottek car er price,color,model thake ja class e define kori,ei gula car er attribute j sob car er thake, specific car k target korte object create korte hoi
class Car{
  int price=500;
  String model="GLE";
  void display(){
    System.out.println("Car Price: "+price);
    System.out.println("Car Model: "+model);
  }
}
class Class_Object{
  public static void main(String[] args){
    Car Mercedes=new Car();
    //class er variable,method gula k instance variable bole
    //object create korar maddhome class er variable,method access kora jai
    System.out.println(Mercedes.price);   //accessing instance variable
    System.out.println(Mercedes.model);   //accessing instance variable
    Mercedes.display();                   //accessing instance method
  }
}
