package intro;

//public class Box {
//    private Object object;
//
//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//}
public class Box<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}