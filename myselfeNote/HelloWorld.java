/*
使用命令行的方式执行的时候，cmd的默认编码格式是GBK
因此在输入中文的时候需要设置文件的格式为ANSI,就不会出现乱码错误

注意：
    1.java文件的名称必须跟public class的名称保持一致
	2.一个java文件中可以包含多个class，但是public class只能出现一次，
	3.public static void main(String[] ages)是所有Java程序的入口，如果向执行对应的Java代码
	  则必须要添加如下方法，且格式固定
	4.main方法中参数可支持多种写法：String[] ages ,String [] ages,String ages[];
	5.main方法中参数的名称无所谓，但是一般写成ages
	6.java代码在编写的时候，每行结尾的时候必须要用;(英文）结束
	7.Java代码的代码快需要使用{}括起来，前后匹配
*/
public class HelloWorld{
	    
     public static void main(String[] args){
        System.out.println("欢迎学习JAVA");
	}	
}