package Laba_2.task_1;

public class Main {
    public static void main(final String[] args) {
        final Quene quene = new Quene();
        quene.setFirst(2);
       quene.setFirst(1);
       quene.add(3);
        quene.setLast(4);
        quene.setLast(5);
        for(final int asd : quene) {
            System.out.println(asd);
        }
    }
}
