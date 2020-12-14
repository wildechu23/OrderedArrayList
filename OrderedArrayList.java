import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  
  public OrderedArrayList(int initialCapacity) {
    super(initialCapacity);
  }
  
  public T set(int index, T element) {
    if(element == null) {
      throw new IllegalArgumentException("t can't be null");
    }
    T value = super.remove(index);
    this.add(findSortedIndex(element, this), element);
    return value;
  }

  public boolean add(T t) {
    super.add(findSortedIndex(t, this), t);
    return true;
  }

  public void add(int index, T t) { 
    super.add(findSortedIndex(t, this), t);
  }

  private int findSortedIndex(T t, ArrayList<T> list) {
    if(t == null) {
      throw new IllegalArgumentException("t can't be null");
    } else {
      for(T item : list) {
        if(t.compareTo(item) < 0) {
          return list.indexOf(item);
        }
      }
      return list.size();
    }
  }
}
