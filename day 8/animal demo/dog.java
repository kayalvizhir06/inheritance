public class dog extends animal {
void bark() {
System.out.println(name + " is barking");
}

public static void main(String[] args) {
dog d = new dog();
d.name = "Tommy";
d.eat();
d.bark();
}
}
