package stackandqueue;

public class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getType() {
    return name;
  }

  public void setType(String type) {
    this.name = type;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      '}';
  }
}
