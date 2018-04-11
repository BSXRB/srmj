import java.util.*;

public class Player {
    public Player(ArrayList<Mj> mjs){
        this.mjs=mjs;
    }
    public void sort(){
        Collections.sort(mjs, new Comparator<Mj>() {
            @Override
            public int compare(Mj o1, Mj o2) {
                if (o1.flag>o2.flag) return 1;
                else if (o1.flag<o2.flag) return -1;
                else return 0;
            }
        });
    }
    private ArrayList<Mj> mjs;
    public ArrayList<Mj> getMjs() {
        return mjs;
    }

    public void setMjs(ArrayList<Mj> mjs) {
        this.mjs = mjs;
    }

    private boolean isHu(){

     return false;
    }
    public boolean isEat(Nmj mj){//能否吃
        if (mj.getType().equals(MjType.TIAO)||mj.getType().equals(MjType.TONG)||mj.getType().equals(MjType.WAM)){
            if (mjs.contains(new Nmj(mj.getType(),mj.getNum()+1))&&mjs.contains(new Nmj(mj.getType(),mj.getNum()+2))) return true;
            else if (mjs.contains(new Nmj(mj.getType(),mj.getNum()+1))&&mjs.contains(new Nmj(mj.getType(),mj.getNum()-1))) return true;
            else if (mjs.contains(new Nmj(mj.getType(),mj.getNum()-1))&&mjs.contains(new Nmj(mj.getType(),mj.getNum()-2))) return true;
            else return false;
        }
        return false;
    }
    public boolean isPeng(Mj mj){//能否碰
         Iterator<Mj> it=mjs.iterator();
         int i=0;
         while (it.hasNext()){
             if (mj.flag==it.next().flag) i++;
         }
         if (i>=2) return true;
         else return false;
    }
    public boolean isGang(Mj mj){//能否杠
        Iterator<Mj> it=mjs.iterator();
        int i=0;
        while (it.hasNext()){
            if (mj.flag==it.next().flag) i++;
        }
        if (i>=3) return true;
        else return false;

    }
    private boolean isNo(){//是否胡91
        boolean NOflag=false;//91子标识
        for (int i=0;i<14;i++){
            if (mjs.get(i).getType().equals(MjType.ZI)||mjs.get(i).toString().contains("1")||mjs.get(i).toString().contains("9")) NOflag=true;
            else{
                NOflag=false;
                break;
            }
        }
        return NOflag;
    }
    public void takeMj(Table table){
        mjs.add(table.getMjonTable().get(1));
        table.getMjonTable().remove(1);
    }
    public Mj putMj(int i){
        Mj tmj=mjs.get(i);
        mjs.remove(i);
        return tmj;
    }

}
