//setData built-in method nah,user defined method(programmer define kore)
//setData j kaj kore same kaj korar jonno constructor use kora hoi
//Constructor is a method but not normal, special
//it doesn't have return type like void/int/bool
//we don't need to call it
//constructor method is called automatically when we create an object of its class
class ConstructorExample{
  ConstructorExample(){//constructor method er kno return type thake nah tai "void ConstructorExample(){//code here} " eivabe lekha hoi nai
    System.out.println("Constructor Called");
  }
}
class Constructor{
  public static void main(String[] args){
    ConstructorExample CE=new ConstructorExample();
    //class er access pauar jonno object create kora hoice
    //class er method/constructor method call kora hoi nai
    //but "Constructor Called" output asce, that means we don't need to call constructor,it is called automatically when we create an object
  }
}
