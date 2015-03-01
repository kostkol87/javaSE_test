public class Main {
    public static void main(String[] args) {

        Father father = new Father();

        father.setName("Alex");
        father.setAge(22);
        father.setStatus("Student");
        father.setEmployment("janitor");


        Mother mother=new Mother();
        mother.setName("Larisa");
        mother.setAge(22);


        Kids masha = new Kids();
        masha.setName("Masha");
        masha.setAge(3);
        masha.setStatus("daughter");


        Kids oleg = new Kids();
        oleg.setName("Oleg");
        oleg.setAge(3);
        oleg.setStatus("son");


        Kids misha = new Kids();
        misha.setName("Misha");
        misha.setAge(3);
        misha.setStatement("son");

    }
}
