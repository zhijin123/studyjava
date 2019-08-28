import java.util.Scanner;
/*
流控制语句：顺序，分支，循环
          1.顺序
		  2.分支
		     if else switch
			 单分支结构：只做单一条件的判断
			 双分支结构：只有俩种选择
			 多分支结构：可以进行多个条件的判断
			 嵌套if分支结构
			 switch多分支结构:一般用作等值判断
			 
		  3.循环
		     while   do while    for
		  4.跳转
		    break continue return
		  5.多重循环
		  6.方法
		    定义、调用、重载
		  递归算法
*/
public class By{
	
	public static void main(String[] ages){
		
		//单分支判断，Math.random()产生数据范围是[0,1)
		//得到0-5之间的随机数
		/*
		int a = (int)(Math.random()*6);
		if(a>3){
			System.out.println("值大于3");
		}
		System.out.println("number:"+a);
	
		double i = 6 * Math.random();
		double j = 6 * Math.random();
		double k = 6 * Math.random();
		int count = (int) (i + j + k);
		if(count > 15) {
			System.out.println("今天手气不错");
		}
		if(count >= 10 && count <= 15) {   //错误写法：10<count<15
			System.out.println("今天手气很一般");
		}
		if(count < 10) {
			System.out.println("今天手气不怎么样");
		}
		System.out.println("得了" + count + "分");
		双分支结构
	   int r = 3;
	   double PI = 3.14;
	   double area = PI*r*r;
	   double length = 2*PI*r;
	    if(area >= length){
		   System.out.println("面积大于周长");
	   } else{
		   System.out.println("周长大于面积");
	   }*/
	   
	   //scanner
	   //创建扫描对象，System.in表示的是标准输入，可以从控制台读取数据（装饰者模式）
	   //Scanner sc = new Scanner(System.in);
	  // System.out.println("请输入数据");
	   //String str = sc.nextLine();
	   //System.out.println(str);
	   /*
	        System.out.println("欢迎光临马士兵教育");
			System.out.println("添加用户信息");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入会员号码<四位整数>");
			String number = sc.nextLine();
			System.out.println("请输入会员生日<日/月>");
			String birthday = sc.nextLine();
	        System.out.println("请输入会员积分");
			String score = sc.nextLine();
	   
	        if(number.length()==4){
				System.out.println("会员信息如下");
				System.out.println(number+"\t"+birthday+"\t"+score);
				
			}else{
				System.out.println("会员号码输入错误，请输入4位整数");
			}
	   */
	   
	   //多分支结构 
	   /*
	   int age = (int)(Math.random()*100);
	   if(age<10){
		   System.out.println("儿童");
	   }else if(age<20){
		   System.out.println("少年");
		   
	   }else if(age<30){
		   System.out.println("青年");
	   }else if(age<40){
		   System.out.println("中年");
	   }else if(age<70){
		   System.out.println("老年");
	   }
	   else{
		   System.out.println("老不死的");
	   }
	   */
	   //嵌套if的分支结构
	   /*int time =(int)(Math.random()*40);
	   if(time<20){
		   System.out.println("欢迎进入决赛");
		   String sex = ((int)(Math.random()*2))==0?"girl":"boy";
		   if(sex == "girl"){
			   System.out.println("欢迎进入女子组");
		   }else{
			   System.out.println("欢迎进入男子组");
		   }
	   }else{
		   System.out.println("成绩太差，被淘汰");
	   }*/
	   //switch多分支结构
	  /* int random = (int)(Math.random()*26);
	   char ch = (char)('a'+random);
	   switch(ch){
		   case'a':
		   System.out.println("元音："+ch);
		   break;
		   case'e':
		   System.out.println("元音："+ch);
		   break;
		   case'i':
		   System.out.println("元音："+ch);
		   break;
		   case'o':
		   System.out.println("元音："+ch);
		   break;
		   case'u':
		   System.out.println("元音："+ch);
		   break;
		   case'y':
		   System.out.println("半元音："+ch);
		   break;
		   case'w':
		   System.out.println("半元音："+ch);
		   break;
		   default:
		   System.out.println("辅音："+ch);;
		   
	   }*/
	  /* int random = (int)(Math.random()*26);
	   char ch = (char)('a'+random);
	   switch(ch){
		   case'a':
		   case'e':
		   case'i':
		   System.out.println("元音："+ch);
		   break;
		   case'o':
		   case'u':
		   case'y':
		   case'w':
		   System.out.println("半元音："+ch);
		   break;
		   default:
		   System.out.println("辅音："+ch);
	   }*/
	  /* 循环语句
	  1.while  先判断 后执行
	     需要四部分组成
		   初始化：变量的初始化
		   条件判断：必须返回true或false的值
		   循环体：具体的要执行的逻辑代码
		   迭代器：促使此循环结束
	  2.do while 先执行 后判断
	   
	  */
	  //while
	  
	 /* int i = 1;
	  while(i<=100){
		  System.out.println("第"+i+"遍输出");
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
	   
	   //do while  至少被循环一次
	   
	   /*int i = 1;
	   do{
		   System.out.println("第"+i+"遍输出");
		  i++;
	   }while(i<=100);*/
	   
	   //for 循环（使用最多）
	    /*  语法规则：
		      for(初始化1;条件表达式2;步进器4){
				  代码逻辑3
			  }
			使用优点：
               1.代码简洁;
               2.变量初始化的时候，for循环的作用域仅仅是当前for循环结构；
                 while循环的作用域是从变量的定义开始到整个方法结束
				 
	   */
	     /* for(int i = 1;i<=100;i++){
			  
			  System.out.println("地"+i+"遍输出");
		  }
	   */
	      /* int sum = 0;
		   for(int i = 1; i<=100;i++){
			   if(i % 2==0){
				   sum+=i;
			   }
				  
		   }
	   System.out.println("100内的偶数和是"+sum);
	   */
	 //年龄比率
	 //定义Scanner
	 //Scanner sc = new Scanner(System.in);
	 //存储年龄
	/* int threetyUp = 0;
	 int threetyDown = 0;
	 for(int i = 0;i<10;i++){
		 System.out.println("请输入第"+(i+1)+"位顾客的年龄:");
		 int age = sc.nextInt();
		 if(age>30){
			 threetyUp++;
		 }else{
			 threetyDown++;
		 }
		 
	 }
	   
	  System.out.println("超过30岁的比率为："+(threetyUp/10.0*100)+"%");
	  System.out.println("低于30岁的比率为："+(threetyDown/10.0*100)+"%");
	   */
	  //用while和for分别计算100以内的奇数和偶数的和，并输出
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
	  System.out.println("100以内的奇数和为:"+sumj);
	 System.out.println("100以内的偶数和为:"+sumo); 
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
     System.out.println("100以内的奇数和为:"+sumj);
	 System.out.println("100以内的偶数和为:"+sumo); 
*/
     //用while和for循环输出1-1000之间能被五整除的数，且每行输出3个
    
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
    //使用循环分别实现10进制转换2进制
  /* Scanner sc = new Scanner(System.in);
   System.out.println("请输入一个10进制数");
   int number = sc.nextInt();
    String str = "";
	while(number!=0){
		int j = number % 2;
		str = j+str;
		number = number/2;
	}
	System.out.println(str);
	*/
	
	
	//1-10的阶乘和
    
	/*long  number = 1;
	 long sum = 0;
	for(long i = 1;i<=10;i++){	
		number *= i; 
	   }
		 sum += number;
		 
	System.out.println(sum);
	*/
	
	/*
	//bresk:跳出循环
	  当包含多层循环时，break只能跳出内层循环
	
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
	
	//请打印输出（1，1）（1，2）（1，3）....知道输出（6，6）
	/*for(int i = 1;i<10;i++){
		for(int j = 1;j<10;j++){
			System.out.println("("+i+","+j+")");
			if(i==6 && j==6){
				return;//break;
			}
		}
	}
	*/
	//continue:跳出本次循环
	//100-150之间不能被三整除的数；
	/*for(int i = 100;i<=150;i++){
		if(i % 3==0){
			continue;
		}
		System.out.println(i);
	}
	*/
	/*return
	   1.返回方法的返回值
	   2.终止当前程序
     */
	/* System.out.println(get());
       for(int i =0;i<10;i++){
		   System.out.println(i);
		   if(i == 5){
			 return; //System.exit(-1) ;
		   }
		   System.out.println("接着执行");
	   }
	}

public static int get(){
	return 100;
}
*/

   //九九乘法表
   //正三角
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
  System.out.println("请输入学生姓名:");
  String name =sc.nextLine();
  for(int i =1;i<=5;i++){
	  System.out.println("请输入第"+i+"门的成绩");
	  int number  =sc.nextInt();
	 	  sum += number;
          j = sum/5;		  
	  if(number<=0 || number>100){
        System.out.println("输入的成绩有问题，请重新输入");
	    return;
	   
	  } 
	 
  }
    System.out.println(name +"的平均分:"+j);
	 
  */  
 
    /*int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入班级总人数:");
    int number =sc.nextInt();
    for(int i = 1;i<=number;i++){
	  System.out.println("请输入第"+i+"位同学的成绩");
	   int score  = sc.nextInt();
	   if(score<80){
         continue;
	  }
	   count++; 
  }
     System.out.println("80分以上的同学人数："+count);
	 double j = (double)count / number*100;
     System.out.println("80分以上的同学人数占全班比率:"+j+"%");
   */
   
     /*
      for(int i = 1;i<=3;i++){
		Scanner sc = new Scanner(System.in);
		System.out.println("会员"+i+"信息录入"); 
		System.out.println("请输入会员号码(<四位整数>):");
		String number = sc.nextLine();
		System.out.println("请输入会员生日(月/日<两位整数表示>):");
		String birthday = sc.nextLine();
		System.out.println("请输入会员积分");
		int vip = sc.nextInt();
		int length = number.length();
		System.out.println("您录入的会员信息是：");
        System.out.println(number+"\t"+birthday+"\t"+vip);
		if(length != 4){
		System.out.println("您录入的会员信息有误...");
		System.out.println("\n");
			continue;
			
		}
		System.out.println("\n");	
		
		
	}
   */
   //打印5*4的平行四边形
  
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
  // 直角三角形
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
   //3个班级各4名学员参赛，计算每个班级参赛学员平均分，统计成绩大于85分学员 数
       /* int count = 0;
        for(int i = 1;i<=3;i++){
		  System.out.println();
		  System.out.println("请输入"+i+"班的成绩");
	      for(int j = 1;j<=4;j++){
	      Scanner sc = new Scanner(System.in);
		  System.out.println("第"+j+"位同学的成绩"); 
		  int number = sc.nextInt();
		  if(number < 80){
			  continue;
		  }
		  if(number >= 80){
		   count++;
		  } 
	    }
		 System.out.println(i+"班八十分以上的人数为："+count);
         count = 0;
		 System.out.println();
   }*/
   //百钱买百鸡：公鸡5元一个，母鸡三元一个，小鸡一元三个；
   /*  for(int i=1;i<=20;i++){
		 for(int j=0;j<=33;j++){
			for(int k=0;k<=300;k++){
				if((i+j+k)==100 && ((5*i+3*j+k/3)==100) && (k % 3==0)){
				System.out.println("公鸡:"+i+"\t母鸡:"+j+"\t小鸡:"+k);	
					
				}
			} 
		 }
	 }
	   
   */
   
   
   //裴波那契数列1.1.2.3.5.8.13.21.34.55......
   /*  Scanner sc = new Scanner(System.in);
     System.out.println("请输入要打印的裴波那契数列的个数");
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
   
  //递归算法
      //在程序运行中，有时需要调运程序本身，此时可以用递归；
	  //在程序中能不用就不用；
	  //使用递归的时候会加大资源的消耗；
	  //如果递归层次深，会造成栈溢出；
	  //其他方法无法解决必须要用递归函数时可以使用；
	  //比如：输出某个盘目录下的所有文件目录
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