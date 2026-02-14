public class Classroom {
    public static void findPermutation(String str , String ans){
        //base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void findSubsets(String str , String ans , int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
               System.out.println(ans);
            }
        return ;
        }
        //Yes Choice 
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        // findSubsets(str, "", 0);
        findPermutation(str, "");
    }
}
