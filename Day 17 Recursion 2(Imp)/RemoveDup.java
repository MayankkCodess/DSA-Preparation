public class RemoveDup {

    public static void removeDuplicates(String str,int idx,StringBuilder newStr,Boolean map[]){
        //Base case
        if(idx ==str.length()){
            System.out.println(newStr);
            return;
          }
    
          //Kaam
          char currChar = str.charAt(idx);
          if(map[currChar-'a'] == true){
            //Duplicate
            removeDuplicates(str,idx +1 ,newStr, map);
          }else {
            map[currChar -'a'] =true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
          }
        }
    
    public static void main(String args[]){
      String str = "appnnacollege";
     System.out.println(removeDuplicates(str0,new StringBuilder(""),new boolean[26]));
}
}