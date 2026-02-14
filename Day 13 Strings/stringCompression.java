public class stringCompression {

    public static String stringCompressionn(String str){
        String newStr = "";
        //aaabc 
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
              count++ ; 
              i++; 

            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(stringCompressionn(str));
    }
}


public static int shortestPath(String path){
     int x = 0 , y = 0;
     for(int i=0;i<path.length();i++){
        if(path.charAt(i)== 'S'){
            y--;
        }else if(path.charAt(i)=='N'){
            y++;
        }
     }
}

public static String compressedString(String str){
    StringBuilder sb = new StringBuilder("");
    sb.append(str.charAt(0));
    int count = 1;
    for(int i = 1;i<str.length();i++){
         if(str.charAt(i))
    }
}