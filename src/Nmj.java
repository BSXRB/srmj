public class Nmj extends Mj {
    private int num;
    public Nmj(MjType type,int num){
        this.num=num;
        this.type=type;
        if (type.equals(MjType.WAM)) this.flag=10+num;
        else if (type.equals(MjType.TIAO)) this.flag=20+num;
        else if (type.equals(MjType.TONG)) this.flag=30+num;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return type + "-"+Integer.toString(num);
    }
}
