 
 //constructor overloading
 //polymorphism
 
 
 
 class oop2 {
    public static void main(String[] args) {
        student1 sc =new student1();
        student1 sc1=new student1("anu",21);
        System.out.println(sc1.name+"  "+sc1.age);
       student1 sc2=new student1("anu");
       System.out.println(sc2.name);
    }
}
class student1{
    String name;
    int age;

     student1() {                       //non parameterized const
        System.out.println("constructor called");
    }

     student1(String name, int age) {  // parameterizes const
        this.name = name;
        this.age = age;
    }
    student1(String newval){
        name=newval;
    }
    

    
}
