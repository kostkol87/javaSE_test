
public class TransferQueue {
    Transfer begin=null;
    Transfer end=null;
    int count;


    public void put(String name){
        Transfer trans = new Transfer();
        trans.setName(name);

        if (count==0){
            begin=trans;
        }
        if (end!=null){
            end.setTmp(trans);
        }
        end=trans;

        count++;
    }

    public Transfer get(){
        Transfer result=null;
        if (count==0){
            System.out.println("Нет трансферов в очереди");
            result=null;
        }
        if (count==1){
            result=begin;
            begin=null;
            end=null;
            count--;
        }
        if (count>1){

        result=begin;
        begin=end;
        end=end.getTmp();}
        System.out.println("Трансфер от "+result.getName()+" В очереди осталось "+count);
        count--;
        return result;
    }

}
