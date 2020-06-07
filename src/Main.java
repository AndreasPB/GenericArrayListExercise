public class Main {
    public static void main(String[] args) {


        System.out.println("Generic to type Integer");
        MyGenericArrayList<Integer> intArray = new MyGenericArrayList();
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        intArray.printAll();

        intArray.add(1, 40);
        intArray.add(2, 50);
        intArray.add(3, 60);
        intArray.printAll();
        System.out.println();


        System.out.println("Generic to type String");
        MyGenericArrayList<String> stringArray = new MyGenericArrayList();
        stringArray.add("Hej");
        stringArray.add("med");
        stringArray.add("dig");
        stringArray.printAll();

        stringArray.add(1, "Flemming");
        stringArray.add(2, "Else");
        stringArray.add(3, "Lotte");
        stringArray.printAll();
        System.out.println();

        System.out.println("Generic to type Object");
        MyGenericArrayList<Object> genericList = new MyGenericArrayList<>();
        Mom hanne = new Mom("Andreas", "Mikael");

        genericList.add(1, "en string");
        genericList.add(2, 1337);
        genericList.add(3, hanne);
        genericList.printAll();
    }
}
