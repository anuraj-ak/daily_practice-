

class code7{
     String color;
     int size;

    void setPen(String c, int s) {
        color = c;
        size = s;
    }
}

class Car7 {
   public int number;
    String name;

    void setCar(int n, String nm) {
        number = n;
        name = nm;
    }
}

 class ex {
    public static void main(String[] args) {

        code7 p1 = new code7();
        p1.setPen("Blue", 5);

        Car7 c1 = new Car7();
        c1.setCar(101, "Honda");

        System.out.println("Pen color: " + p1.color);
        System.out.println("Pen size : " + p1.size);

        System.out.println("Car number: " + c1.number);
        System.out.println("Car name  : " + c1.name);
    }
}
