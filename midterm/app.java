package midterm;

class Animal
{
   protected String name;
   Animal(String name)
   {
      this.name = name;
   }

   public void eat()
   {
      System.out.println(name + " is eating...");
   }
}

class Mammal extends Animal
{
   protected String favorite_food;
   Mammal(String name,String favorite_food)
   {
      super(name);
      this.favorite_food = favorite_food;
   }

   public void favorite_Food()
   {
      System.out.println(favorite_food);
   }
}

class Dog
{
   
}