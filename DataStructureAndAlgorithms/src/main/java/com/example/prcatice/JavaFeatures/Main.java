package com.example.prcatice.JavaFeatures;

import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

interface BiConsumer<T,U>{
    boolean check(T t,U u);
}
//interface Cons<T t>{
//    void accept(T t);
//}
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> questionOne =transactions.stream().filter(n->n.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        List<String> quesntionTwo = transactions.stream().map(n->n.getTrader().getCity()).distinct().collect(Collectors.toList());
        List<Trader> questionThree = transactions.stream()
                .filter(n->n.getTrader().getName().equalsIgnoreCase("Cambridge"))
                .map(n->n.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        String questionFour = transactions.stream()
                .map(n->n.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        boolean questionfive = transactions.stream()
                .anyMatch(n->n.getTrader().getCity().equalsIgnoreCase("Milan"));
    }
}
