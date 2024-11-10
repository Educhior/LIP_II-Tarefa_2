public class TesteClass {
    public static void main(String[] args) {
        Animal cat = new Cat("Whiskers");
        Dog dog = new Dog("Rex");
        BigDog bigDog = new BigDog("Max");

        
        cat.greets();  
        dog.greets();  
        bigDog.greets();  

        Dog anotherDog = new Dog("Buddy");
        dog.greets(anotherDog);  // Woof Woof

        BigDog anotherBigDog = new BigDog("Rocky");
        bigDog.greets(anotherBigDog);  // Woow Woow
    }
}
