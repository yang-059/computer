# G201    2020322059   杨一博
2020年秋Java课程第5周实验 10月12日 P110 第4题

## 实验目的
1. 完成关于PC、内存等模拟的程序。
2. 类中定义不少于两个构造方法；
3. 每个类定义不少于2个属性，且属性的类型应该多样化；
4. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，
避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
5. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法.

## 实验过程
1. 按照题目要求创建package及四个class；并将题目要求做基本赋值并创建对象；
+ CPU类：要求getSpeed（）返回speed的值，要求setSpeed（int m）方法将参数m的值赋值给speed；
+ HardDisk类：要求getAmount（）返回amount的值，要求setAmount（int m）方法将参数m的值赋值给amount；
+ PC类：要求setCPU（CPU c）将参数c的值赋值给cpu，要求setHardDisk（HardDisk h）方法将参数h的值赋值给HD，要求将show（）方法能显示cpu的速度和硬盘的容量。
+ 主类Test的要求
  - *（1）main方法中创建一个CPU对象cpu，cpu将自己的speed值。*
  - *（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200.*
  - *（3）main方法中创建一个PC对象pc。*
  - *（4）pc调用setCPU（CPU c）方法，调用时实参是cpu。*
  - *（5）pc调用setHardDisk（HardDisk h）方法，调用时实参是disk。*
  - *（6）pc调用show（）方法。*
2. 按照题目要求调用方法；
3. 针对课程附加要求加入需要的属性和构造方法；在其中增加private属性赋值；
4. 对硬盘内存做逻辑判断；
5. 建立新包，将HardDisk类放入新包，改HardDisk类为public以便程序正常运行；
6. 检查实验内容并撰写实验报告。

## 核心方法
1.对CPU做调用和返回值的要求；
```
public void setSpeed(int m) {
    	this.speed=m;
}
public int getSpeed() {
	return speed;  	
}
```

2.pc调用各子类方法，并加实参；（此处做两个调用并赋给实参，考察硬盘逻辑判断是否可以正常运行）
```
		CPU cpueg=new CPU();
		cpueg.setSpeed(2200);
		HardDisk diskeg=new HardDisk();
		diskeg.setAmount(1200);
		PC pceg=new PC();
		pceg.setCPU(cpueg);
		pceg.setHardDisk(diskeg);
		pceg.show();
```

3.对硬盘做容量的逻辑判断，使得硬盘容量在0-1000之间。
```
	public class HardDisk {
	int amount;
	public void setAmount(int m) {
		if(m<0||m>1000) {
		System.out.println("该数值"+m+"有误，请检查后重输。");
		}else{
			this.amount=m;
		}
```


## 实验结果
![](https://github.com/yang-059/computer/blob/main/CPU运行结果.PNG)

## 实验感想
- 在pc调用方法时，我因未对CPU和HardDisk中的属性做this.关键字定义，导致实参无法被调用;
- 在对硬盘做逻辑判断时，对于判断语句不够熟悉，不知道做两个定义是中间应该使用“||”和“&&”来判定。

