/* problem url: https://www.hackerrank.com/challenges/simple-addition-varargs */
class Add {
    public void add(int ... input) {
        String result = join(input) + "=" + sum(input);
        System.out.println(result);
    }
    
    private int sum(int[] values) {
        int total = 0;
        for(Integer value : values) {
            total += value;
        }
        return total;
    }
    
    private String join(int ... pieces) {
        StringBuilder sb = new StringBuilder();
        for(int piece : pieces) {
            if(sb.length() != 0) {
                sb.append("+");
            }
            sb.append(piece);
        }
        return sb.toString();
    }
}
