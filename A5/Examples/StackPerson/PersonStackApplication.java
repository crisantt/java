package StackPerson;

public class PersonStackApplication {
    public static void main(String[] args) {
        // StackPerson persons = new StackPerson();
        // persons.push("Uno", "one", "uno@gmail.com");
        // persons.push("Dos", "two", "dos@gmail.com");
        // persons.push("Tres", "three", "tres@gmail.com");
        // persons.pop();
        // persons.peek();
        // System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        // persons.push("Quatro", "Four", "quatro@gmail.com");
        // persons.popAllItems();

        StackPerson persons = new StackPerson();
        Person person = new Person();
        person.setPersonDetails("Uno", "one", "uno@gmail.com");
        persons.push(person);
        person.setPersonDetails("Dos", "two", "dos@gmail.com");
        persons.push(person);
        System.out.println(persons.pop().toString());
        

    }
}
