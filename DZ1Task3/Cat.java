package DZ1Task3;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }


    public void catComeIn(String name){
        System.out.println("кошка " + name + " подошла и сказала мяу");

    }

    public void catComeOut(String name){
        System.out.println("кошка " + name + " не отозвалась");

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}