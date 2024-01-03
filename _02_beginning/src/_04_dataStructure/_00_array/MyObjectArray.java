package _02_beginning._04_dataStructure._00_array;

public class MyObjectArray {

	private int count;
	private Object[] array;
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyObjectArray(){
		ARRAY_SIZE = 10;
		array = new Object[ARRAY_SIZE];
	}
	
	public MyObjectArray(int size){
		ARRAY_SIZE = size;
		array = new Object[ARRAY_SIZE];
	}
	public void addElement(int num){
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		array[count++] = num;

	}

	public void insertElement(int position, int num){
		int i;

		if(count >= ARRAY_SIZE){  //꽉 찬 경우
			System.out.println("not enough memory");
			return;
		}

		if(position < 0 || position > count ){  //index error
			System.out.println("insert Error");
			return;
		}

		for( i = count-1; i >= position ; i--){
			array[i+1]  = array[i];        // 하나씩 이동
		}

		array[position] = num;
		count++;
	}

	public Object removeElement(int position){
		Object ret = ERROR_NUM;

		if( isEmpty() ){
			System.out.println("There is no element");
			return ret;
		}

		if(position < 0 || position >= count ){  //index error
			System.out.println("remove Error");
			return ret;
		}

		ret = array[position];

		for(int i = position; i<count -1; i++ ){
			array[i] = array[i+1];
		}
		count--;
		return ret;
	}

	public int getSize(){
		return count;
	}

	public boolean isEmpty(){
		if(count == 0){
			return true;
		}
		else return false;
	}

	public Object getElement(int position){
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return array[position];
	}

	public void printAll(){
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for(int i=0; i<count; i++){
			System.out.println(array[i]);
		}

	}

	public void removeAll(){
		for(int i=0; i<count; i++){
			array[i] = 0;
		}
		count = 0;
	}
}

