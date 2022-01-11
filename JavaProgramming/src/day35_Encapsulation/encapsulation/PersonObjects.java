package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Daniel");
        //as it is private then you have to use setName to set exact name for person
        p1.setAge(151);
        //as it is private then you have to use setAge to set exact age for person

        System.out.println(p1.getName()+ " : "+p1.getAge());
        //to print name we have to use getName

    }

}
