public class Zmj extends Mj {
    public ZType zi;
    public Zmj(MjType type,ZType zi){
        this.type=type;
        this.zi=zi;
        switch (zi){
            case DONG: this.flag=40+1; break;
            case NAN: this.flag=40+2; break;
            case XI: this.flag=40+3; break;
            case BEI: this.flag=40+4;break;
            case ZHONG:this.flag=40+5;break;
            case FA:this.flag=40+6;break;
            case BAI:this.flag=40+7;break;
        }
    }

    public ZType getZi() {
        return zi;
    }

    public void setZi(ZType zi) {
        this.zi = zi;
    }

    @Override
    public String toString() {
        return type.toString()+"-"+zi.toString();
    }
}
