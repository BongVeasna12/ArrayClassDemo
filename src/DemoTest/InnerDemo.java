package DemoTest;
 class InnerDemo {
     void testShow(){
     }
   private final int outerField= 20;
  class InnerHa {
      int innerField = 40;
      void accessField() {
          InnerDemo test = new InnerDemo(){
              @Override
              void testShow() {
                  System.out.println("Here is the inner");
              }
          };
          test.testShow();

          System.out.println("outer field: " + innerField);
          System.out.println("inner field: " + InnerDemo.this.outerField);
      }
  }
     public static void main(String[] args) {
         InnerDemo demo = new InnerDemo();
         InnerDemo.InnerHa  sd = demo.new InnerHa();
         sd.accessField();
     }

}
