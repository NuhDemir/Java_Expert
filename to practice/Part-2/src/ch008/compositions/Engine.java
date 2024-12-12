package ch008.compositions;

 class Engine {
private int volume;
private int horsePower;

public Engine(int volume,int horsePower){
    this.volume=volume;
    this.horsePower=horsePower;
    System.out.println("A engine is created: "+volume+ " ---- "+horsePower);
}

public void start(){
    System.out.println("\nEngine Started!");
}

     public void stop(){
         System.out.println("\nEngine Stopped!");
     }


 }
