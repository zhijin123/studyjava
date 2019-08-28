import java.util.Scanner;
public class OneWork{
	
	public static void main(String[] ages){
		/*System.out.println("欢迎登陆马士兵抽奖系统");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员号码<四位整数>");
	    String numbea = input.nextLine();
		String numbeb = input.nextLine();
		String numbec = input.nextLine();
		String numbed = input.nextLine();
		System.out.println(numbea+numbeb+numbec+numbed);
		int random = (int)(Math.random()*10);
	    if(numbeb=="random"){
				System.out.println("恭喜中奖");	
			}else{
				System.out.println("谢谢支持");
			}*/
		
		
		//内容相等时用 equals
		 /*System.out.println("会员登陆");
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入用户名");
		 String name = input.nextLine();
		 System.out.println("欢迎");
		 System.out.println("请输入用户密码");
		 int number = input.nextInt();
	     if(name.equals ("青") && number == 123){
			 System.out.println("欢迎您青");
		}else{
			  System.out.println("您不是会员");
		 }*/
		 
		 
		 /*System.out.println("欢迎你来搬桌子");
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入年龄");
		 int n = input.nextInt();
		 if(n < 7 & n >= 5){
		     System.out.println("请输入性别,1为boy，2为gril");
		     int sex = input.nextInt();
			 if(sex == 1){
			 System.out.println("你可以搬动桌子");
			 }else{
				 System.out.println("搬不动桌子");
			 }
		 }else{
			 System.out.println("可以搬动桌子");
		 }*/
		 
		 /*System.out.println("我想买车");
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入银行存款");
		 int number = input.nextInt();
		 if(number>500){
			System.out.println("存款超过500万"); 
			System.out.println("买凯迪拉克");
		 }else if(number>100){
		    System.out.println("存款超过100万"); 
			System.out.println("买帕萨特");
		 }else if(number>50){
		    System.out.println("存款超过50万"); 
			System.out.println("买依兰特");
		 }else if(number>10){
		    System.out.println("存款超过10万"); 
			System.out.println("买奥迪");
		 }else{
			 System.out.println("买捷安特");
		 }*/
		 
		/*System.out.println("请输入您的积分");
		 Scanner input = new Scanner(System.in);
		 int number = input.nextInt();
		 if(number<2000){
			System.out.println("九折优惠"); 
		 }else  if(number>=2000 & number<4000){
			 System.out.println("八折优惠");
		 }else  if(number>=4000 & number<8000){
			 System.out.println("七折优惠");
		 }else{
			System.out.println("六折优惠"); 
		 }*/
		 
		 
		 
		
		 /*Scanner input = new Scanner(System.in); 
		 System.out.println("请输入消费总额");
		 int number = input.nextInt();
		 if(number>=100){
			 System.out.println("你可以享受打折优惠");
			  System.out.println("请输入类型，1为会员、2为非会员");
			  int categories = input.nextInt();
		     if(categories==1){
		           System.out.println("会员");
			 if(number>=200){
				 System.out.println("享受7.5折优惠");
			 }else{
				 System.out.println("享受8折优惠");
			 }
			 }else{
				 System.out.println("享受9折优惠");
			 }
		 }else{
			 System.out.println("不享受打折优惠");
		 }*/
		 
		/* Scanner input = new Scanner(System.in); 
		 System.out.println("请输入数字");
		 int number = input.nextInt();
		switch(number){
			case 1:
			System.out.println("爸爸的号码");
			break;
			case 2:
			System.out.println("妈妈的号码");
			break;
			case 3:
			System.out.println("爷爷的号码");
			break;
			case 4:
			System.out.println("奶奶的号码");
			break;
			default:
			System.out.println(+number);
		}
			*/
			
			/*课后作业3—机票打折
             淡旺季机票的价格，原价机票价格为5000元，
             淡季头等舱打5折，经济舱打4折
             旺季头等舱打9折，经济舱打8折
           要求
            编写程序实现：
            输入任意的月份与舱位来计算机票的价格
            1代表头等舱，2代表经济舱
            4-10月为旺季，其他月份为淡季
			//switch
			Scanner input = new Scanner(System.in); 
		    System.out.println("请月份数字<1-12>");
		    int number = input.nextInt();
			System.out.println("请选择舱位,1代表头等舱，2代表经济舱");
		    int seat = input.nextInt();
			int cost = 5000;
			switch(number){
			case 4:
			  if(seat==1){
			     System.out.println("价格:"+0.9*5000+"Rmb");
			  }else{
					 System.out.println("价格:"+0.8*5000+"Rmb");
			  }
			break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			 if(seat==1){
			     System.out.println("价格:"+0.5*5000+"Rmb");
			 }else{ 
				 System.out.println("价格"+0.4*5000+"Rmb");
			 }
			break;
			case 12:
			case 1:
			case 2:
			case 3:
			default:
			System.out.println("输入错误");
		}
			*/
			
			
		
		 //else if 实现
		 /*Scanner input = new Scanner(System.in); 
		    System.out.println("请月份数字<1-12>");
		    int number = input.nextInt();
			System.out.println("请选择舱位,1代表头等舱，2代表经济舱");
		    int seat = input.nextInt();
			int cost = 5000;
		 if(number >= 1 & number < 4 & seat== 1){
			 System.out.println("价格:"+0.5*5000+"Rmb");
		 }else if(number >= 1 & number < 4 & seat== 2){
			 System.out.println("价格:"+0.4*5000+"Rmb");
		 }else if(number >= 4 & number < 11 & seat== 1){
			 System.out.println("价格："+0.9*5000+"Rmb");
		}else if(number >= 4 & number < 11 & seat== 2){
			 System.out.println("价格："+0.8*5000+"Rmb"); 
		 }else if(number >= 11 & number <= 12 & seat== 1){
			 System.out.println("价格："+0.5*5000+"Rmb");
		 }else if(number >= 11 & number <= 12 & seat== 2){
			 System.out.println("价格："+0.4*5000+"Rmb");
		 }else{
			 System.out.println("输入错误");
		 }*/
		 
		 
		 
		}
}