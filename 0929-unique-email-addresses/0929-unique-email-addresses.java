class Solution {
    public int numUniqueEmails(String[] emails) {
        
        //before @
        //. add
        //+ dont add
        
        //after @
        // do not 
        
        HashSet<String>set=new HashSet();
        
        
        for(int i=0;i<emails.length;i++){
            
           String[]arr=emails[i].split("@");
            
            String res="";
            
            int k=0;
            
            while(k<arr[0].length() && arr[0].charAt(k)!='+'){
               if(arr[0].charAt(k)=='.'){
                   k++;
               }
                else{
                res+=arr[0].charAt(k);
                k++;
                }
            }
            
            res+='@';
            res+=arr[1];
            
            set.add(res);
        }
        
        return set.size();
    }
}