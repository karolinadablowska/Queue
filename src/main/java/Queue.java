import java.util.LinkedList;


public class Queue {

    private LinkedList<Person> firstqueue;
    private LinkedList<Person> secondqueue;

    public Queue () {
        this.firstqueue = new LinkedList<>();
        this.secondqueue = new LinkedList<>();
    }

    public void addToQueue(Person... person ) {
        for (int i = 0; i < person.length; i++) {
            if (firstqueue.size() <= secondqueue.size()) {
                firstqueue.addLast(person[i]);
            } else {
                secondqueue.addLast(person[i]);
            }
        }
    }

    public void removeFromQueue(int numberOfqueue) {
        if (numberOfqueue == 1) {
            System.out.println("Person off:" + firstqueue.pop());
        } else {
         System.out.println("Person off::" + secondqueue.pop());

        }
    }

    public Person evokeFromOne(int sc, String name, String surname ) {
        if (sc == 1) {
            for (Person p : firstqueue) {
                if (p.equals(new Person(name, surname))) {
                    System.out.println(p);
                    return p;
                }
            }
        } else {
             for (Person p : secondqueue) {
                    if (p.equals(new Person(name, surname))) {
                        System.out.println(p);
                        return p;
                    }
                }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "firstqueue=" + firstqueue +
                ", secondqueue=" + secondqueue +
                '}';
    }
}




