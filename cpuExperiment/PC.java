package cpuExperiment;

import shiyansiyou.HardDisk;

public class PC {
	CPU cpu;
	HardDisk HD;
    public void setCPU(CPU c) {
    	this.cpu=c;
	
    }
    public void setHardDisk(HardDisk h) {
    	this.HD=h;
	
    }
    public void show() {
    	System.out.println("cpu的速度为"+cpu.getSpeed());
    	System.out.println("硬盘容量为"+HD.getAmount());
	
    }
    
    
    private char fu;
    PC(){        //构造方法1
		
	}
    PC(char a){  //构造方法2
		this.fu=a;
	}
}
