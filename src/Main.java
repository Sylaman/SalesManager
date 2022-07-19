public class Main {
    public static void main(String[] args) {
        SalesManager salesManager1 = new SalesManager(new int[]{100, 500, 1000, 20000});
        SalesManager salesManager2 = new SalesManager(new int[]{900, 100000, 9999});

        System.out.println("Максимальная сумма продажи первого менеджера: " + salesManager1.max());
        System.out.println("Максимальная сумма продажи второго менеджера: " + salesManager2.max());
    }
}