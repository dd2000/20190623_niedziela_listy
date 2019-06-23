package Zadanie_1;


public class ListElement {
    private String ListElementValue;
    private ListElement next;

    // konstruktor
    public ListElement(String elementValue) {
        this.ListElementValue = elementValue;
        this.next = null;
    } // konstruktor

    public String getListElementValue() {
        return ListElementValue;
    }

    public void setListElementValue(String listElementValue) {
        ListElementValue = listElementValue;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }


} // class ListElement
