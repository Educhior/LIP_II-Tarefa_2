class BigDog extends Dog {

    public BigDog(String name) {
        super(name); 
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog anotherDog) {
        System.out.println("Woof Woof");
    }

    public void greets(BigDog anotherBigDog) {
        System.out.println("Woow Woow");
    }
}
