package 迭代器模式;

public class MyArrayList implements Collection{
	Object[] objects=new Object[10];
	int index=0;
	public void add(Object o) {
	     if(index==objects.length){
	    	 Object[] newobjects=new Object[objects.length*2];
	    	 System.arraycopy(objects, 0, newobjects, 0, objects.length);
	    	 objects=newobjects;
	    	 System.out.println("扩容");
	     }
	     objects[index]=o;
		 index++;
	}
	public int size() {
		return index;
	}
	
	//iterat接口
	public MyIterator iterator() {
		return new MyArrayListIterator();
	}
	
	private class MyArrayListIterator implements MyIterator{
      private int  current=0;
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			current++;
			return objects[current];
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(current>=index){return false;}
			else return true;
		}
		
	}
	
}
