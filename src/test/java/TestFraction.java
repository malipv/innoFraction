import ru.inno.task.Cache;
import ru.inno.task.Fractionable;
import ru.inno.task.Mutator;

public class TestFraction implements Fractionable {
    int num, denum;
    int count;

    public TestFraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    @Cache
    public double doubleValue() {
        count++;
        return num / denum;
    }

    @Override
    @Mutator
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void setDenum(int denum) {
        this.denum = denum;
    }

    @Override
    public String toString() {
        count++;
        return "TestFraction{" +
                "num=" + num +
                ", denum=" + denum +
                ", count=" + count +
                '}';
    }
}