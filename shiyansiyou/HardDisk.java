package shiyansiyou;

public class HardDisk {
	int amount;
	public void setAmount(int m) {
		if(m<0||m>1000) {
		System.out.println("����ֵ"+m+"������������䡣");
		}else{
			this.amount=m;
		}
		
    	
    }
	public int getAmount() {
    	return amount;
    	
    }
    
    
	
    public HardDisk(){        //���췽��1
		
	}
	HardDisk(float a){       //���췽��2
		this.fu=a;           //private�ؼ��ֵ�ʵ��
	}
	
	
}
