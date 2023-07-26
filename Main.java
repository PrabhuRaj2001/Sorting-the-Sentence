class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
	String sum="";
			int  c[]=new int [a.length];
			String k1[]=new String[a.length];
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length();j++)
				{
					if(a[i].charAt(j)>=48 && a[i].charAt(j)<=57 )
					{
						k=(int)a[i].charAt(j)-48;
						k=k-1;
						
					}
					else
					{
						sum=sum+a[i].charAt(j);
					}
					
				}
				k1[k]=sum;
				sum="";
				k=0;
				
				
			}
			for(int i=0;i<a.length;i++)
			{
				
				sum=sum+k1[i];
				sum=sum+" ";
			}
        return sum.trim();
    }
}