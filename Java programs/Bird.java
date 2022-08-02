class Bird implements Speaker, Walker {

  public void speak() {
    System.out.println("chirp");
  }

  public void walk() {
    System.out.println("fly");
  }

}