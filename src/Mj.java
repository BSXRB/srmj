import java.util.Comparator;

public class Mj {
     public MjType type;
     public int flag;
     public int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public boolean onDesk;

    public boolean isOnDesk() {
        return onDesk;
    }

    public void setOnDesk(boolean onDesk) {
        this.onDesk = onDesk;
    }

    public MjType getType() {
        return type;
    }

    public void setType(MjType type) {
        this.type = type;
    }
}
