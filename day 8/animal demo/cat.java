public class cat extends animal {
void meow() {
System.out.println(name + " says meow meow");
}
public static void main(String[] args) {
cat c = new cat();
c.name = "Kitty";
c.eat();
c.meow();
}
}
