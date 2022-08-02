class Dog implements Speaker, Walker {

  public void speak() {
    System.out.println("woof");
  }

  public void walk() {
    System.out.println("four legs");
  }

}