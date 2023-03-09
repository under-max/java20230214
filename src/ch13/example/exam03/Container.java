package ch13.example.exam03;

/**
 * @author Yun
 *
 * @param <T1>
 * @param <T2>
 */
public class Container<T1, T2> {
	private T1 key;
	private T2 value;
	
	public T1 getKey() {return key;}
	public void set(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
	public T2 getValue() {return value;}
	
	
	
}
