public class CheckPoint11_27 {
    public static void main(String[] args) {
        Object fruit = new Fruit();
        Object apple = (Apple)fruit;
    }
}

class Apple extends Fruit {
}

class Fruit {
}
