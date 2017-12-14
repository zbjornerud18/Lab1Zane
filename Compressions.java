import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Compressions {


    public String disemvowel(String user){
        if(user == null){
            return user;
        }
        else{
            String novowel = new String();
            for (int i = 0; i < user.length(); i ++){
                if(user.charAt(i) != 'a' || user.charAt(i) !='e' || user.charAt(i) !='i'|| user.charAt(i) != 'o' || user.charAt(i) !='u'){
                    novowel += user.charAt(i);
                }

            }
            return novowel;

        }

    }
    public String compress(String user){
        if(user == null){
            return user;
        }
        else{
            String compressed = new String();
            int index = 1;
            for (int j = 0; j < user.length(); j++){
                if(user.charAt(j) == user.charAt(j+1)){
                    index ++;
                }
                else{
                    compressed += user.charAt(j) + " " + index;
                    index = 1;
                    //weve stopped a run
                    //add current run (char and index) to the output
                    //index = 1
                }
            }
            for (int i = 0; i < user.length(); i ++){
                if(user.charAt(i) != user.charAt(i+1)){
                    compressed += user.charAt(i);

                }
            }
            return compressed;
        }

    }
    public ArrayList dictionaryCompress(ArrayList user){
        if(user == null){
            return user;
        }
        else{

        }
        return user;
    }

}
