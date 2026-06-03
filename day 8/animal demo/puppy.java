class puppy extends dog
{
void weep()
{
System.out.println("Weeping");
}
public static void main(String[] args)
{
puppy p=new puppy();
p.name="Tom";
p.eat();
p.bark();
p.weep();
}
}