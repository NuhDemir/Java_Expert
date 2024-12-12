package ch008.compositions;

 class Wheel {
//name
     private String name;


     public Wheel(String name){
         this.name=name;
         System.out.println("A wheel is a created: "+name);
     }


     public void rotate(){
         System.out.println("Wheel is rotating");
     }



 }
