class MyCalendar {

    List<int[]>calender;
    public MyCalendar() {
        
        calender=new ArrayList();
    }
    
    public boolean book(int start, int end) {
        
        for(int []arr:calender){
            if(arr[0]<end && arr[1]>start){
                return false;
            }
          
        }
          calender.add(new int[]{start, end});
            
            return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */