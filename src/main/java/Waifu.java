public class Waifu {
    public String name;
    public int age;

    public Waifu(String name, int age) throws WaifuException {
        this.name = name;
        if (age >= 18) {
            throw new WaifuException();
        }

        this.age = age;
    }
}
