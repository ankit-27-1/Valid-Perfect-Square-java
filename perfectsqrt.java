class perfectsqrt {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int end=num;
        int start=0;
        while(end>=start){
            long mid=(end-start)/2+start;
            if(num>mid*mid){
                start=(int)(mid+1);
            }
            else if(num<mid*mid){
                end=(int)(mid-1);
            }
            else if(mid*mid==num){
                return true;
            }
        }
        return false;
    }
}
