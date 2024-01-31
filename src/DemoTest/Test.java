package DemoTest;

class Polygon {

   public void display(){

   }
  public void test(){
       
  }
}

class AnonymousDemo {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside ");
            }
            public  void test(){
                System.out.println("Inside4 ");
            }
        };
        p1.display();
    }
}

 class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
