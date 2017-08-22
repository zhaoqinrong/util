package jiaoCai_2;
//客户类
class CustomerBiz {
	 String  names[]=new String[10];
	public void addName(String name){//增加客户
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){//输出客户信息
		for(int i=0;i<names.length;i++){
			if(names[i] != null)
			System.out.print(names[i]+"\t");
		}
	}
	public boolean editName(String oldName,String newName){//修改客户信息
		boolean flag=false;
		for(int i=0;i<names.length;i++){
			if(names[i].equals(oldName)){
			names[i]=newName;
			flag=true;
			break;
			
			}
			
				
		}
		return flag;
	}
	
	
}

