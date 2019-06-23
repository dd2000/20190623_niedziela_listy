package Zadanie_1;

public class Zadanie_1_main {
    public static void main(String[] args) {
        MyList lista = new MyList();

        ListElement firstListElement = new ListElement("\nPierwszy element listy");
        lista.addElementToEnd(firstListElement);
        System.out.println(lista.toString());

        ListElement secondListElement = new ListElement("Drugi element listy");
        lista.addElementToEnd(secondListElement);
        System.out.println(lista.toString());


        ListElement thirdListElement = new ListElement("Trzeci element listy");
        lista.addElementToEnd(thirdListElement);
        System.out.println(lista.toString());


        ListElement Element4 = new ListElement("4-ty element listy");
        lista.addElementToEnd(Element4);
        System.out.println(lista);


        ListElement Element5 = new ListElement("Element 5 listy");
        lista.addElementToEnd(Element5);
        System.out.println(lista);


        ListElement Element6 = new ListElement("Element 6 listy");
        lista.addElementToEnd(Element6);
        System.out.println(lista);


        ListElement Element7 = new ListElement("Element 7 listy");
        lista.addElementToEnd(Element7);
        System.out.println(lista);


    } // main
} // class Zadanie_1_main
