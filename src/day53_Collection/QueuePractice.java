package day53_Collection;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(1,3,12,7,9,4,8,5,6));
        System.out.println("arrayDeque = " + arrayDeque);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        //Obj yi ArrayDeque ile olustursak, (ArrayDeque) gerek kalmiyor
        System.out.println(((ArrayDeque)arrayDeque).getFirst());
        System.out.println(((ArrayDeque)arrayDeque).getLast());

        System.out.println("==========================");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(linkedList);
        linkedList.poll();// Referans Queue olmali .poll komutu icin

        System.out.println(((LinkedList<Integer>) linkedList).get(0));//Referans List olmali .get komutu icin
        System.out.println(((LinkedList<Integer>) linkedList).get(linkedList.size()-1));

        System.out.println(((LinkedList<Integer>) linkedList).getFirst());
        System.out.println(((LinkedList<Integer>) linkedList).getLast());

        linkedList.add(null);
        System.out.println("linkedList = " + linkedList);

        System.out.println("==============================");

        //Order is Random..
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,12,9,3,7,1,6));
        
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        //System.out.println(((PriorityQueue<Integer>)priorityQueue).getfirst());
        //priorityQueue.add(null);

    }
}

