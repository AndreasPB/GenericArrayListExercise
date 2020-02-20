public class Main {
    public static void main(String[] args) {
        System.out.println("Davs");

        MyGenericArrayList<Integer> intArray = new MyGenericArrayList();

        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        intArray.printAll();

        intArray.add(0, 40);
        intArray.add(2, 50);
        intArray.add(4, 60);
        intArray.printAll();

        MyGenericArrayList<String> stringArray = new MyGenericArrayList();
        stringArray.add("Hej");
        stringArray.add("med");
        stringArray.add("dig");
        stringArray.printAll();

        stringArray.add(0, "Flemming");
        stringArray.add(2, "Else");
        stringArray.add(4, "Lotte");
        stringArray.printAll();

        MyGenericArrayList<Hanne> hanneList = new MyGenericArrayList<>();
        Hanne hanne = new Hanne("Andreas", "Mikael");
        hanneList.add(2, hanne);
        hanneList.printAll();
    }
}
