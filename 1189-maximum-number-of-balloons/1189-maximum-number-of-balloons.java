class Solution {
    public int maxNumberOfBalloons(String text) {
        
        //b-1
        //a-1
        //l-2
        //o-2
        //n-1
        
        int[]arr=new int[5];
        
        for(int i=0;i<text.length();i++){
            
            if(text.charAt(i)=='b'){
                arr[0]++;
            }
            else if(text.charAt(i)=='a'){
                arr[1]++;
            }
            else if(text.charAt(i)=='l'){
                arr[2]++;
            }
            else if(text.charAt(i)=='o'){
                arr[3]++;
            }
            else if(text.charAt(i)=='n'){
                arr[4]++;
            }
        }
        
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            
            max=Math.min(max,arr[i]);
        }
        
        return max;
    }
}