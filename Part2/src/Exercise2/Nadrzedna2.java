package Exercise2;

abstract class Nadrzedna2 { //klasa, którego typu nie da utworzyć się obiektu
    abstract void print(); //metody abstrakcyjne zawierają wyłącznie sygnaturę

    Nadrzedna2(){
        print();
    }
}
