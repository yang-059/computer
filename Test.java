package cpuExperiment;

import shiyansiyou.HardDisk;

public class Test {
	
	public static void main (String[] args) {
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
		
		
		CPU cpueg=new CPU();
		cpueg.setSpeed(2200);
		HardDisk diskeg=new HardDisk();
		diskeg.setAmount(1200);
		PC pceg=new PC();
		pceg.setCPU(cpueg);
		pceg.setHardDisk(diskeg);
		pceg.show();
	}
	
	Test(){        //构造方法1
		
	}
	Test(byte a){  //构造方法2
		
	}
	


}
/*
 实验二 PC机模拟程序

基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。
1.附加要求：
a.类中定义不少于两个构造方法；
b.每个类定义不少于2个属性，且属性的类型应该多样化；
c.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，
避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
d.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
2.实验报告提交
实验报告应该包“实验内容”、“实验方法”或、“实验设计”、“核心方法/伪代码”、“实验结果”、
“实验感想”等步骤；
除了“实验结果”外，其他小节杜绝截屏给出图；
本次实验通过github平台提交，包括：
程序的代码及相关资源文件；
Readme.md文件写作（即实验报告部分）。
每名同学通过云班课的作业提交github实验的URL链接。
 */
