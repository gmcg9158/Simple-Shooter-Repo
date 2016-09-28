
public class Lane {
	 private int position;
	 private boolean occupied;
	 private boolean canMove=true;
	 
	 public static void main(String[] args)
	 {
			
			
	 }

	
	public void changePos(){
		if(canMove==true){
		position=position+1;
		}
		else
		position=position;
	}
	
	public int getPos(){
		return position;
	}
	
	public void ifOcc(){
		if(occupied==true){
			position=position;
		}
	}
	
	public boolean getOcc()
	{
		return occupied;
	}
	
	public boolean getCM(){
		return canMove;
	}
	
	

}
