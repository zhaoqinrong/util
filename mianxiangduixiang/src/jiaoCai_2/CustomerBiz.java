package jiaoCai_2;
//�ͻ���
class CustomerBiz {
	 String  names[]=new String[10];
	public void addName(String name){//���ӿͻ�
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){//����ͻ���Ϣ
		for(int i=0;i<names.length;i++){
			if(names[i] != null)
			System.out.print(names[i]+"\t");
		}
	}
	public boolean editName(String oldName,String newName){//�޸Ŀͻ���Ϣ
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

