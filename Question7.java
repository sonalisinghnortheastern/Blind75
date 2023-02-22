public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        StringBuilder finalValue= new StringBuilder();
        for(String str:strs){
            String val = str.length()+"#"+str;
            finalValue.append(val);
        }
        return finalValue.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
       int i=0;
       List<String> allValue= new ArrayList<>();
       while(i<str.length()){
           int j=i;
           while(str.charAt(j)!="#") j++;
           int number= Integer.valueOf(str.subString(i,j));
            String val=str.subString(j+1,j+1+number);
            i=j+1+number;
            allValue.add(val);
       }
       return allValue;
    }
}
