package ²ßÂÔÄ£Ê½;

public class DataSorter {

	public static void sort(Object[] a) {
		// TODO Auto-generated method stub
		int t;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				Object sw=null;
				Comparables s1=(Comparables)a[i];
				Comparables s2=(Comparables)a[j];
				if(s1.compareto(s2)==1){
					sw=a[i];
					a[i]=a[j];
					a[j]=sw;
				}
			}
		}
	}
	public static void print(Object[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i].toString());
		}
	}

}
