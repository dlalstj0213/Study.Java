package _08_generic3;

public class Point<T extends Number, V extends Number> {
	
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {
			return x;
	}

	public V getY() {
		return y;
    }
}
