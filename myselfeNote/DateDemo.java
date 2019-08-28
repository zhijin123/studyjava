/*
数据类型
   java是一种强类型的语言
       强类型表示，变量在定义的时候必须显示的声明类型是什么
       弱类型表示，变量会更据值自己去推，不需要声明类型：js，python，scala
   Java数据类型
     基本数据类型（四类八种）
	    整数类型：byte short int long（不同类型表示长度）
		   byte：使用一个字符储存，因此范围-128-127
		   short：使用俩个字符储存，因此范围是-32768-32767
		   int： 使用四个字符储存，因此范围正负21亿
		   long：使用八个字符储存，因此范围特别大
		     在使用整型类型时，系统默认是int类型，如需使用long类型的话，
			 必须在数字后面加大写L,（防止与1混淆）
		浮点类型：float double  小数类型：使用小数点，科学记数法
		float：单精度，可以精确到7位有效数字，多数情况下float不能满足
		double：双精度，可以精度是float的双倍，14位有效数字
		   注意：
		     1.系统默认是double类型
			 2.使用float时需要在数字后面加F（大小写都可以）
			 3.高精度的double换为低精度的float运算时有精度损失(第六不一样的时候是false，第七位不一样是ture）
		字符类型：char
		  占用俩个字符，使用''表示,在unicode里面占前128位，可以当作int处理
		  \b退格，\n换行，\r回车，\t制表符；
		布尔类型：boolean
		  只有ture和false，储存时占一位，不是一个字节
	引用数据类型
	     类
		 接口
		 数组
		 string 
*/


public class DateDemo{
	
	public static void main(String[] ages){
		//byte b = 128;
		//short s = 44444;
		//int c = 555555;
		//long l = 12564856632585L;
		
		//int a =31111111;
		//long b = 3111111111L;
		
		float f1 = 2.122122234123131f;
		float f2 = 2.122123312132332f;
	    System.out.println(f1==f2);
		
		//表示一个字符
		char a = 'A';
		//表示一个字符串，或者一个字符序列
		String s = "A";
		System.out.println(a==65);
		
		char ch = '\t';
		System.out.println("["+ch+"]");
		
		
		}
}