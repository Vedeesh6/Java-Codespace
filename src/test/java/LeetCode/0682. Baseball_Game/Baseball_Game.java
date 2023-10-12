class Baseball_Game {
    public int calPoints(String[] operations) {
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<operations.length; i++){
            if(Character.isDigit(operations[i].charAt(0))){
                al.add(Integer.parseInt(operations[i]));
            }
            else if(operations[i].charAt(0)=='-'){
                al.add(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("C")){
                al.remove(al.size()-1);
            }
            else if(operations[i].equals("D")){
                al.add(al.get(al.size()-1)*2);
            }
            else if(operations[i].equals("+")){
                al.add(al.get(al.size()-1)+al.get(al.size()-2));
            }
        }
        for(int i: al){
            sum += i;
        }
        return sum;
    }
}
