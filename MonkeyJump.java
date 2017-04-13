public class MonkeyJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int numJump = 0;
		int jumpLength = 5;
		int slide = 4;
		int[] lengthToJumpArray = {13,-13};	
		GetJumpCount(jumpLength, slide, lengthToJumpArray);
		//int[] lengthToJumpArray = {23,202,33,4,56};
		//int[] lengthToJumpArray = {23,202,33,4,56};
//		int effectiveJumpLength = jumpLength - slide;
//		
//		for(int i= 0; i < lengthToJumpArray.length; i++ ){	
//			int adjustedJump = lengthToJumpArray[i] - jumpLength ;
//			if(lengthToJumpArray[i] <= jumpLength)
//				numJump += 1;
//			else if(adjustedJump % effectiveJumpLength == 0)
//				numJump = adjustedJump/effectiveJumpLength + 1 + numJump;
//			else //(adjustedJump % effectiveJumpLength != 0)
//				//First +1 is for adjusted lengh and last +1 is for the last jump that was deducted
//				numJump = (adjustedJump/effectiveJumpLength + 1) + 1 + numJump;
//
//		}
//		System.out.println("Total Number of Jump required is " + numJump);
		

	}
	
	   public static int GetJumpCount(int jumpLength,int slide,int[] lengthToJumpArray)
	    {
			int numJump = 0;
			int effectiveJumpLength = jumpLength - slide;
			for(int i= 0; i < lengthToJumpArray.length; i++ ){	
				int adjustedJump = lengthToJumpArray[i] - jumpLength ;
				if(lengthToJumpArray[i] <= jumpLength)
					numJump += 1;
				else if(adjustedJump % effectiveJumpLength == 0)
					numJump = adjustedJump/effectiveJumpLength + 1 + numJump;
				else //(adjustedJump % effectiveJumpLength != 0)
					//First +1 is for adjusted lengh and last +1 is for the last jump that was deducted
					numJump = (adjustedJump/effectiveJumpLength + 1) + 1 + numJump;
			}
			System.out.println("Total Number of Jump required is " + numJump);
			return numJump;				
	    }
}
