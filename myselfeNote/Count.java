/*���飺�洢��ͬ�������͵����򼯺�;
   �ص㣺
   1.�����д�ŵ����ݱ�����ͬ�����ͣ������ǻ�������Ҳ�����������������ͣ�
   2.�����ڶ����ʱ����������С������ռ䣩���Ҵ�С���ɸı䣻
   3.����ͨ���±��ȡ���ݣ��±���㿪ʼ
   4.��������������򼯺ϣ���ʱ���򲢲������С�����ǲ���˳��   
  
 ʹ�ã�
    1���������� 
	2������ռ� 
	3����ֵ 
	4���������
*/
public class Count{
	public static void main(String[] ages){
	/*	//��������
		int[] array;
		//��������ռ�
		array = new int[5];
		//���鸳ֵ
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		//�������
		System.out.println(array[0]);
		//����ļ��ִ�����ʽ
		//1.������������ռ�
		int[] arr1 = new int[5];
		int [] arr2 = new int[5];
		int arr3[] = new int[5];
		//2.�������鲢��ֵ
		int []arr4 = new int[]{0��1��2��3��4};
		//3.ֱ�ӳ�ʼ��������ϵͳ������ȫ��
		int[] arr5 = {1,2,3};
		
		//��ȡ���鳤��
		System.out.println(arr5.length);
		//�������ֵ��ƽ��ֵ
		*/
		/*int[] arr6 = new int[]{98,65,35,98,96};
		int sum = 0;
		for(int i = 0;i<5;i++){
			sum+=arr6[i];	
		}
	   System.out.println("ƽ��ֵ��"+sum/arr6.length);
	   */
	  /* //�������������ͣ��������������֮���൱���ڷ����ⶨ����һ����������ʱ�����ֵ����Ĭ��ֵ�ģ�
	   Ĭ��ֵȡ�����㶨�����������ͣ� 
	   int :0   
	   String:null
	   booiean:false
	������Ը����±��ȡֵ�����ǻ�ȡ�±�ķ�Χ��(0,length-1]
	 */  
	   
	/* //��������򣺿������㷨
	 ���ݽṹ��
	   ���Ա�
	   �����Ա�
	   ��
	   ͼ
	   ����
	   ջ
	 ��������
	 1.�����㷨
	  ð������
	  ѡ������
	  ��������
	  ��������
	 2.�����㷨��ʱ�临�Ӷȣ��ռ临�Ӷȣ�
	 ����һ�������Ƿ���ʵı�׼
	 3.�����㷨���ȶ���
	 ����֮���ֵ������֮���ֵλ���Ƿ����仯
	 
	 */
	 //ð������
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
	 //ѡ������  
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
	//��ά���飺���������(��������)
	    �����������ĳ���
	
	*/
	
	   int[] arr = new int[6];
	   int[][] arr2 = new int[3][];
	   //������ά����Ķ���
	    arr2[0] = new int[5];
	    arr2[1] = new int[3];
	    arr2[2] = new int[4];
	   //��ֵ
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