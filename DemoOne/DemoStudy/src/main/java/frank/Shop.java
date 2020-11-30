package frank;

import java.util.List;

public class Shop {
    private List<Duck> list;

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }

    public List<Duck> getList() {
        return list;
    }

    public void setList(List<Duck> list) {
        this.list = list;
    }
}
