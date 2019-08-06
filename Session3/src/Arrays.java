
public class Arrays {

	public static void main(String[] args) {

		/*
		
		// Single Value Containers
		// Vote Counts for 2 Different Parties
		int aPartyLdh = 107761;
		int aPartyJal = 217761;
		int aPartyFzr = 145765;
		int aPartyMog = 304762;
		int aPartyBat = 204769;
		
		int bPartyLdh = 238761;
		int bPartyJal = 127761;
		int bPartyFzr = 276551;
		int bPartyMog = 190762;
		int bPartyBat = 123769;
		
		int aPartyVoteCount = aPartyLdh + aPartyJal + aPartyFzr + aPartyMog + aPartyBat;
		int bPartyVoteCount = bPartyLdh + bPartyJal + bPartyFzr + bPartyMog + bPartyBat;
		
		System.out.println(">> aPartyVoteCount is: "+aPartyVoteCount);
		System.out.println(">> bPartyVoteCount is: "+bPartyVoteCount);
		
		if(aPartyVoteCount > bPartyVoteCount){
			System.out.println(">> Party A Won");
		}else{
			System.out.println(">> Party B Won");
		}
		
		*/
		
		// We know cities will be lot of
		// Hence we should store data in Multi Value Container
		// Multi Value Containers : Array
		//					  0			1		2		3		4		
		int[] aPartyVotes = {107761, 217761, 145765, 304762, 204769};
		int[] bPartyVotes = {238761, 127761, 276551, 190762, 123769};
		
		//System.out.println(">> aPartyVotes[3] is: "+aPartyVotes[3]);
		//System.out.println(">> bPartyVotes[3] is: "+bPartyVotes[3]);
		
		System.out.println(">> aPartyVotes length is: "+aPartyVotes.length);
		System.out.println(">> bPartyVotes length is: "+bPartyVotes.length);
		
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.println(">> aPartyVotes["+i+"] is: "+aPartyVotes[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<bPartyVotes.length;i++){
			System.out.println(">> bPartyVotes["+i+"] is: "+bPartyVotes[i]);
		}

	}

}
