import java.util.Scanner;
/*
��������䣺˳�򣬷�֧��ѭ��
          1.˳��
		  2.��֧
		     if else switch
			 ����֧�ṹ��ֻ����һ�������ж�
			 ˫��֧�ṹ��ֻ������ѡ��
			 ���֧�ṹ�����Խ��ж���������ж�
			 Ƕ��if��֧�ṹ
			 switch���֧�ṹ:һ��������ֵ�ж�
			 
		  3.ѭ��
		     while   do while    for
		  4.��ת
		    break continue return
		  5.����ѭ��
		  6.����
		    ���塢���á�����
		  �ݹ��㷨
*/
public class By{
	
	public static void main(String[] ages){
		
		//����֧�жϣ�Math.random()�������ݷ�Χ��[0,1)
		//�õ�0-5֮��������
		/*
		int a = (int)(Math.random()*6);
		if(a>3){
			System.out.println("ֵ����3");
		}
		System.out.println("number:"+a);
	
		double i = 6 * Math.random();
		double j = 6 * Math.random();
		double k = 6 * Math.random();
		int count = (int) (i + j + k);
		if(count > 15) {
			System.out.println("������������");
		}
		if(count >= 10 && count <= 15) {   //����д����10<count<15
			System.out.println("����������һ��");
		}
		if(count < 10) {
			System.out.println("������������ô��");
		}
		System.out.println("����" + count + "��");
		˫��֧�ṹ
	   int r = 3;
	   double PI = 3.14;
	   double area = PI*r*r;
	   double length = 2*PI*r;
	    if(area >= length){
		   System.out.println("��������ܳ�");
	   } else{
		   System.out.println("�ܳ��������");
	   }*/
	   
	   //scanner
	   //����ɨ�����System.in��ʾ���Ǳ�׼���룬���Դӿ���̨��ȡ���ݣ�װ����ģʽ��
	   //Scanner sc = new Scanner(System.in);
	  // System.out.println("����������");
	   //String str = sc.nextLine();
	   //System.out.println(str);
	   /*
	        System.out.println("��ӭ������ʿ������");
			System.out.println("����û���Ϣ");
			Scanner sc = new Scanner(System.in);
			System.out.println("�������Ա����<��λ����>");
			String number = sc.nextLine();
			System.out.println("�������Ա����<��/��>");
			String birthday = sc.nextLine();
	        System.out.println("�������Ա����");
			String score = sc.nextLine();
	   
	        if(number.length()==4){
				System.out.println("��Ա��Ϣ����");
				System.out.println(number+"\t"+birthday+"\t"+score);
				
			}else{
				System.out.println("��Ա�����������������4λ����");
			}
	   */
	   
	   //���֧�ṹ 
	   /*
	   int age = (int)(Math.random()*100);
	   if(age<10){
		   System.out.println("��ͯ");
	   }else if(age<20){
		   System.out.println("����");
		   
	   }else if(age<30){
		   System.out.println("����");
	   }else if(age<40){
		   System.out.println("����");
	   }else if(age<70){
		   System.out.println("����");
	   }
	   else{
		   System.out.println("�ϲ�����");
	   }
	   */
	   //Ƕ��if�ķ�֧�ṹ
	   /*int time =(int)(Math.random()*40);
	   if(time<20){
		   System.out.println("��ӭ�������");
		   String sex = ((int)(Math.random()*2))==0?"girl":"boy";
		   if(sex == "girl"){
			   System.out.println("��ӭ����Ů����");
		   }else{
			   System.out.println("��ӭ����������");
		   }
	   }else{
		   System.out.println("�ɼ�̫�����̭");
	   }*/
	   //switch���֧�ṹ
	  /* int random = (int)(Math.random()*26);
	   char ch = (char)('a'+random);
	   switch(ch){
		   case'a':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'e':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'i':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'o':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'u':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'y':
		   System.out.println("��Ԫ����"+ch);
		   break;
		   case'w':
		   System.out.println("��Ԫ����"+ch);
		   break;
		   default:
		   System.out.println("������"+ch);;
		   
	   }*/
	  /* int random = (int)(Math.random()*26);
	   char ch = (char)('a'+random);
	   switch(ch){
		   case'a':
		   case'e':
		   case'i':
		   System.out.println("Ԫ����"+ch);
		   break;
		   case'o':
		   case'u':
		   case'y':
		   case'w':
		   System.out.println("��Ԫ����"+ch);
		   break;
		   default:
		   System.out.println("������"+ch);
	   }*/
	  /* ѭ�����
	  1.while  ���ж� ��ִ��
	     ��Ҫ�Ĳ������
		   ��ʼ���������ĳ�ʼ��
		   �����жϣ����뷵��true��false��ֵ
		   ѭ���壺�����Ҫִ�е��߼�����
		   ����������ʹ��ѭ������
	  2.do while ��ִ�� ���ж�
	   
	  */
	  //while
	  
	 /* int i = 1;
	  while(i<=100){
		  System.out.println("��"+i+"�����");
		  i++;
	  }*/
	  /* int i = 1;
	  int sum = 0;
	   while(i<=100){
		   if(i % 2 == 0){
			  sum+=i;  
		   }			  
		   i++; 
	   }
	   System.out.println(sum);
	   */
	   
	   //do while  ���ٱ�ѭ��һ��
	   
	   /*int i = 1;
	   do{
		   System.out.println("��"+i+"�����");
		  i++;
	   }while(i<=100);*/
	   
	   //for ѭ����ʹ����ࣩ
	    /*  �﷨����
		      for(��ʼ��1;�������ʽ2;������4){
				  �����߼�3
			  }
			ʹ���ŵ㣺
               1.������;
               2.������ʼ����ʱ��forѭ��������������ǵ�ǰforѭ���ṹ��
                 whileѭ�����������Ǵӱ����Ķ��忪ʼ��������������
				 
	   */
	     /* for(int i = 1;i<=100;i++){
			  
			  System.out.println("��"+i+"�����");
		  }
	   */
	      /* int sum = 0;
		   for(int i = 1; i<=100;i++){
			   if(i % 2==0){
				   sum+=i;
			   }
				  
		   }
	   System.out.println("100�ڵ�ż������"+sum);
	   */
	 //�������
	 //����Scanner
	 //Scanner sc = new Scanner(System.in);
	 //�洢����
	/* int threetyUp = 0;
	 int threetyDown = 0;
	 for(int i = 0;i<10;i++){
		 System.out.println("�������"+(i+1)+"λ�˿͵�����:");
		 int age = sc.nextInt();
		 if(age>30){
			 threetyUp++;
		 }else{
			 threetyDown++;
		 }
		 
	 }
	   
	  System.out.println("����30��ı���Ϊ��"+(threetyUp/10.0*100)+"%");
	  System.out.println("����30��ı���Ϊ��"+(threetyDown/10.0*100)+"%");
	   */
	  //��while��for�ֱ����100���ڵ�������ż���ĺͣ������
    /* int i = 1;
	 int sumj = 0;
	 int sumo = 0;
	 while(i<=100){
		 if(i % 2==0){
			 sumo+=i;	 
		 }else{
			 sumj+=i;		
	 }
	      i++;  
	 } 
	  System.out.println("100���ڵ�������Ϊ:"+sumj);
	 System.out.println("100���ڵ�ż����Ϊ:"+sumo); 
	 */  
	   
	   /*int sumj = 0;
	   int sumo = 0;
      for(int i = 1;i<=100;i++){
		  if(i % 2==0){
			  sumo+=i;
		  }else{
			 sumj+=i; 
		  }
	  }
     System.out.println("100���ڵ�������Ϊ:"+sumj);
	 System.out.println("100���ڵ�ż����Ϊ:"+sumo); 
*/
     //��while��forѭ�����1-1000֮���ܱ���������������ÿ�����3��
    
	  /* int count = 0;
	   int i = 1;
	   while(i<=1000){
		  if(i % 5==0){
			  System.out.print(i+"\t");
			  count++;
		  }
		  if(count>=3){
			  System.out.println();
			  count = 0;
		  }
          i++;
	   }
		  */
	
	/*	  
    int count = 0;
   for(int i = 1;i<=1000;i++){
	  if(i % 5==0){
		System.out.print(i+"\t");
		count++;
	}
	if(count>=3){
		System.out.println();
		count = 0;
	}
}
*/
    //ʹ��ѭ���ֱ�ʵ��10����ת��2����
  /* Scanner sc = new Scanner(System.in);
   System.out.println("������һ��10������");
   int number = sc.nextInt();
    String str = "";
	while(number!=0){
		int j = number % 2;
		str = j+str;
		number = number/2;
	}
	System.out.println(str);
	*/
	
	
	//1-10�Ľ׳˺�
    
	/*long  number = 1;
	 long sum = 0;
	for(long i = 1;i<=10;i++){	
		number *= i; 
	   }
		 sum += number;
		 
	System.out.println(sum);
	*/
	
	/*
	//bresk:����ѭ��
	  ���������ѭ��ʱ��breakֻ�������ڲ�ѭ��
	
	int count = 0;
	while(true){
		int i = (int)(Math.random()*101);
		if( i == 88){
			break;	
		}
		count++;
		System.out.println(count+"--"+i);
	}
	*/
	
	//���ӡ�����1��1����1��2����1��3��....֪�������6��6��
	/*for(int i = 1;i<10;i++){
		for(int j = 1;j<10;j++){
			System.out.println("("+i+","+j+")");
			if(i==6 && j==6){
				return;//break;
			}
		}
	}
	*/
	//continue:��������ѭ��
	//100-150֮�䲻�ܱ�������������
	/*for(int i = 100;i<=150;i++){
		if(i % 3==0){
			continue;
		}
		System.out.println(i);
	}
	*/
	/*return
	   1.���ط����ķ���ֵ
	   2.��ֹ��ǰ����
     */
	/* System.out.println(get());
       for(int i =0;i<10;i++){
		   System.out.println(i);
		   if(i == 5){
			 return; //System.exit(-1) ;
		   }
		   System.out.println("����ִ��");
	   }
	}

public static int get(){
	return 100;
}
*/

   //�žų˷���
   //������
   /*for(int i = 1;i < 10;i++){
	   for(int j = 1; j<=i;j++){
		   System.out.print(i+"*"+j+"="+i*j+"\t");
	   }
	   System.out.println();
   }*/
	/*for(int i = 9;i >0;i--){
	   for(int j = 1; j<=i;j++){
		   System.out.print(i+"*"+j+"="+i*j+"\t");
	   }
          System.out.println();

	}
	*/

    /* for(int i = 1;i <10;i++){
	      for(int j = 9; j>=i;j--){
		   System.out.print(i+"*"+j+"="+i*j+"\t");
	   }
          System.out.println();

	}*/

    /* for(int i = 9;i >0;i--){
	      for(int j = 9; j>=i;j--){
		   System.out.print(i+"*"+j+"="+i*j+"\t");
	   }
          System.out.println();

	}
*/
   /* int sum = 0;
    for(int i = 1;i <=10;i++){
	   sum += i;
	   if(sum>20){
		   
		   break;
	   } 
   }
   System.out.println(sum);
*/
  /* int sum = 0;
   double j = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("������ѧ������:");
  String name =sc.nextLine();
  for(int i =1;i<=5;i++){
	  System.out.println("�������"+i+"�ŵĳɼ�");
	  int number  =sc.nextInt();
	 	  sum += number;
          j = sum/5;		  
	  if(number<=0 || number>100){
        System.out.println("����ĳɼ������⣬����������");
	    return;
	   
	  } 
	 
  }
    System.out.println(name +"��ƽ����:"+j);
	 
  */  
 
    /*int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("������༶������:");
    int number =sc.nextInt();
    for(int i = 1;i<=number;i++){
	  System.out.println("�������"+i+"λͬѧ�ĳɼ�");
	   int score  = sc.nextInt();
	   if(score<80){
         continue;
	  }
	   count++; 
  }
     System.out.println("80�����ϵ�ͬѧ������"+count);
	 double j = (double)count / number*100;
     System.out.println("80�����ϵ�ͬѧ����ռȫ�����:"+j+"%");
   */
   
     /*
      for(int i = 1;i<=3;i++){
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ա"+i+"��Ϣ¼��"); 
		System.out.println("�������Ա����(<��λ����>):");
		String number = sc.nextLine();
		System.out.println("�������Ա����(��/��<��λ������ʾ>):");
		String birthday = sc.nextLine();
		System.out.println("�������Ա����");
		int vip = sc.nextInt();
		int length = number.length();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
        System.out.println(number+"\t"+birthday+"\t"+vip);
		if(length != 4){
		System.out.println("��¼��Ļ�Ա��Ϣ����...");
		System.out.println("\n");
			continue;
			
		}
		System.out.println("\n");	
		
		
	}
   */
   //��ӡ5*4��ƽ���ı���
  
  /* for(int i = 1;i<=4;i++){
	   for(int j = 1;j<=5-i;j++){
		 System.out.print(" ");  
	   }
	   for(int j = 1; j<6;j++){
		  System.out.print("*"); 
	   }
	   
			System.out.println();			
   }
   */
	   /*for(int i = 1;i<=4;i++){
	      for(int j = 1;j<i;j++){
		 System.out.print(" ");  
	    }
	     for(int j = 1; j<6;j++){
		  System.out.print("*"); 
	   }
	   
			System.out.println();			
   }
   */
  // ֱ��������
    /*for(int i = 1;i<=9;i++){
	      for(int j = i+1;j<=9;j++){
		 System.out.print(" ");  
	    }
	     for(int j = 1; j<=i;j++){
		  System.out.print("*"); 
	   }
	   
			System.out.println();			
   }
   */
   //3���༶��4��ѧԱ����������ÿ���༶����ѧԱƽ���֣�ͳ�Ƴɼ�����85��ѧԱ ��
       /* int count = 0;
        for(int i = 1;i<=3;i++){
		  System.out.println();
		  System.out.println("������"+i+"��ĳɼ�");
	      for(int j = 1;j<=4;j++){
	      Scanner sc = new Scanner(System.in);
		  System.out.println("��"+j+"λͬѧ�ĳɼ�"); 
		  int number = sc.nextInt();
		  if(number < 80){
			  continue;
		  }
		  if(number >= 80){
		   count++;
		  } 
	    }
		 System.out.println(i+"���ʮ�����ϵ�����Ϊ��"+count);
         count = 0;
		 System.out.println();
   }*/
   //��Ǯ��ټ�������5Ԫһ����ĸ����Ԫһ����С��һԪ������
   /*  for(int i=1;i<=20;i++){
		 for(int j=0;j<=33;j++){
			for(int k=0;k<=300;k++){
				if((i+j+k)==100 && ((5*i+3*j+k/3)==100) && (k % 3==0)){
				System.out.println("����:"+i+"\tĸ��:"+j+"\tС��:"+k);	
					
				}
			} 
		 }
	 }
	   
   */
   
   
   //�Შ��������1.1.2.3.5.8.13.21.34.55......
   /*  Scanner sc = new Scanner(System.in);
     System.out.println("������Ҫ��ӡ���Შ�������еĸ���");
      int number = sc.nextInt();
      int x = 1;
      int y = 1;
      int z = 0;
    for(int i=1;i<=number;i++){  
     if(i==1 || i==2){
	   System.out.print(1+"\t");
   }else{
	   z=x+y;
	   x=y;
	   y=z;
	   System.out.print(z+"\t"); 
   }
   
  } 
   */
   
  //�ݹ��㷨
      //�ڳ��������У���ʱ��Ҫ���˳�������ʱ�����õݹ飻
	  //�ڳ������ܲ��þͲ��ã�
	  //ʹ�õݹ��ʱ���Ӵ���Դ�����ģ�
	  //����ݹ���������ջ�����
	  //���������޷��������Ҫ�õݹ麯��ʱ����ʹ�ã�
	  //���磺���ĳ����Ŀ¼�µ������ļ�Ŀ¼
  /* for(int i=1;i<=10;i++){
	   System.out.print(getnumber(i)+"\t");
   }
}
   public static int getnumber(int number){
	  if(number==1 || number==2){
		  return 1;
	  }else{
		  return getnumber(number-1)+getnumber(number-2);
	  }
  }
   
   */
   



}
	
 
}