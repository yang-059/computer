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
    	System.out.println("cpu���ٶ�Ϊ"+cpu.getSpeed());
    	System.out.println("Ӳ������Ϊ"+HD.getAmount());
	
    }
    
    
    private char fu;
    PC(){        //���췽��1
		
	}
    PC(char a){  //���췽��2
		this.fu=a;
	}
}
