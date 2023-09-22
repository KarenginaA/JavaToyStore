import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "chicken", 10, 20);
        store.addToy(2, "fish", 5, 10);
        store.addToy(3, "cat", 20, 70);
        store.addToy(4, "dog", 10, 15);
        store.addToy(5, "bird", 4, 10);

        // set the weight of a toy
        store.setToyWeight(2, 30);

        // play the game
        store.play();


        // get the prize toy
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            System.out.println("ошибка программы");;
        }

    }
}