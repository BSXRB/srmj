import com.sun.deploy.security.MozillaJSSDSASignature;

import java.util.ArrayList;
import java.util.Random;

public class Table {
    public ArrayList<Player>players=new ArrayList<Player>();

    public ArrayList<Mj> getMjonTable() {
        return mjonTable;
    }
    public Table(){
        initMj();
    }

    private ArrayList<Mj> mjonTable=new ArrayList<Mj>();
    public void initMj(){
        for (int j=0;j<4;j++) {
            for (int i = 1; i < 10; i++) {
                mjonTable.add(new Nmj(MjType.TIAO, i));
                mjonTable.add(new Nmj(MjType.TONG, i));
                mjonTable.add(new Nmj(MjType.WAM, i));
            }
            mjonTable.add(new Zmj(MjType.ZI,ZType.DONG));
            mjonTable.add(new Zmj(MjType.ZI,ZType.NAN));
            mjonTable.add(new Zmj(MjType.ZI,ZType.XI));
            mjonTable.add(new Zmj(MjType.ZI,ZType.BEI));
            mjonTable.add(new Zmj(MjType.ZI,ZType.ZHONG));
            mjonTable.add(new Zmj(MjType.ZI,ZType.FA));
            mjonTable.add(new Zmj(MjType.ZI,ZType.BAI));
        }
        int size=mjonTable.size();
        Random random=new Random();
        for (int i=0;i<size;i++){
            int randomPos=random.nextInt(size);
            Mj tMj=mjonTable.get(i);
            mjonTable.set(i,mjonTable.get(randomPos));
            mjonTable.set(randomPos,tMj);
        }
        Player player1=new Player(disMj());
        Player player2=new Player(disMj());
        Player player3= new Player(disMj());
        Player player4= new Player(disMj());
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
    }
    public ArrayList<Mj> disMj(){
        ArrayList<Mj>pmj=new ArrayList<>();
        for (int i=0;i<13;i++){
            pmj.add(mjonTable.get(1));
            mjonTable.remove(1);
        }
        return pmj;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
