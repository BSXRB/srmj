import javax.sound.midi.Soundbank;

public class Test {
   static Mj tmj=new Mj();
    static Table table=new Table();
    static Player player=table.getPlayers().get(0);
    static Player player2=table.getPlayers().get(1);
    static Player player3=table.getPlayers().get(2);
    static Player player4=table.getPlayers().get(3);
    public static void main(String[] args) {
        player.sort();
        player2.sort();
        player3.sort();
        player4.sort();
/*        for (int i=0;i<player.getMjs().size();i++)
        System.out.println(player.getMjs().get(i).toString()+"###"+player2.getMjs().get(i)+"###"+player3.getMjs().get(i)+"###"+player4.getMjs().get(i));*/
    }
    private int isP(){
        if (player.isPeng(tmj)) return 1;
        if (player2.isPeng(tmj)) return 2;
        if (player3.isPeng(tmj)) return 3;
        if (player4.isPeng(tmj)) return 4;
        else return 0;
    }
    private int isG(){
        if (player.isGang(tmj)) return 1;
        if (player2.isGang(tmj)) return 2;
        if (player3.isGang(tmj)) return 3;
        if (player4.isGang(tmj)) return 4;
        else  return 0;
    }
    private void play(){
        Thread thread1=new Thread("1"){
            @Override
            public void run() {
                player.takeMj(table);
//            player.isGang(tmj);
//            player.isPeng(tmj);
//            player.isEat((Nmj) tmj);
                player.sort();
                player.putMj(new Scanners().takeFromConsolo());
            }
        };
        Thread thread2=new Thread("2"){
            @Override
            public void run() {
                player2.takeMj(table);
//            player.isGang(tmj);
//            player.isPeng(tmj);
//            player.isEat((Nmj) tmj);
                player2.sort();
                player2.putMj(new Scanners().takeFromConsolo());
            }
        };
        Thread thread3=new Thread("3"){
            @Override
            public void run() {
                player3.takeMj(table);
//            player.isGang(tmj);
//            player.isPeng(tmj);
//            player.isEat((Nmj) tmj);
                player3.sort();
                player3.putMj(new Scanners().takeFromConsolo());
            }
        };
        Thread thread4=new Thread("4"){
            @Override
            public void run() {
                player.takeMj(table);
//            player.isGang(tmj);
//            player.isPeng(tmj);
//            player.isEat((Nmj) tmj);
                player4.sort();
                player4.putMj(new Scanners().takeFromConsolo());
            }
        };
        while (true){
            thread1.start();
            isP();
            isG();
        }

    }
}
