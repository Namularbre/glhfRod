public class Waifu {
    public String name;
    public int age;

    public Waifu(String name, int age) {
        this.name = name;
        if (age >= 18) {
            throw new WaifException();
        }

        this.age = age;
    }
}
