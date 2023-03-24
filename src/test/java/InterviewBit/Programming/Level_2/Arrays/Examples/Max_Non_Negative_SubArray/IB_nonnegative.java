public class IB_nonnegative {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int i=0;long sum1=0;
        while(i<A.size()){
            while(A.get(i)<0){i++;if(i==A.size()){break;}}
            if(i==A.size()){break;}
            //System.out.println(i);
            long sum=0;int count=0;
		    while(A.get(i)>=0){
                //System.out.println("i "+i);
                count++;
                sum=sum+A.get(i);
                i++;
                if(i==A.size()){break;}
            }
            if(sum>sum1){
                ret.clear();
                while(count>0){
                    ret.add(A.get(i-count));
                    count--;
                }
                sum1=sum;
            }else if(sum==sum1){
                if(ret.size()<count){
                    ret.clear();
                    while(count>0){
                        ret.add(A.get(i-count));
                        count--;
                    }
                    sum1=sum;
                }
            }
        }
        return ret;
    }
}
