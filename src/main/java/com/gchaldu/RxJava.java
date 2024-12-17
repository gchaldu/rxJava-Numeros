package com.gchaldu;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

import java.util.ArrayList;
import java.util.List;

public class RxJava {
    private List<Integer> list1;
    private PublishSubject<List<Integer>> listSubject;

    public RxJava(){
        list1 = new ArrayList<>();
        listSubject = PublishSubject.create();
        llenarLista();
    }

    public void llenarLista(){
        for (int i = 0; i<10; i++){
            list1.add(i);
        }
        listSubject.onNext(list1);
    }

    public void addInteger(Integer i){
        list1.add(i);
        listSubject.onNext(list1);
    }

    public void viewListNumeros() {
        listSubject.subscribe(
                updatedList -> {
                    System.out.println("Lista actualizada:");
                    updatedList.forEach(numero -> System.out.println("Número = " + numero));
                },
                throwable -> System.err.println("Error: " + throwable)
        );
    }
}
