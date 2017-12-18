# DecoratorDemo

# 装饰模式

### 1、介绍：
 装饰模式又称为包装模式，结构型设计模式之一。其使用一种对客户端**透明的方式来动态地扩展对象的功能**，同时也是继承关系的一种**替代方案**之一。

### 2、定义：

动态地给一个对象添加额外的职责。就增加功能而言，装饰模式生成子类更加灵活。

### 3、使用场景：

需要透明且动态地扩展类的功能时。

### 4、UML类图：

![](https://i.imgur.com/orwLGPa.png)

### 5、代码演示：

          
 抽象组件

	public abstract class Person {
	    public abstract void dressed();
	}

 具体组件（被装饰者）

	public class Boy extends Person {
	    @Override
	    public void dressed() {
	        System.out.println("基本的装扮");
	    }
	}
	     
 抽象装饰类

	public abstract class Cloth extends Person {
	    protected Person person;
	
	    public Cloth(Person person){
	        this.person = person;
	    }
	
	    @Override
	    public void dressed() {
	        person.dressed();
	    }
	} 
       
具体装饰类1

	public class GoodCloth extends Cloth {
	
	    public GoodCloth(Person person) {
	        super(person);
	    }
	
	    @Override
	    public void dressed() {
	        dressTs(); //  在super的前后调用都行
	        super.dressed();
	        dressJean();
	    }
	
	    private void dressJean() {
	        System.out.println("穿着好牛仔裤");
	    }
	
	    private void dressTs() {
	        System.out.println("穿着好短袖");
	    }
	}

具体装饰类2

	
	public class BadCloth extends Cloth {
	
	    public BadCloth(Person person) {
	        super(person);
	    }
	
	    @Override
	    public void dressed() {
	        dressTs(); //  在super的前后调用都行
	        super.dressed();
	        dressJean();
	    }
	
	    private void dressJean() {
	        System.out.println("穿着破牛仔裤");
	    }
	
	    private void dressTs() {
	        System.out.println("穿着破短袖");
	    }
	}

客户类


	public class Client {
	    public static void main(String []args){
	        Person person = new Boy();
	
	        Cloth cloth = new GoodCloth(person);
	        cloth.dressed();
	
	        Cloth cloth1 = new BadCloth(person);
	        cloth1.dressed();
	
	    }
	}


###6、Android中源码的使用：ContextImp

###7、小结：

装饰模式和代理模式有点相似，常常会把装饰模式看成代理。 

装饰模式是以对客户端透明的方式扩展对象的功能，是继承关系的一个方案；而代理模式则是给一个对象提供一个代理对象，并由代理对象来控制对原有对象的引用。

装饰模式应该为所装饰的对象增强功能；代理模式对代理的对象施加控制，但不对对象本身的功能进行增强。



