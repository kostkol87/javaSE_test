package ru.obj;

public class TransferQueue {

    private Transfer begining=null;
    private Transfer ending=null;
    private int count=0;


    void put(String name,int summ){
        Transfer trans = new Transfer();

        trans.setName(name);
        trans.setSumm(summ);

        System.out.println("создаем объект типа Трансфер от "+name+" сумма "+summ);
        System.out.println("теперь в очереди "+(count+1)+" трансферов");

        if (count==0){
            begining=trans;
        }
        if(ending!=null){
            ending.setNext(trans);
        }
        ending=trans;
        count++;

    }




    Transfer get(){
        if (count>0)
        System.out.println("Получаем объект типа Трансфер в порядке очереди, в очереди осталось: "+(count-1)+" трансферов");



        Transfer result=begining;
        if(count!=0) {
            begining = ending;
            ending = ending.getNext();
        }
        if(count==0){
            System.out.println("Больше нет Трансферов !!!!");
            result=null;
        }else {

            count--;

        }
        return result;

    }
}
