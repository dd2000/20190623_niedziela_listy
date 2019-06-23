package Zadanie_1;
/*
Dodaj klasę MojaLista (lub MyList), która będzie implementowała
listę i posiadała następujące funkcjonalności:
● dodawanie elementu na końcu listy
● dodawanie elementu na wybrany indeks w liście
● usuwanie elementu z listy
● usuwanie elementu z listy na podstawie indeksu
● pobieranie elementu na podstawie indeksu
● szukanie elementu na liście

Pamiętaj:    adres początku listy jest niezmienny !!! startListAdress

 */


public class MyList {
    private ListElement startListAdress; // adres początku (pierwszego elementu) listy; przy tworzeniu instancji = null

    // konstruktor domyślny - lista pusta

    public void addElementToEnd(ListElement nowyElement){
        ListElement last = new ListElement("temp");
        if (this.startListAdress == null) {
            this.startListAdress = nowyElement;
        } else {
            last = startListAdress;
            while (last.getNext()!= null){
                last.setNext(last.getNext());
            } // while
            last.setNext(nowyElement);
        } //else
    } // addElementToEnd

    private void insertElementToStart(ListElement nowyElement){
        ListElement start = startListAdress;

        nowyElement.setNext(start);

        startListAdress = nowyElement;

    } // insertElementToStart


    public void addElementByIndex(ListElement element, int index){
        int maxIndex = 0;
        ListElement temp;

        temp= startListAdress; // wyznaczenie liczby elementów w liście
        while (temp.getNext()!= null){
            maxIndex++;
            temp = temp.getNext();
        } // while

        if (index <= 0) {
            insertElementToStart(element);//wstaw element na początek listy
        } else {
            if (index < maxIndex) {
                //dodaj w miejscu wg indeksu
                temp = startListAdress;
                for (int i=2; i<index; i++){
                  temp.setNext(temp.getNext());
                }
                // "rozerwanie" listy i wstawienie elementu
                element.setNext(temp.getNext()); // wskazuje następny za elementem
                temp.setNext(element);
            } else {  // (index >= maxIndex)
                // dodaj na końcu listy
                addElementToEnd(element);
            } // else (index >= maxIndex)
        } // else

    } // addElementByIndex

//    public String showList() {
//        String txt="";
//        ListElement xtemp = startListAdress;
//
//        while (xtemp.getNext() != null) {
//            txt= txt+xtemp.getListElementValue()+"\n";
//            xtemp.setNext(xtemp.getNext());
//        } // while
//        txt = txt+" ==============="+"\n";
//        return txt;
//    } //showList()
} // class MyList
