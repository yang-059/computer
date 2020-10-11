package shiyansiyou;

public class HardDisk {
	int amount;
	public void setAmount(int m) {
		if(m<0||m>1000) {
		System.out.println("该数值"+m+"有误，请检查后重输。");
		}else{
			this.amount=m;
		}
		
    	
    }
	public int getAmount() {
    	return amount;
    	
    }
    
    
	
    public HardDisk(){        //构造方法1
		
	}
	HardDisk(float a){       //构造方法2
		this.fu=a;           //private关键字的实验
	}
	
	
}
