public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        long k=sc.nextLong(),count=0;sc.close();
        HashMap<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            long arg=ns[i]%k;
            map.put(arg, map.getOrDefault(arg, 0)+1);
        }
        //System.out.println(map);
        for(long i:map.keySet()){
            if(i==0 || 2*i==k){
                count+=map.get(i)*(map.get(i)-1)/2;
            }
            else{
                if(map.containsKey(k-i) && k-i>i){
                    count+=map.get(i)*map.get(k-i);
                }
            }
            //System.out.println(count);
        }
        System.out.println(count);
    }
