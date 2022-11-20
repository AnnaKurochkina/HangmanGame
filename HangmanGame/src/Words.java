
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    Random rand = new Random();
    List<String> words = new ArrayList<>();
    public Words() {
        words.add("panda");
        words.add("robin");
        words.add("wombat");
        words.add("dragon");
        words.add("hippopotamus");
        words.add("beaver");
        words.add("hedgehog");
        words.add("seahorse");
        words.add("lobster");
        words.add("chimpanzee");
        words.add("walrus");
        words.add("tortoise");
        words.add("catfish");
        words.add("leopard");
        words.add("crocodile");
        words.add("llama");
        words.add("penguin");
    }
    public String getRandomWord () {
        return words.get(rand.nextInt(words.size())+1);
    }
}
