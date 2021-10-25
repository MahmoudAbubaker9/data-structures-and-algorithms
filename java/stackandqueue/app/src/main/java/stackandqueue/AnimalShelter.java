package stackandqueue;

public class AnimalShelter {

  Queue catList = new Queue();
  Queue dogList = new Queue();

  /// First we want to know if the animal is a cat or a dog by compare the animal with dog or cat using instanceof
  public void enqueue(Animal animal) {
    if (animal instanceof Cat) {
      catList.enqueue(animal.getType());
    } else if (animal instanceof Dog) {
      dogList.enqueue(animal.getType());
    }
  }

  /// When choosing an animal for adoption, the oldest one will be chosen and for this we used dequeue
  public String dequeue(String pref) {

    if (pref.equals("catList") && !catList.isEmpty()) {
      return catList.dequeue();
    } else if (pref.equals("dogList") && !dogList.isEmpty()) {
      return dogList.dequeue();
    } else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "catList=" + catList +
      ", dogList=" + dogList +
      '}';
  }
}
