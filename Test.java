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
	
	Test(){        //���췽��1
		
	}
	Test(byte a){  //���췽��2
		
	}
	


}
/*
 ʵ��� PC��ģ�����

����Ҫ����ɽ̲�p110 ���������PC���ڴ��ģ��ĳ���
1.����Ҫ��
a.���ж��岻�����������췽����
b.ÿ���ඨ�岻����2�����ԣ������Ե�����Ӧ�ö�������
c.���ݿ����й��ڷ���Ȩ�޵����ݣ����Զ������Ե����η������������ж��巽���������ԣ�
����ֱ��ͨ���������.���ԡ�����ʽ��������ֵ���Ҷ���ķ�����Ӧ���з��ϳ�����߼��жϣ�
d.���԰ѱ���ʵ��Ķ��������ڲ�ͬ�İ��У�������η�private���÷���
2.ʵ�鱨���ύ
ʵ�鱨��Ӧ�ð���ʵ�����ݡ�����ʵ�鷽�����򡢡�ʵ����ơ��������ķ���/α���롱����ʵ��������
��ʵ����롱�Ȳ��裻
���ˡ�ʵ�������⣬����С�ڶž���������ͼ��
����ʵ��ͨ��githubƽ̨�ύ��������
����Ĵ��뼰�����Դ�ļ���
Readme.md�ļ�д������ʵ�鱨�沿�֣���
ÿ��ͬѧͨ���ư�ε���ҵ�ύgithubʵ���URL���ӡ�
 */
