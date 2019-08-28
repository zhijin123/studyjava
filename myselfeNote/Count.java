/*数组：存储相同数据类型的有序集合;
   特点：
   1.数组中存放的数据必须是同种类型，可以是基本类型也可以是引用数据类型；
   2.数组在定义的时候必须给定大小（储存空间），且大小不可改变；
   3.可以通过下标获取数据，下标从零开始
   4.插入的数组是有序集合，此时有序并不代表大小，而是插入顺序；   
  
 使用：
    1、声明数组 
	2、分配空间 
	3、赋值 
	4、数组操作
*/
public class Count{
	public static void main(String[] ages){
	/*	//声明数组
		int[] array;
		//创建储存空间
		array = new int[5];
		//数组赋值
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		//数组操作
		System.out.println(array[0]);
		//数组的几种创建方式
		//1.声明并且申请空间
		int[] arr1 = new int[5];
		int [] arr2 = new int[5];
		int arr3[] = new int[5];
		//2.声明数组并赋值
		int []arr4 = new int[]{0，1，2，3，4};
		//3.直接初始化操作（系统帮助补全）
		int[] arr5 = {1,2,3};
		
		//获取数组长度
		System.out.println(arr5.length);
		//输入五个值求平均值
		*/
		/*int[] arr6 = new int[]{98,65,35,98,96};
		int sum = 0;
		for(int i = 0;i<5;i++){
			sum+=arr6[i];	
		}
	   System.out.println("平均值："+sum/arr6.length);
	   */
	  /* //数组是引用类型，当创建完成数组之后相当于在方法外定义了一个变量，此时数组的值是有默认值的；
	   默认值取决于你定义的数组的类型： 
	   int :0   
	   String:null
	   booiean:false
	数组可以根据下标获取值，但是获取下标的范围是(0,length-1]
	 */  
	   
	/* //数组的排序：考排序算法
	 数据结构：
	   线性表
	   非线性表
	   树
	   图
	   队列
	   栈
	 面试需求
	 1.排序算法
	  冒泡排序
	  选择排序
	  插入排序
	  快速排序
	 2.排序算法的时间复杂度（空间复杂度）
	 衡量一个数据是否合适的标准
	 3.排序算法的稳定性
	 排序之后的值跟排序之后的值位置是否发生变化
	 
	 */
	 //冒泡排序
	 /*int[] array = new int[]{4,1,7,2,9,3,5,8};
	 for(int i =0;i<array.length;i++){
		 for(int j=0;j<array.length-1-i;j++){
			 if(array[j]>array[j+1]){
			 int tmp = array[j];
             array [j] = array [j+1];
              array [j+1]	= tmp;		 
			 }
		 }
	 }
	   for(int i=0;i<array.length;i++){
		   System.out.print(array [i]+"\t");
	   }
	   
	  */
	 //选择排序  
	/*   int[] array = new int[]{4,1,7,2,9,3,5,8};
	 for(int i =0;i<array.length;i++){
		 for(int j=i+1;j<array.length;j++){
		  if(array[i]>array[j]){
			 int tmp = array[i];
             array [i] = array [j];
              array [j]	= tmp;	
	 }
		 }
	 }		 
	  for(int i=0;i<array.length;i++){
		   System.out.print(array [i]+"\t");
	   } 
	*/
	
	/*
	//二维数组：数组的数组(矩阵运算)
	    必须给定数组的长度
	
	*/
	
	   int[] arr = new int[6];
	   int[][] arr2 = new int[3][];
	   //创建二维数组的对象
	    arr2[0] = new int[5];
	    arr2[1] = new int[3];
	    arr2[2] = new int[4];
	   //赋值
	   arr2[0][0] = 1;
	   arr2[0][1] = 2;
	   arr2[0][2] = 3;
	   arr2[0][3] = 4;
	   arr2[0][4] = 5;
	   
	    arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		
		arr2[2][0] = 9;
		arr2[2][1] = 10;
		arr2[2][2] = 11;
		arr2[2][3] = 12;
		
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}