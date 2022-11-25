class Car{
  int price;
  String model;
  //initially kno value nai
  //setData method er maddhome value set korbo
  //jehetu just value set korbo,kno kicu return korar dorkar nai,tai return type void
  //class er variable gula k instance variable bole
  void setData(int price_argument,String model_argument){
    this.price=price_argument;//price current class er instance varible tai this dara refer kore dicci price ta this class er variable
    this.model=model_argument;//this.model maneu same,model variable this class er(current class) variable
    //price_argument,model_argument setData method er argument
  }
  void display(){
    System.out.println("Car Price: "+price);
    System.out.println("Car Model: "+model);
  }
}
class SetData{
  public static void main(String[] args){
    Car Mercedes=new Car();
    Mercedes.setData(500,"GLE");//Mercedes object er attribute(class er instance variable er value) set kora hosse
    Mercedes.display();

    System.out.println();

    Car Tesla=new Car();
    Tesla.setData(600,"Model Y");//Tesla object er attribute(class er instance variable er value) set kora hosse
    Tesla.display();
    //multiple object er jonno jei problem ta hossilo (multiple object er attribute gular value same cilo) seta solve hoilo
  }
}
