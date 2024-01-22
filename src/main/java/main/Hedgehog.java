package main;
class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String text) {
        if (text.trim().isEmpty()) {
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
            System.out.println(name + ": " + text);
        }
    }

    public void run(int times) {
        for (int j = 0; j < times; j++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }
}