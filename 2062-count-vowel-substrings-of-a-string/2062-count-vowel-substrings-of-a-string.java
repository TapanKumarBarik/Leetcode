class Solution {
    public int countVowelSubstrings(String word) {
        
        
        HashSet<Character>set=new HashSet();
        
        int n=word.length();
        int count=0;
        
        for(int i=0;i<n-4;i++){
            
            set.clear();
            
            for(int j=i;j<n;j++){
                char c=word.charAt(j);
                
                if(c=='a'|| c=='e' || c=='i'|| c=='o'|| c=='u'){
                    set.add(c);
                    if(set.size()==5){
                    count++;
                    }
                }
                
                else{
                    break;
                }
                
            }
        }
        return count;
    }
}