package dynamicprogramming;



class EditDistance {
	
	
	int[][] editdistance;
	
	
	public void print(int[][] array, int l1,int l2)
	{
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	public int mindistance(String word1, String word2)
	{
		editdistance = new int[word1.length()+1][word2.length()+1];		
		for(int i=0;i<word1.length()+1;i++)
		{
			for(int j=0;j<word2.length()+1;j++)
			{
				//System.out.println(word1.charAt(i-1)+" "+word2.charAt(j-1));
				if(i==0 || j==0)
				{
					editdistance[i][j] = Math.max(i, j);
				}
				else if(word1.charAt(i-1) == word2.charAt(j-1))
				{
					editdistance[i][j] = editdistance[i-1][j-1];
				}
				else
				{
					editdistance[i][j] = Math.min(editdistance[i-1][j], Math.min(editdistance[i][j-1], editdistance[i-1][j-1])) +1;
				}
			}
		}
		
		//print(editdistance, word1.length()+1,word2.length()+1);
		return editdistance[word1.length()][word2.length()];
	}

	
	
	
}
