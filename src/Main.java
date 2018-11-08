import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lijst van mijn favoriete gerechten!");
        ArrayList<String> list=new ArrayList<String>();
        list.add("Spaghetti");
        list.add("Lasagne");
        list.add("Carbonara");
        list.add("Paella");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
