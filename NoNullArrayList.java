import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  public T set(int index, T element) {
    if(element == null) {
      throw new IllegalArgumentException();
    } else {
      return super.set(index, element);
    }
  }

  public boolean add(T t) {
    if(t == null) {
      throw new IllegalArgumentException();
    } else {
      return super.add(t);
    }
  }

  public void add(int index, T t) {
    if (t == null) {
      throw new IllegalArgumentException();
    } else {
      super.add(index, t);
    }
  }
}