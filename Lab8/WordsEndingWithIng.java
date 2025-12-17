public class WordsEndingWithIng{
    public static void main(String[] args){
        String s="The old man is singing and dancing happily";
        String[] words=s.split(" ");
        for(String w:words){
            if(w.endsWith("ing")){
                System.out.println(w);
            }
        }
    }
}
