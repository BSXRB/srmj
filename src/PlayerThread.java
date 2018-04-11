public class PlayerThread extends Thread {
    private Object lock;
    private Player player;
    private Table table;
    private int num;
    volatile private static int addNummber=1;
public PlayerThread(Object lock,Player player,Table table,int pos){
    this.lock=lock;
    this.player=player;
    this.table=table;
    this.num=pos;
}
    @Override
    public void run() {
    try {
    synchronized (lock){
        while (true){
            if(addNummber%4==num){
                player.takeMj(table);
//            player.isGang(tmj);
//            player.isPeng(tmj);
//            player.isEat((Nmj) tmj);
                player.sort();
                player.putMj(new Scanners().takeFromConsolo());
                addNummber++;
                lock.notifyAll();
            }else {
                lock.wait();
            }
        }
    }
    }catch (InterruptedException e){
   e.printStackTrace();
    }
    }
}
